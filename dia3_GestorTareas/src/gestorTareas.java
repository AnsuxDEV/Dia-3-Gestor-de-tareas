import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class gestorTareas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<String> tareas = cargarTareas();

        while (true) {
            System.out.println("\n¡Bienvenido al gestor de tareas!");
            System.out.println("\nSeleccione una de las siguientes opciones");
            System.out.println("1 - Añadir nueva tarea");
            System.out.println("2 - Lista de tareas");
            System.out.println("3 - Eliminar tarea");
            System.out.println("4 - Salir");
            System.out.println("Elija una opcion: ");

            int opcion = teclado.nextInt();
            teclado.nextLine(); //Esto sirve para limpiar el buffer de entrada.

            switch (opcion) {
                case 1:
                    while (true) {
                        System.out.println("---------------Introducir nueva tarea---------------");
                        System.out.println("Introduzca la nueva tarea o introduzca 'SALIR' para salir: ");
                        String nuevaTarea = teclado.nextLine();
                        if (nuevaTarea.equals("SALIR")) break;
                        tareas.add(nuevaTarea);
                        guardarTareas(tareas);
                        System.out.println("✅¡Nueva tarea: " + "(" + nuevaTarea + ")" + " añadida con éxito!");
                    }
                    break;

                case 2:
                    System.out.println("\n \uD83D\uDCCBLista de tareas: ");
                    if (tareas.isEmpty()) {
                        System.out.println("Su lista de tareas esta vacia.");
                    } else {
                        for (int i = 0; i < tareas.size(); i++) {
                            System.out.println((i + 1) + " - " + tareas.get(i));
                        }
                    }
                    break;

                case 3:
                    while (true) {
                        System.out.println("---------------Eliminar tarea---------------");
                        if (tareas.isEmpty()) {
                            System.out.println("No hay tareas que eliminar.");
                            break;
                        } else {
                            System.out.println("Estas son tus tareas.");
                            for (int i = 0; i < tareas.size(); i++) {
                                System.out.println((i + 1) + " - " + tareas.get(i));
                            }
                            ;
                        }
                        System.out.println("Introduzca el indice de la tarea a eliminar o escribe 'SALIR' para salir: ");
                        String entrada = teclado.nextLine();
                        if (entrada.equals("SALIR")) {
                            break;
                        }

                        try {
                            int indice = Integer.parseInt(entrada) - 1;
                            if (indice >= 0 && indice < tareas.size()) {
                                System.out.println("¿Está seguro de que quiere eliminar esta tarea?");
                                System.out.println("\uD83D\uDC49" + tareas.get(indice));
                                System.out.println("Introduzca 's' para SI o 'n' para NO: ");
                                String confirmation = teclado.nextLine().trim().toLowerCase();
                                if (confirmation.equals("s")) {
                                    tareas.remove(indice);
                                    guardarTareas(tareas);
                                    System.out.println("\uD83D\uDDD1\uFE0FTarea eliminada.");
                                } else {
                                    System.out.println("❌Eliminación cancelada.");
                                }
                            } else {
                                System.out.println("❌Índice invalido.");
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("❌ Entrada inválida. Escribe un número para eliminarlo de la lista o 'SALIR' para salir.'");
                        }
                    }
                    break;

                case 4:
                    System.out.println("\uD83D\uDC4BSaliendo...");
                    return;
            }
        }
    }

// Metodo para guardar las tareas en archivos .txt

    public static void guardarTareas(ArrayList<String> tareas) {
        try (FileWriter archivo = new FileWriter("tareas.txt")) {
            for (String tarea : tareas) {
                archivo.write(tarea + "\n");
            }
        } catch (IOException e) {
            System.out.println("Error al guardar: " + e.getMessage());
        }
    }

    // Metodo para cargar las tareas desde un archivo
    public static ArrayList<String> cargarTareas() {
        ArrayList<String> tareas = new ArrayList<>();
        try (Scanner lector = new Scanner(new File("tareas.txt"))) {
            while (lector.hasNextLine()) {
                tareas.add(lector.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("No se encontró el archivo");
        }
        return tareas;
    }
}