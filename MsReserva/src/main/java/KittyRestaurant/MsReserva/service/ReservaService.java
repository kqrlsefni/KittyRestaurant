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
        .map(existingModel -> {
            existingModel.setCantidadPersona(model.cantidadPersona);
            existingModel.setFechaHora(model.fechaHora);
            existingModel.setDescripcion(model.descripcion);
            existingModel.setEstado(model.estado);
            existingModel.setNumeroContacto(model.numeroContacto);
            existingModel.setNombreContacto(model.nombreContacto);
            return reservaRepository.save(existingModel);
        })
        .orElseThrow(() -> new EntityNotFoundException("No se encontró la reserva con ID: " + model.idReserva));
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
