package com.example.crudprueba25;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GenerationType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="cliente")
public class  Cliente{
    @Id
    @Column(name = "numero_documento", nullable = false, unique = true)
    private String numeroDocumento;  // Será el ID

    @Column(name = "tipo_documento")
    private String tipoDocumento;

    @Column(name = "digito_verificacion")
    private String digitoVerificacion;

    @Column(name = "tipo_contribuyente")
    private String tipoContribuyente;

    @Column(name = "razon_social")
    private String razonSocial;

    private String departamento;
    private String ciudad;
    private String direccion;
    private String correo;

    @Column(name = "primer_nombre")
    private String primerNombre;

    @Column(name = "segundo_nombre")
    private String segundoNombre;

    @Column(name = "primer_apellido")
    private String primerApellido;

    @Column(name = "segundo_apellido")
    private String segundoApellido;
}