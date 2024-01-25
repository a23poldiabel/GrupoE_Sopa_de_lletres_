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
     * With this function we are verifying if the input is valid.
     * We will use an if loop to verify if the word length is less or the same as 10 characters
     * and also if it's higher than 3 characters.
     * If the word is valid, it will return true, else, it will return false.
     * */
    public static boolean palabraValida(String palabra) {
        if (palabra.length() <= 10 && palabra.length() > 3){
            return true;
        } else {
            return  false;

        }
    }


    /**
     * Fills a two-dimensional character array with elements from a string.
     *
     * @param operadorSopaDeLetras The string from which characters will be taken to fill the array.
     * @param matrizDeSopa The two-dimensional array to be filled with characters.
     * @return The two-dimensional array filled with characters from the string.
     *         If the length of the string is less than the size of the array, the string is looped.
     *         If the string is longer than the size of the array, additional characters are ignored.
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