package KittyRestaurant.MsReserva.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import KittyRestaurant.MsReserva.model.ReservaModel;
import KittyRestaurant.MsReserva.repository.IReservaRepository;

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

//     public ReservaModel update(ReservaModel model){
//         Optional<ReservaModel> fmodelo = reservaRepository.findById(model.idReserva).map(
//             model -> new ReservaModel(

//             ) 
//         );
//         return reservaRepository.save(model);
//    }
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
