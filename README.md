# Explorando los Microservicios con Apache Kafka y Spring Boot

Este proyecto se presenta como un recurso introductorio diseñado para facilitar la comprensión de los principios fundamentales de los microservicios mediante la utilización del framework Spring Boot. En su esencia, el proyecto está compuesto por dos microservicios independientes: SpringBootProvider y SpringBootConsumer.

Aquí, nos aventuramos a explorar la arquitectura de microservicios, aprovechando la robustez de Apache Kafka como sistema de mensajería para la comunicación eficiente entre estos componentes autónomos. Estos microservicios encapsulan funcionalidades específicas, brindando una visión práctica de cómo se pueden estructurar y comunicar estos elementos en un entorno de desarrollo moderno.

## SpringBootProvider

El microservicio SpringBootProvider actúa como un proveedor de mensajes utilizando Apache Kafka. Utiliza Kafka para enviar mensajes a un tema (topic) específico, brindando así una interfaz para que otros microservicios consuman estos mensajes.

### Configuración
- Configuración de Kafka para la producción de mensajes.
- Definición de un tema en Kafka para la comunicación.

## SpringBootConsumer

El microservicio SpringBootConsumer actúa como un consumidor de mensajes desde el mismo tema de Kafka. Escucha continuamente el tema y procesa los mensajes recibidos.

### Configuración
- Configuración de Kafka para el consumo de mensajes.
- Definición del grupo de consumidores para la gestión de la suscripción.

## Uso

1. **Iniciar SpringBootProvider:**
    - Ejecutar la aplicación SpringBootProvider para comenzar la producción de mensajes.

2. **Iniciar SpringBootConsumer:**
    - Ejecutar la aplicación SpringBootConsumer para comenzar a consumir los mensajes del tema.


## Demostración de mensajería entre microservicios con Postman
### Enviar un mensaje desde el proveedor:
   1. Abre Postman.
   2. Selecciona el método POST.
   3. Ingresa la URL del proveedor: http://localhost:8080/provider/send-message 
   4. Selecciona la pestaña Body.
   5. Ingresa el mensaje en el cuerpo de la solicitud, por ejemplo, usando el formato raw y escribiendo el mensaje en formato de texto.
   6. Haz clic en el botón Send.
   7. Esto enviará un mensaje al proveedor a través de la API REST.

   ![Postman - request microservicio Provider](/images/postman-provider.png)

### Consumir el mensaje en el consumidor:
   1. Abre Postman.
   2. Selecciona el método GET.
   3. Ingresa la URL del consumidor: http://localhost:8081/consumer/consume-message 
   4. Haz clic en el botón Send.
   5. Esto debería activar el método de consumo en el consumidor y mostrar la respuesta.

   ![Postman - request microservicio Consumer](/images/postman-consumer.png)


