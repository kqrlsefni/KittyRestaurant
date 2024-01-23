package KittyRestaurant.MsVenta.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import KittyRestaurant.MsVenta.model.VentaModel;
import KittyRestaurant.MsVenta.repository.IVentaRepository;

@Service
public class VentaService {

    @Autowired
    IVentaRepository ventaRepository;

    public VentaModel create(VentaModel venta){
        return ventaRepository.save(venta);
    }

    public Optional<VentaModel> getById(int IdVenta){
        return ventaRepository.findById(IdVenta);
    }

    public VentaModel update(VentaModel venta){
        Optional<VentaModel>VentaExistente =ventaRepository.findById(venta.getIdVenta());

        if(VentaExistente.isPresent()){
            VentaModel ventaActualizada = VentaExistente.get();
            ventaActualizada.setTipoComprobante(venta.getTipoComprobante());
            ventaActualizada.setMontoPagar(venta.getMontoPagar());
            ventaActualizada.setNumeroDeDocumento(venta.getNumeroDeDocumento());
            ventaActualizada.setFecha(venta.getFecha());
            ventaActualizada.setMedioDePago(venta.getMedioDePago());
            ventaActualizada.setFechaCreacion(venta.getFechaCreacion());
            ventaActualizada.setUsuarioCreacion(venta.getUsuarioCreacion());
            ventaActualizada.setUltimaFechaModificacion(venta.getUltimaFechaModificacion());
            ventaActualizada.setUltimoUsuarioModificacion(venta.getUltimoUsuarioModificacion());
            return ventaRepository.save(ventaActualizada);
        }else{
            return null;
        }
    }

    public boolean eliminarVenta(int IdVenta){
        try{
            ventaRepository.deleteById(IdVenta);
            return true;
        }catch(Exception arr){
            return false;
        }
    }
}
