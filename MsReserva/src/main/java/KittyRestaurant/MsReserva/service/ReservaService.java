package KittyRestaurant.MsReserva.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import KittyRestaurant.MsReserva.model.ReservaModel;
import KittyRestaurant.MsReserva.repository.IReservaRepository;
import jakarta.persistence.EntityNotFoundException;

@Service
public class ReservaService {
    
    @Autowired
    IReservaRepository reservaRepository;

    public List<ReservaModel> getAll(){
        return (List<ReservaModel>) reservaRepository.findAll();
    }

    public Optional<ReservaModel> getById(int id){
        return reservaRepository.findById(id);
    }

    public ReservaModel create(ReservaModel model){
         return reservaRepository.save(model);
    }

    public ReservaModel update(ReservaModel model){
        return reservaRepository.findById(model.idReserva)
        .map(antiguoModelo -> {
            antiguoModelo.setCantidadPersona(model.cantidadPersona);
            antiguoModelo.setFechaHora(model.fechaHora);
            antiguoModelo.setDescripcion(model.descripcion);
            antiguoModelo.setEstado(model.estado);
            antiguoModelo.setNumeroContacto(model.numeroContacto);
            antiguoModelo.setNombreContacto(model.nombreContacto);
            return reservaRepository.save(antiguoModelo);
        })
        .orElseThrow();
   }

   public boolean delete(int id){
    try {
        Optional<ReservaModel> m = reservaRepository.findById(id);
        if(m.isEmpty()){
            throw new Exception();
        }
        reservaRepository.deleteById(id);
        return true;
    } catch (Exception e) {
        return false;
    }
   }
}
