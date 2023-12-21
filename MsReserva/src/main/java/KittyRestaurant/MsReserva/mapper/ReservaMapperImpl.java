package KittyRestaurant.MsReserva.mapper;

import java.util.ArrayList;
import java.util.List;

import KittyRestaurant.MsReserva.dto.ReservaDTO;
import KittyRestaurant.MsReserva.dto.ReservaRequest;
import KittyRestaurant.MsReserva.model.ReservaModel;

public class ReservaMapperImpl implements ReservaMapper {

    @Override
    public ReservaModel RequestToModel(ReservaRequest req) {
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
    public ReservaDTO ModelToDto(ReservaModel model) {
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

    @Override
    public ReservaRequest ModelToRequest(ReservaModel mod) {
       if(mod == null){
        return null;
       }
       ReservaRequest req = new ReservaRequest(
            mod.idReserva,
            mod.cantidadPersona,
            mod.fechaHora,
            mod.descripcion,
            mod.estado,
            mod.numeroContacto,
            mod.nombreContacto,
            mod.usuarioCreacion,
            mod.fechaCreacion,
            mod.usuarioUltimaModificacion,
            mod.fechaUltimaModificacion,
            mod.idMesa
       );
       return req;
    }

    @Override
    public List<ReservaDTO> ListModelToListDto(List<ReservaModel> mod) {
        if(mod == null){
            return null;
        }
        List<ReservaDTO> list = new ArrayList<ReservaDTO>(mod.size());
        for(ReservaModel m : mod){
            list.add(ModelToDto(m));
        }

        return list;
    }

   
}
