

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Metodos m = new Metodos();

        System.out.println("¿Cuántas filas?");
        int filas = Integer.parseInt(teclado.nextLine());

        System.out.println("¿Cuántas columnas?");
        int columnas = Integer.parseInt(teclado.nextLine());

        Estudiante[][] matriz = m.registrarEstudiantes(filas, columnas);

        m.agruparEstudiantes(matriz);
    }
}
