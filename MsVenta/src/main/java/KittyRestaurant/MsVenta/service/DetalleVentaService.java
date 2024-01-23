package KittyRestaurant.MsVenta.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import KittyRestaurant.MsVenta.model.DetalleVentaModel;
import KittyRestaurant.MsVenta.repository.IDetalleVentaRepository;

@Service
public class DetalleVentaService {

    @Autowired
    IDetalleVentaRepository detalleVentaRepository;

    public DetalleVentaModel create(DetalleVentaModel detalleventa){
        return detalleVentaRepository.save(detalleventa);
    }

    public Optional<DetalleVentaModel> getById(int IdDetalleVenta){
        return detalleVentaRepository.findById(IdDetalleVenta);
    }

    public DetalleVentaModel update(DetalleVentaModel detalleventa){
        Optional<DetalleVentaModel>DetalleVentaExistente =detalleVentaRepository.findById(detalleventa.getIdDetalleVenta());

        if(DetalleVentaExistente.isPresent()){
            DetalleVentaModel detalleVentaActualizada = DetalleVentaExistente.get();
            detalleVentaActualizada.setIdVenta(detalleventa.getIdVenta());
            detalleVentaActualizada.setCantidad(detalleventa.getCantidad());
            detalleVentaActualizada.setPrecio(detalleventa.getPrecio());
            detalleVentaActualizada.setIdPedido(detalleventa.getIdPedido());
            detalleVentaActualizada.setIdPlatilloDiario(detalleventa.getIdPlatilloDiario());
            return detalleVentaRepository.save(detalleVentaActualizada);
        }else{
            return null;
        }
    }

    public boolean eliminarDetalleVenta(int IdDetalleVenta){
        try{
            detalleVentaRepository.deleteById(IdDetalleVenta);
            return true;
        }catch(Exception arr){
            return false;
        }
    }
}
