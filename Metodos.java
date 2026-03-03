
import java.util.Scanner;

public class Metodos {

    Scanner teclado = new Scanner(System.in);

    // Registrar estudiantes
    public Estudiante[][] registrarEstudiantes(int filas, int columnas) {

        Estudiante[][] matriz = new Estudiante[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {

                System.out.println("\nEstudiante en posición [" + i + "][" + j + "]");

                System.out.print("Nombre: ");
                String nombre = teclado.nextLine();

                System.out.print("Calificación (A, B, C): ");
                String calificacion = teclado.nextLine().toUpperCase();

                matriz[i][j] = new Estudiante(nombre, calificacion);
            }
        }

        return matriz;
    }

    // Agrupar y mostrar estudiantes
    public void agruparEstudiantes(Estudiante[][] matriz) {

        int contA = 0, contB = 0, contC = 0;

        // CONTAR
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                switch (matriz[i][j].getCalificacion()) {
                    case "A": contA++; break;
                    case "B": contB++; break;
                    case "C": contC++; break;
                }
            }
        }

        // CREAR MATRICES
        Estudiante[][] matrizA = new Estudiante[contA][1];
        Estudiante[][] matrizB = new Estudiante[contB][1];
        Estudiante[][] matrizC = new Estudiante[contC][1];

        int a = 0, b = 0, c = 0;

        // ASIGNAR
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                switch (matriz[i][j].getCalificacion()) {

                    case "A":
                        matrizA[a][0] = matriz[i][j];
                        a++;
                        break;

                    case "B":
                        matrizB[b][0] = matriz[i][j];
                        b++;
                        break;

                    case "C":
                        matrizC[c][0] = matriz[i][j];
                        c++;
                        break;
                }
            }
        }

        // MOSTRAR RESULTADOS
        System.out.println("\n--- Estudiantes con A ---");
        for (int i = 0; i < matrizA.length; i++) {
            System.out.println(matrizA[i][0]);
        }

        System.out.println("\n--- Estudiantes con B ---");
        for (int i = 0; i < matrizB.length; i++) {
            System.out.println(matrizB[i][0]);
        }

        System.out.println("\n--- Estudiantes con C ---");
        for (int i = 0; i < matrizC.length; i++) {
            System.out.println(matrizC[i][0]);
        }
    }
}
