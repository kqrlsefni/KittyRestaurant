package KittyRestaurant.MsReserva.mapper;

import KittyRestaurant.MsReserva.dto.ReservaDTO;
import KittyRestaurant.MsReserva.dto.ReservaRequest;
import KittyRestaurant.MsReserva.model.ReservaModel;

public class ReservaMapperImpl implements ReservaMapper {

    @Override
    public ReservaModel ReserservaRequestlToReservaModel(ReservaRequest req) {
        if ( req == null ) {
            return null;
        }
        ReservaModel model = new ReservaModel();
        model.idReserva = req.getIdReserva();
        model.cantidadPersona = req.getCantidadPersona();
        model.fechaHora = req.getFechaHora();
        model.descripcion = req.getDescripcion();
        model.estado = req.getEstado();
        model.numeroContacto = req.getNumeroContacto();
        model.nombreContacto = req.getNombreContacto();
        model.usuarioCreacion = req.getUsuarioCreacion();
        model.fechaCreacion = req.getFechaCreacion();
        model.usuarioUltimaModificacion = req.getUsuarioUltimaModificacion();
        model.fechaUltimaModificacion = req.getFechaUltimaModificacion();
        model.idMesa = req.getIdMesa();
        return model;
    }

    @Override
    public ReservaDTO ReservaModelToReservaDTO(ReservaModel model) {
        if ( model == null ) {
            return null;
        }
        ReservaDTO rdto = new ReservaDTO(
            model.idReserva,
            model.cantidadPersona,
            model.fechaHora,
            model.descripcion,
            model.estado,
            model.numeroContacto,
            model.nombreContacto
        );
       
        return rdto;
    }
    
}
