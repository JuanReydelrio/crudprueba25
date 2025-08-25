package com.example.crudprueba25;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "api/v1/clientes")
public class ClienteController {
	
    @Autowired
    private ClienteService clienteService;
	
    // Obtener todos los clientes
    @GetMapping
    public List<Cliente> getAll() {
        return clienteService.getClientes();
    }
	
    // Obtener un cliente por número de documento
    @GetMapping("/{numeroDocumento}")
    public Optional<Cliente> getById(@PathVariable("numeroDocumento") String numeroDocumento) {
        return clienteService.getCliente(numeroDocumento);
    }
	
    // Crear o actualizar un cliente
    @PostMapping
    public void saveOrUpdate(@RequestBody Cliente cliente) {
        clienteService.saveOrUpdate(cliente);
    }
	
    // Eliminar un cliente
    @DeleteMapping("/{numeroDocumento}")
    public void delete(@PathVariable("numeroDocumento") String numeroDocumento) {
        clienteService.delete(numeroDocumento);
    }
}
