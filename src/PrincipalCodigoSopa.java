import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class PrincipalCodigoSopa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //String operadorSopaDeLetras = fraseValida(input);
        char[][] matrizDeSopa = new char[10][10];
        boolean[][] matrizDeSopaRojo = new boolean[10][10];
        //stringDividida(operadorSopaDeLetras, matrizDeSopa);
        int casos = 0;
        printearMatrizFinal(matrizDeSopa, matrizDeSopaRojo);
        while (casos < 5) {
            System.out.println();
            System.out.println("Ingrese una palabra:");
            String palabraUsuario = input.nextLine();
            if (/*palabraValida(palabraUsuario)*/true) {
                if (/*EncontraPalabra(matrizDeSopa, palabraUsuario, matrizDeSopaRojo)*/true) {
                    casos++;
                    System.out.println("Correcto!!!");
                    System.out.println();
                   printearMatrizFinal(matrizDeSopa, matrizDeSopaRojo);
                } else {
                    System.out.println("Incorrecto");
                    System.out.println();
                   printearMatrizFinal(matrizDeSopa, matrizDeSopaRojo);
                }
            } else {
                System.out.println("Palabra no valida");
                printearMatrizFinal(matrizDeSopa, matrizDeSopaRojo);
            }
        }
    }
    /**
     * This function is responsible for printing the matrizNormal. If the matrizRoja has a TRUE value, it will be printed red.
     * @param matrizNormal It is the char matrix, with the alphabet soup values
     * @param matrizRoja It is the boolean matrix, with the true values where the word has been found
     */
    public static void printearMatrizFinal(char[][] matrizNormal, boolean[][] matrizRoja) {
        for (int k = 0; k < 10; k++) {
            for (int z = 0; z < 10; z++) {
                if (matrizRoja[k][z] == true) {
                    System.out.print("\u001B[31m" + matrizNormal[k][z] + " " + "\u001B[0m");
                } else {
                    System.out.print(matrizNormal[k][z] + " ");
                }
            }
            System.out.println();
        }
    }

}
