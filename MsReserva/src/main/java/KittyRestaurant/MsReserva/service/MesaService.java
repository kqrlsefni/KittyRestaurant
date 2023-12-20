package KittyRestaurant.MsReserva.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import KittyRestaurant.MsReserva.model.MesaModel;
import KittyRestaurant.MsReserva.repository.IMesaRepository;

@Service
public class MesaService {
   
    
    @Autowired
    IMesaRepository mesaRepository;

    public MesaModel create(MesaModel mesa) {
        try {
            return mesaRepository.save(mesa);
        } catch (Exception e) {
            e.printStackTrace(); 
            return null;
        }
    }

    public Optional<MesaModel> getById(int id){
        try{
            return mesaRepository.findById(id);
    }catch (Exception e) {
            e.printStackTrace(); 
            return null;
        }}

    }
