# 🚀 Proyecto: Caché y Patrón Proxy con Spring Boot + React

## 📌 Descripción

Este proyecto consiste en el desarrollo de una aplicación fullstack que implementa principios de diseño de software enfocados en la **optimización del rendimiento y la escalabilidad**.

Se desarrolló un **backend en Spring Boot** que incorpora mecanismos de **caché** y el **patrón de diseño Proxy**, junto con un **frontend en React** para interactuar con la API REST.

---

## 🧠 Objetivos cumplidos

* Aplicar principios de diseño en sistemas escalables
* Implementar caché para mejorar el rendimiento
* Implementar el patrón Proxy para control de acceso
* Desarrollar una API REST funcional
* Consumir la API mediante un frontend
* Resolver problemas de CORS en desarrollo
* Versionar el proyecto con Git y publicarlo en GitHub

---

## ⚙️ Tecnologías utilizadas

### Backend

* Java
* Spring Boot
* Spring Data JPA
* H2 Database
* Spring Cache

### Frontend

* React
* Fetch API
* CSS

---

## 🧱 Arquitectura del proyecto

```
mi-proyecto/
 ├── backend/
 ├── frontend/
 └── README.md
```

---

## 🔥 Funcionalidades principales

### 📌 API REST

* `GET /usuarios` → Listar usuarios (con caché)
* `POST /usuarios` → Crear usuario
* `GET /usuarios/proxy` → Probar patrón Proxy

---

### ⚡ Implementación de Caché

Se utilizó la anotación:

```java
@Cacheable("usuarios")
```

Esto permite almacenar en memoria los resultados de consultas frecuentes, reduciendo el acceso repetitivo a la base de datos y mejorando la latencia del sistema.

---

### 🧱 Implementación del Patrón Proxy

Se implementó un proxy que actúa como intermediario entre el controlador y el servicio real, permitiendo:

* Controlar el flujo de ejecución
* Agregar lógica adicional (logs)
* Simular capas intermedias en sistemas distribuidos

---

### 🌐 Configuración de CORS

Se configuró CORS globalmente para permitir la comunicación entre el frontend (React) y el backend (Spring Boot) durante el desarrollo.

---

### 🎨 Frontend

El frontend permite:

* Crear usuarios
* Listar usuarios
* Probar el endpoint del proxy

Se conecta al backend mediante `fetch` hacia `http://localhost:8080`.

---

## 🚀 Cómo ejecutar el proyecto

### 🔹 Backend

```bash
cd backend
mvn spring-boot:run
```

---

### 🔹 Frontend

```bash
cd frontend
npm install
npm start
```

---

## 🧪 Pruebas

Puedes usar:

* Navegador
* Postman

Ejemplo:

```bash
GET http://localhost:8080/usuarios
```

---

## 📈 Resultados

* Se redujo la carga en la base de datos gracias al uso de caché
* Se mejoró la estructura del sistema mediante separación de responsabilidades
* Se simuló un entorno escalable con patrones de diseño
* Se logró comunicación efectiva entre frontend y backend

---

## 🧠 Conclusión

El proyecto demuestra cómo aplicar principios de diseño de software en aplicaciones reales, mejorando el rendimiento y la mantenibilidad del sistema mediante el uso de caché y patrones de diseño como Proxy.

---

## 👨‍💻 Autor

Proyecto desarrollado como parte de la materia:
**Diseño y Arquitectura de Software**
