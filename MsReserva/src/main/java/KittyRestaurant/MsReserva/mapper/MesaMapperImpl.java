package KittyRestaurant.MsReserva.mapper;

import java.util.ArrayList;
import java.util.List;

import KittyRestaurant.MsReserva.dto.MesaDTO;
import KittyRestaurant.MsReserva.dto.MesaRequest;
import KittyRestaurant.MsReserva.model.MesaModel;




public class MesaMapperImpl implements MesaMapper {
    
    @Override
    public MesaModel RequestToModel(MesaRequest req) {
        if ( req == null ) {
            return null;
        }
        MesaModel model = new MesaModel();
        model.id_mesa = req.getIdMesa();
        model.capacidad=req.getCapacidad();
        model.estado=req.getEstado();
        model.fecha_creacion=req.getFechaCreacion();
        model.usuario_creacion=req.getUsuariocreacion();
        model.fecha_ultima_modificacion=req.getFechaUltimaModificacion();
        model.usuario_ultima_modificacion=req.getUsuarioultimamodificacion();
        model.id_sede=req.getIdsede();
        return model;
    }

     @Override
    public MesaDTO ModelToDto(MesaModel model) {
        if ( model == null ) {
            return null;
        }
        MesaDTO mdto = new MesaDTO(
            model.id_mesa,
            model.capacidad,
            model.estado,
            model.fecha_creacion,
            model.usuario_creacion,
            model.fecha_ultima_modificacion,
            model.usuario_ultima_modificacion,
            model.id_sede
        );
       
        return mdto;
    }

    @Override
    public MesaRequest ModelToRequest(MesaModel mod) {
       if(mod == null){
        return null;
       }
       MesaRequest mreq = new MesaRequest(
            mod.id_mesa,
            mod.capacidad,
            mod.estado,
            mod.fecha_creacion,
            mod.usuario_creacion,
            mod.fecha_ultima_modificacion,
            mod.usuario_ultima_modificacion,
            mod.id_sede
       );
       return mreq;
    }

     @Override
    public List<MesaDTO> ListModelToListDto(List<MesaModel> mod) {
        if(mod == null){
            return null;
        }
        List<MesaDTO> list = new ArrayList<MesaDTO>(mod.size());
        for(MesaModel m : mod){
            list.add(ModelToDto(m));
        }

        return list;
    }

}
