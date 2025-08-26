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



## Pruebas de los Endpoints de Cliente

### 1. Obtener todos los clientes
**Endpoint:** `GET /api/v1/clientes`  

![Buscar todos los clientes](https://github.com/user-attachments/assets/0d2f6110-9136-41be-9d35-b1576163e7af)

> Este endpoint devuelve la lista completa de clientes registrados en la base de datos.

---

### 2. Crear un cliente
**Endpoint:** `POST /api/v1/clientes`  

![Crear cliente](https://github.com/user-attachments/assets/3a19a670-2e65-46a2-8962-8edff079f9f0)

> Envía un objeto JSON con los datos del cliente. Si el número de documento no existe, se crea un nuevo registro.

---

### 3. Buscar un cliente por ID
**Endpoint:** `GET /api/v1/clientes/{numeroDocumento}`  

![Buscar cliente x id 1](https://github.com/user-attachments/assets/75d02beb-b566-4dc0-ba45-d358cdd20a1b)  
![Buscar cliente x id 2](https://github.com/user-attachments/assets/dec538e0-cfbb-4fd2-b21e-6522a846b462)

> Reemplaza `{numeroDocumento}` por el documento del cliente que deseas consultar. Devuelve los datos del cliente si existe.

---

### 4. Actualizar un cliente
**Endpoint:** `POST /api/v1/clientes`  

![Actualizar cliente](https://github.com/user-attachments/assets/37e1b03f-917b-4293-8083-4cd3f7042bc5)

> Se puede actualizar un cliente enviando un JSON con el mismo número de documento pero con datos modificados.  
> En este ejemplo, se cambió el nombre de “Juan” a “José”.

---

### 5. Eliminar un cliente
**Endpoint:** `DELETE /api/v1/clientes/{numeroDocumento}`  

![Eliminar cliente 1](https://github.com/user-attachments/assets/99a1d47e-a8a8-40fd-b13b-e2931277965a)  
![Eliminar cliente 2](https://github.com/user-attachments/assets/bf91f760-9a75-4de7-8117-993beaa44c24)

> Reemplaza `{numeroDocumento}` por el documento del cliente que deseas eliminar. El registro se elimina de la base de datos.

 
 

