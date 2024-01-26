import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class PrincipalCodigoSopa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //String operadorSopaDeLetras = fraseValida(input);
        char[][] matrizDeSopa = new char[10][10];
        boolean[][] matrizDeSopaRojo = new boolean[10][10];
        stringDividida(operadorSopaDeLetras, matrizDeSopa);
        int casos = 0;
        //printearMatrizFinal(matrizDeSopa, matrizDeSopaRojo);
        while (casos < 5) {
            System.out.println();
            System.out.println("Ingrese una palabra:");
            String palabraUsuario = input.nextLine();
            if (palabraValida(palabraUsuario)) {

               /* if (EncontraPalabra(matrizDeSopa, palabraUsuario, matrizDeSopaRojo)) {
                    casos++;
                    System.out.println("Correcto!!!");
                    System.out.println();
                   PrintearMatrizFinal(matrizDeSopa, matrizDeSopaRojo);
                } else {
                    System.out.println("Incorrecto");
                    System.out.println();
                   PrintearMatrizFinal(matrizDeSopa, matrizDeSopaRojo);
                }*/
            } else {
                System.out.println("Palabra no valida");
               // PrintearMatrizFinal(matrizDeSopa, matrizDeSopaRojo);
            }
        }
    }

    /**
     * This function converts a linear string of characters into a two-dimensional array.
     * The string represents an alphabet soup and is distributed in the array.
     * The resulting array contains the characters from the word search arranged in rows and columns.
     *
     * @param operadorSopaDeLetras operator The string containing the word search characters in linear format.
     * @param matrizDeSopa The array that will store the characters of the alphabet soup based on the selected characters.
     * @return The resulting array with the alphabet soup characters distributed with a line break on the tenth line.
     */


    public static char[][] stringDividida (String operadorSopaDeLetras, char[][] matrizDeSopa) {
        int index =0;
        for (int f = 0; f< 10; f++) {
            System.out.println();
            for (int c = 0; c < 10; c++) {
                matrizDeSopa [f][c] = operadorSopaDeLetras.charAt(index++);
            }
        }
        return matrizDeSopa;
    }
}
