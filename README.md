📋 Dia 3 - Gestor de Tareas

🚀 Descripción

Este proyecto es un gestor de tareas en consola desarrollado en Java.
Permite añadir, listar y eliminar tareas de manera interactiva.
Ahora incluye persistencia en archivo (tareas.txt), lo que significa que las tareas se guardan y se cargan automáticamente cada vez que se ejecuta el programa.

🧱 Funcionalidades

- Añadir tareas ➝ El usuario puede introducir nuevas tareas, tantas como desee.
- Listar tareas ➝ Muestra todas las tareas numeradas desde 1.
- Eliminar tareas ➝ Permite borrar tareas con confirmación previa.
- Persistencia en archivo ➝ Las tareas se guardan en tareas.txt y se cargan al iniciar el programa.
- Salir ➝ Finaliza la ejecución del gestor.

📂 Persistencia en archivo

- Al añadir o eliminar una tarea, se actualiza automáticamente el archivo tareas.txt.
- Al iniciar el programa, se cargan las tareas desde ese archivo.
- Si el archivo no existe, se crea uno nuevo.

🧠 Aprendizajes clave

- Uso de ArrayList para manejar listas dinámicas.
- Implementación de un menú interactivo con switch.
- Validación de índices y entradas para evitar errores.
- Manejo de archivos en Java con FileWriter y Scanner.
- Integración de métodos auxiliares (guardarTareas, cargarTareas) dentro de la misma clase.

▶️ Ejemplo de uso

¡Bienvenido al gestor de tareas!
1 - Añadir nueva tarea
2 - Lista de tareas
3 - Eliminar tarea
4 - Salir
Elija una opción:


- Añadir tarea:
---------------Introducir nueva tarea---------------
Introduzca la nueva tarea o 'SALIR' para salir:
✅ ¡Nueva tarea (Estudiar Java) añadida con éxito!


- Listar tareas:
📋 Lista de tareas:
1 - Estudiar Java
2 - Hacer README


- Eliminar tarea:
---------------Eliminar tarea---------------
Estas son tus tareas:
1 - Estudiar Java
2 - Hacer README
Introduce el número de la tarea a eliminar o 'SALIR' para salir:
¿Está seguro de que quiere eliminar esta tarea?
👉 Estudiar Java
🗑️ Tarea eliminada.


📌 Próximos pasos

- Añadir opción para marcar tareas como completadas (✅).
- Mejorar la interfaz con colores o iconos adicionales.
