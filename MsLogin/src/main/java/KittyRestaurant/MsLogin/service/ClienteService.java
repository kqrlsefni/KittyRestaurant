package KittyRestaurant.MsLogin.service;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import KittyRestaurant.MsLogin.model.ClienteModel;
import KittyRestaurant.MsLogin.repository.IClienteRepository;

@Service
public class ClienteService {
    @Autowired
    IClienteRepository clienteRepository;

    public ClienteModel create(ClienteModel cliente){
        return clienteRepository.save(cliente);
    }

    public Optional<ClienteModel> getById(int IdCliente){
        return clienteRepository.findById(IdCliente);
    }

    public ClienteModel update(ClienteModel cliente){
        Optional<ClienteModel>ClienteExistente =clienteRepository.findById(cliente.getIdCliente());

        if(ClienteExistente.isPresent()){
            ClienteModel clienteActualizado = ClienteExistente.get();
            clienteActualizado.setNombre(cliente.getNombre());
            clienteActualizado.setApellido(cliente.getApellido());
            clienteActualizado.setTipoDeDocumento(cliente.getTipoDeDocumento());
            clienteActualizado.setNumeroDeDocumento(cliente.getNumeroDeDocumento());
            clienteActualizado.setCorreo(cliente.getCorreo());
            clienteActualizado.setFechaCreacion(cliente.getFechaCreacion());
            clienteActualizado.setUsuarioCreacion(cliente.getUsuarioCreacion());
            clienteActualizado.setUltimaFechaModificacion(cliente.getUltimaFechaModificacion());
            clienteActualizado.setUltimoUsuarioModificacion(cliente.getUltimoUsuarioModificacion());
            return clienteRepository.save(clienteActualizado);
        }else{
            return null;
        }
    }

    public boolean eliminarCliente(int IdCliente){
        try{
            clienteRepository.deleteById(IdCliente);
            return true;
        }catch(Exception arr){
            return false;
        }
    }
}
