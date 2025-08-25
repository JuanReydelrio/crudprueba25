package com.example.crudprueba25;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {
	
    @Autowired
    private ClienteRepository clienteRepository;
	
    // Obtener todos los clientes
    public List<Cliente> getClientes() {
        return clienteRepository.findAll();
    }
	
    // Obtener un cliente por documento (ID)
    public Optional<Cliente> getCliente(String numeroDocumento) {
        return clienteRepository.findById(numeroDocumento);
    }
	
    // Guardar o actualizar un cliente
    public void saveOrUpdate(Cliente cliente) {
        clienteRepository.save(cliente);
    }
	
    // Eliminar un cliente
    public void delete(String numeroDocumento) {
        clienteRepository.deleteById(numeroDocumento);
    }
}
