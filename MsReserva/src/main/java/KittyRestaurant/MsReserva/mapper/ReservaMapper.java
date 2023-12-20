package KittyRestaurant.MsReserva.mapper;

import java.util.Optional;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import KittyRestaurant.MsReserva.dto.ReservaDTO;
import KittyRestaurant.MsReserva.dto.ReservaRequest;
import KittyRestaurant.MsReserva.model.ReservaModel;

@Mapper
public interface ReservaMapper {
    ReservaMapper INSTANCE = Mappers.getMapper( ReservaMapper.class );

    @Mapping(source = "idReserva", target = "idReserva")
    @Mapping(source = "cantidadPersona", target = "cantidadPersona")
    @Mapping(source = "fechaHora", target = "fechaHora")
    @Mapping(source = "descripcion", target = "descripcion")
    @Mapping(source = "estado", target = "estado")
    @Mapping(source = "numeroContacto", target = "numeroContacto")
    @Mapping(source = "nombreContacto", target = "nombreContacto")
    @Mapping(source = "usuarioCreacion", target = "usuarioCreacion")
    @Mapping(source = "fechaCreacion", target = "fechaCreacion")
    @Mapping(source = "usuarioUltimaModificacion", target = "usuarioUltimaModificacion")
    @Mapping(source = "fechaUltimaModificacion", target = "fechaUltimaModificacion")
    @Mapping(source = "idMesa", target = "idMesa")
    ReservaModel ReserservaRequestlToReservaModel(ReservaRequest req);

    @Mapping(source = "idReserva", target = "idReserva")
    @Mapping(source = "cantidadPersona", target = "cantidadPersona")
    @Mapping(source = "fechaHora", target = "fechaHora")
    @Mapping(source = "descripcion", target = "descripcion")
    @Mapping(source = "estado", target = "estado")
    @Mapping(source = "numeroContacto", target = "numeroContacto")
    @Mapping(source = "nombreContacto", target = "nombreContacto")
    ReservaDTO ReservaModelToReservaDTO(ReservaModel reservaModel);
}
