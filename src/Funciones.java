import java.util.Random;

public class Funciones {

    int minas = 5;
    int colocadas = 0;

    static int n = 5;
    public static int[][] matriz1 = new int[n][n];
    public static int[][] matriz2 = new int[n][n];

    Random random = new Random();


    public void imprimirTablero(){

        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1.length; j++) {

                System.out.print(matriz1[i][j] + "        ");
            }
            System.out.println();
        }

    }

    public void enterrarMinas(){

        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1.length; j++) {
                while (colocadas < minas) {
                    int fila = random.nextInt(n);
                    int columna = random.nextInt(n);

                    if (matriz1[fila][columna] == 0) {
                        matriz1[fila][columna] = 1;
                        colocadas++;
                    }
                }
                
            }

        }

    }

    public void campoBusqueda(){

        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2.length; j++) {

                System.out.print(matriz2[i][j] + "        ");
            }
            System.out.println();
        }

    }

}
