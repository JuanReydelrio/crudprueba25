# Proyecto API de Gestión de Clientes

Este proyecto es una API REST desarrollada en **Java Spring Boot** con **Maven**, que permite la gestión de clientes. La API permite realizar operaciones CRUD (crear, leer, actualizar y eliminar) sobre la entidad **Cliente**, la cual incluye información relevante como documento, nombres, apellidos, razón social, dirección, correo y más.
Se eligio el tema para aprender y poder integrarlo a futuro en la empresa familiar.
---

## 🛠️ Tecnologías utilizadas
- Java 17
- Spring Boot
- Maven
- JPA/Hibernate
- Base de datos MySQL
- Postman (para pruebas de los endpoints)

---

## 📌 Endpoints disponibles

### 1. Crear cliente
**POST** `/api/clientes`

Ejemplo de request en **JSON**:
```json
{
  "numeroDocumento": "123456789",
  "tipoDocumento": "CC",
  "digitoVerificacion": "5",
  "tipoContribuyente": "Persona Natural",
  "razonSocial": "N/A",
  "departamento": "Antioquia",
  "ciudad": "Medellín",
  "direccion": "Calle 123 #45-67",
  "correo": "cliente@correo.com",
  "primerNombre": "Juan",
  "segundoNombre": "Diego",
  "primerApellido": "Rey",
  "segundoApellido": "Del Rio"
}
