import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.lang.String;
import java.util.Scanner;

public class PrincipalCodigoSopa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String operadorSopaDeLetras = fraseValida(input);
        char[][] matrizDeSopa = new char[10][10];
        boolean[][] matrizDeSopaRojo = new boolean[10][10];
        //stringDividida(operadorSopaDeLetras, matrizDeSopa);
        int casos = 0;
        //printearMatrizFinal(matrizDeSopa, matrizDeSopaRojo);
        /*while (casos < 5) {
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
            } /*else {
                System.out.println("Palabra no valida");
               // PrintearMatrizFinal(matrizDeSopa, matrizDeSopaRojo);

            }
        }
    }
*/
    /**
     * fraseValida: Appears false at first glance and is subjected to the necessary conditions to make it 'true'.f
     * In the 'while' loop, a System.out.println() is used to input the soup phrase, and 'frase' is understood as the subsequent input.
     * In the 'if' statement, 'frase' is interpreted in 'validarFrase,' and within its instance, the conditions are applied (characters = 100 and only a-zA-Z). At this point, 'fraseValida = true.'
     * In the 'else' block, 'fraseValida' is still understood as 'false,' and the loop is repeated.
     */
    public static String fraseValida(Scanner input) {
        boolean fraseValida = false;
        String frase = "";
        while (!fraseValida) {
            System.out.println("Ingresa la frase para crear la sopa de letras:");
            frase = input.nextLine();
            if (validarFrase(frase)) {
                fraseValida = true;
                System.out.println("La frase cumple las condiciones.");
            } else {
                System.out.println("La frase no cumple las condiciones, intentalo de nuevo.");
            }
        }
        return frase;
    }

    /**
     * Users are required to input a 100-character word under various conditions..
     * They have to be exactly 100 characters.
     * They must consist only of letters (uppercase 'A' to 'Z'), and cannot include numbers or special characters. Additionally, the input should be exactly 100 characters long.
     */
    public static boolean validarFrase(String frase) {
        return frase.length() == 100 && frase.matches("^[a-zA-Z]*$");
    }
}

