
import java.util.Scanner;

public class Main {

    public static void main(String[] args ){

// Variables
        Scanner scanner = new Scanner(System.in);
        Funciones funciones = new Funciones();

        int vidas = 3;
        int intentos = 10;
        int[][] m1 = Funciones.matriz1;
        int[][] m2 = Funciones.matriz2;

// Se imprime el tablero


        funciones.imprimirTablero();


//Aqui se llena el tablero de minas

        funciones.enterrarMinas();

        while (vidas > 0 && intentos > 0 ) {
            System.out.println("--Tienes " + vidas + " vidas--");
            System.out.println("Intentos restantes: " + intentos);

            System.out.println("Elije la FILA en donde quieres cavar(0-4)");
            int fila2 = scanner.nextInt();

            System.out.println("Elije la COLUMNA en donde quieres cavar(0-4)");
            int columna2 = scanner.nextInt();

            if (m2[fila2][columna2] != 0){

                System.out.println("---Ya buscaste en esta casilla!, intenta otra---");

            }

            else {

                if (m1[fila2][columna2] == 1) {
                    vidas -= 1;
                    System.out.println("----------perdiste una vida----------");
                    intentos -= 1;
                    m2[fila2][columna2] = 1;

                } else {
                    System.out.println("----------Te salvaste!!----------");
                    intentos -= 1;
                    m2[fila2][columna2] = 7;

                }
            }
            //Matriz 2

            funciones.campoBusqueda();
    }

    }
}