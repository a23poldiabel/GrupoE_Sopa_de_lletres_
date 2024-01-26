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
     * fraseValida: It may seem false at first glance, but the necessary conditions are applied to make it 'true'.
     * In the 'while' loop, a System.out.println() is used to input the word puzzle phrase, and 'frase' is understood as the next input.
     * In the 'if' statement, 'frase' is interpreted in the 'validarFrase' function, and the specified conditions are applied in its instance (100 characters and only A-Z). At this point, 'fraseValida = true'.
     * In the 'else' statement, 'fraseValida' is still understood as 'false,' and the loop is repeated once again.
     */
    public static String fraseValida(Scanner input) {
        boolean fraseValida = false;
        String frase = "";
        while (!fraseValida) {
            System.out.println("Ingresa la frase para crear la sopa de letras:");
            frase = input.nextLine();
        }
        return frase;
    }

    /**
     * Users are required to write a 100-character word under various conditions.
     * They need to be 100 exactly characters.
     * The input must consist solely of letters (uppercase) from 'A' to 'Z', numbers and special characters are not allowed.
     */
    public static boolean validarFrase(String frase){
        if (frase.length() == 100 && frase.matches("^[A-Z]*$")) {
            System.out.println("La frase cumple las condiciones.");
            return true;
        } else {
            System.out.println("La frase no cumple las condiciones, intentalo de nuevo.");
            return false;
        }
    }
