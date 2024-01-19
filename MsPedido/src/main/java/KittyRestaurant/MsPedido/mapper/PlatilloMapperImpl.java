package KittyRestaurant.MsPedido.mapper;

import java.util.ArrayList;
import java.util.List;

import KittyRestaurant.MsPedido.dto.PlatilloDTO;
import KittyRestaurant.MsPedido.dto.PlatilloRequest;
import KittyRestaurant.MsPedido.model.PlatilloModel;

public class PlatilloMapperImpl implements PlatilloMapper{

    @Override
    public PlatilloModel RequestToModel(PlatilloRequest req) {
        if(req == null){
            return null;
        }

        PlatilloModel model =new PlatilloModel();
        model.idPlatillo = req.getIdPlatillo();
        model.nombre = req.getNombre();
        model.precio= req.getPrecio();
        model.cantidadDisponible=req.getCatidadDisponible();
        model.categoria=req.getCategoria();
        model.fechaCreacion=req.getFechaCreacion();
        model.usuarioCreacion=req.getUsuarioCreacion();
        model.ultimaFechaModificacion=req.getUltimaFechaModificacion();
        model.ultimoUsuarioModificacion=req.getUltimoUsuarioModificacio();
        return model;
    }

    @Override
    public PlatilloRequest ModelToRequest(PlatilloModel mod) {
        if(mod == null){
            return null;
        }
        PlatilloRequest req= new PlatilloRequest(
            mod.idPlatillo,
            mod.nombre,
            mod.precio,
            mod.cantidadDisponible,
            mod.categoria,
            mod.fechaCreacion,
            mod.usuarioCreacion,
            mod.ultimaFechaModificacion,
            mod.ultimoUsuarioModificacion
            );
            return req;
    }

    @Override
    public PlatilloDTO ModelToDto(PlatilloModel mod) {
        if(mod == null){
            return null;
        }
        PlatilloDTO pdto= new PlatilloDTO(
            mod.idPlatillo,
            mod.nombre,
            mod.precio,
            mod.cantidadDisponible,
            mod.categoria,
            mod.fechaCreacion,
            mod.usuarioCreacion,
            mod.ultimaFechaModificacion,
            mod.ultimoUsuarioModificacion
            );
            return pdto;
    }

    @Override
    public List<PlatilloDTO> ListModelToListDto(List<PlatilloModel> mod) {
       if(mod == null){
            return null;
        }
        List<PlatilloDTO> list = new ArrayList<PlatilloDTO>(mod.size());
        for(PlatilloModel m : mod){
            list.add(ModelToDto(m));
        }

        return list;
    }
    
}
