# 📌 Proyecto APX - Inserción de Clientes en Oracle
---

**🚀 Descripción**

Este proyecto implementa un servicio REST para almacenar la información de clientes en una base de datos Oracle, asegurando la integridad de los datos mediante validaciones y restricciones.

---
**📂 Estructura del Proyecto**

**Repositorio Principal: apx-cpnt-pruebaTecnica**

- dtos (DTOS-apx-cpnt-pruebaTecnica)

  - WIKJC268 → Contiene los DTOs para la entrada y salida de datos.

- libraries (LIBRARIES-apx-cpnt-pruebaTecnica)

  - WIKJR268 → Librería principal con interfaces.

  - WIKJR268IMPL → Implementación de las lógicas de negocio.

- transactions (TRANSACTIONS-apx-cpnt-pruebaTecnica)

  -  WIKJT268-01-MX → Transacción encargada de la inserción de datos en Oracle.

**Librería de Negocio: WIKJR269-parent**

- WIKJR269 → Interfaces para la gestión de datos.

- WIKJR269IMPL → Implementaciones de las interfaces.

---
**📌 Requerimientos**

La información se almacena en la tabla:

 ```
CREATE TABLE WIKJ.T_WIKJ_HAB_PRUEBAFINAL (
    id NUMBER(5) PRIMARY KEY,
    nuip NUMBER(10),
    full_name VARCHAR2(50),
    phone VARCHAR2(15),
    address VARCHAR2(30)
);
 ```
---
**🔧 Tecnologías Utilizadas**

- ☕ Java (JAX-RS, JDBC)

- 🐘 Oracle Database

- 🏗 APX CLI (Para generación de componentes)

- 🛠 Maven (Gestor de dependencias)

- 🐳 Docker (Opcional para base de datos local)

- 📬 Postman (Para pruebas de API REST)
- 
- 🖥 IntelliJ IDEA (IDE de desarrollo)

---
**🚀 Instalación y Ejecución**

1. Clona el repositorio:
   ```git clone https://github.com/tuusuario/apx-cpnt-pruebaTecnica.git```
2. Configura la conexión JDBC en application.properties o config.xml.
3. Construye y ejecuta el proyecto con Maven:
   ```mvn clean install```
4. Realiza pruebas en Postman con la siguiente petición:
- URL: http://localhost:7500/TechArchitecture/v2/insertClient

- Método: POST

- Body:

  ```
  {
  "id": 1,
  "nuip": 1234567890,
  "fullName": "Juan Pérez",
  "phone": "5551234567",
  "address": "Calle 123, Ciudad"
  }
  ```
---
**📌 Validaciones Implementadas**

✅ Verifica si el nuip ya existe antes de insertar.

✅ Inserta el registro solo si no hay duplicados.

✅ Devuelve la información insertada o un mensaje de error si el nuip ya está registrado.










