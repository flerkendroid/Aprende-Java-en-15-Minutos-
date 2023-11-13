import java.util.Scanner;

public class App {
    private String mostrarAltura(int altura){

        String resultado = "";

        if (altura >= 180) {
            resultado = "Eres una persona alta, mides " + altura;

        } else {
            resultado = "Eres una persona bajita";
        }

        return resultado;

    }

    public static void main(String[] args) throws Exception {

        // Este es un comentario de código
        System.out.println("Primer Programa con Java");

        /*
         *  Esto es un comentario de código
         *  multilinea 
         *  y otra línea
         */

        System.out.println("Wena cabros chupenme el pn xd");

        // Variables
        int edad = 23;
        String nombre = "";
        nombre = "Francisca Reyes";
        boolean verdadero = true; // Cambiado Boolean a boolean

        System.out.println(nombre);

        // Concatenación
        System.out.println("Me llamo " + nombre + " tengo " + edad + " años");

        System.out.printf("Me llamo %s, tengo %d años", nombre, edad); // Corregido el formato en printf

        // Entrada de datos
        Scanner sc = new Scanner(System.in);

        System.out.println("");
        System.out.println("Responde estas preguntas: ");
        System.out.println("¿Cómo te llamas?: ");
        String miNombre = sc.nextLine();
        System.out.println("El usuario se llama " + miNombre);

        // Condiciones
        System.out.print("¿Cuánto mides?: ");
        int altura = sc.nextInt(); // Cambiado de nextLine a nextInt
        
        // Cerrar el scanner al final para evitar advertencias
        sc.close();
        
        App aplicacion = new App();

        //Funciones
        System.out.println(aplicacion.mostrarAltura(altura));

        //Array
        String[] personas = {"Jonathan Ahumada", "Gustavo Martinez", "Francisca Reyes", "Ana Fernandez", "Prisci Enríquez", "Damian Ramos"};

        personas[2] =  "Kathy";

        System.out.println(personas[0]);

        // Bucle for

        for(String persona : personas){
            System.out.println("- "+persona);
        }
        
    }
}
