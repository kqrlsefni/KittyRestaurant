package KittyRestaurant.MsVenta.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import KittyRestaurant.MsVenta.model.DetalleVentaModel;
import KittyRestaurant.MsVenta.service.DetalleVentaService;




@RestController
@RequestMapping("/api/deatlleventa")
public class DetalleVentaController {

    @Autowired
    DetalleVentaService detalleVentaService;

    @PostMapping("/create")
    public DetalleVentaModel create(@RequestBody DetalleVentaModel detalleventa) {
                return detalleVentaService.create(detalleventa);
    }
    
    @GetMapping("getById/{id}")
    public Optional<DetalleVentaModel> getById(@PathVariable int IdDetalleVenta) {
        return detalleVentaService.getById(IdDetalleVenta);
    }

    @PutMapping("update")
    public ResponseEntity <DetalleVentaModel> updateVenta(@RequestBody DetalleVentaModel detalleventa) {
        DetalleVentaModel detalleVentaActualizada = detalleVentaService.update(detalleventa);

        if(detalleVentaActualizada !=null){
            return new ResponseEntity<>(HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping(path="/{id}")
    public String eliminarPorId(@PathVariable("id") int id){
        boolean ok= this.detalleVentaService.eliminarDetalleVenta(id);
        
        if(ok){
            return "Se elimino el detalle de venta con id "+ id;

        }else{
            return "No se pudo eliminar el detalle de venta con id"+ id;
        }
    }
}
