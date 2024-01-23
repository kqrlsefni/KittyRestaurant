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

import KittyRestaurant.MsVenta.model.VentaModel;
import KittyRestaurant.MsVenta.service.VentaService;




@RestController
@RequestMapping("/api/venta")
public class VentaController {

    @Autowired
    VentaService ventaService;

    @PostMapping("/create")
    public VentaModel create(@RequestBody VentaModel venta) {
                return ventaService.create(venta);
    }
    
    @GetMapping("getById/{id}")
    public Optional<VentaModel> getById(@PathVariable int IdVenta) {
        return ventaService.getById(IdVenta);
    }

    @PutMapping("update")
    public ResponseEntity <VentaModel> updateVenta(@RequestBody VentaModel venta) {
        VentaModel ventaActualizada = ventaService.update(venta);

        if(ventaActualizada !=null){
            return new ResponseEntity<>(HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping(path="/{id}")
    public String eliminarPorId(@PathVariable("id") int id){
        boolean ok= this.ventaService.eliminarVenta(id);
        
        if(ok){
            return "Se elimino la venta con id "+ id;

        }else{
            return "No se pudo eliminar la venta con id"+ id;
        }
    }
}
