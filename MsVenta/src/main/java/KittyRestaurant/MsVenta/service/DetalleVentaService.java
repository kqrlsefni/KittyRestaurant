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
            DetalleVentaModel detalleVentaActualizado = DetalleVentaExistente.get();
            detalleVentaActualizado.setIdVenta(detalleventa.getIdVenta());
            detalleVentaActualizado.setCantidad(detalleventa.getCantidad());
            detalleVentaActualizado.setPrecio(detalleventa.getPrecio());
            detalleVentaActualizado.setIdPedido(detalleventa.getIdPedido());
            detalleVentaActualizado.setIdPlatilloDiario(detalleventa.getIdPlatilloDiario());
            return detalleVentaRepository.save(detalleVentaActualizado);
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