import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class PrincipalCodigoSopa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String operadorSopaDeLetras = fraseValida(input);
        char[][] matrizDeSopa = new char[10][10];
        boolean[][] matrizDeSopaRojo = new boolean[10][10];
        stringDividida(operadorSopaDeLetras, matrizDeSopa);
        int casos = 0;
        printearMatrizFinal(matrizDeSopa, matrizDeSopaRojo);
        while (casos < 5) {
            System.out.println();
            System.out.println("Ingrese una palabra:");
            String palabraUsuario = input.nextLine();
            if (palabraValida(palabraUsuario)) {

                if (encontraPalabra(matrizDeSopa, palabraUsuario, matrizDeSopaRojo)) {
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
     * With this function we are verifying if the input is valid.
     * We will use an if loop to verify if the word length is less or the same as 10 characters
     * and also if it's higher than 3 characters.
     * Also, in another if it will verify if the word is in lower case, if it is, it will return false, making it a non-valid word.
     * If the word is valid, it will return true, else, it will return false.
     */
    public static boolean palabraValida(String palabra) {
        if (palabra.length() <= 10 && palabra.length() > 3) {
            if (palabra.equals(palabra.toLowerCase())) {
                return false;
            }
            return true;
        } else {
            return false;
        }
    }
    /**
     * This function converts a linear string of characters into a two-dimensional array.
     * The string represents an alphabet soup and is distributed in the array.
     * The resulting array contains the characters from the word search arranged in rows and columns.
     *
     * @param operadorSopaDeLetras operator The string containing the word search characters in linear format.
     * @param matrizDeSopa         The array that will store the characters of the alphabet soup based on the selected characters.
     * @return The resulting array with the alphabet soup characters distributed with a line break on the tenth line.
     */
    public static char[][] stringDividida(String operadorSopaDeLetras, char[][] matrizDeSopa) {
        int index = 0;
        for (int f = 0; f < 10; f++) {
            System.out.println();
            for (int c = 0; c < 10; c++) {
                matrizDeSopa[f][c] = operadorSopaDeLetras.charAt(index++);
            }
        }
        return matrizDeSopa;
    }
    /**
     * This function is responsible for printing the matrizNormal. If the matrizRoja has a TRUE value, it will be printed red.
     *
     * @param matrizNormal It is the char matrix, with the alphabet soup values
     * @param matrizRoja   It is the boolean matrix, with the true values where the word has been found
     */
    private static void printearMatrizFinal(char[][] matrizNormal, boolean[][] matrizRoja) {
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
    /**
     * This function looks for the first letter of palabra, in the matriu.  When the function founds the letter, it calls for the other functions, that will check if the rest
     * of the Chars next to the first letter found. When the functions returns a true, it means that it has found the word and will return a true value for the main function.
     *
     * @param matriu           It is the char matrix, with the alphabet soup values
     * @param palabra          It is the input that the user has sent, because thinks is in the alphabet soup
     * @param matrizDeSopaRojo It is the boolean matrix, with the true values where the word has been found or will be found.
     * @return
     */
    public static boolean encontraPalabra(char[][] matriu, String palabra, boolean[][] matrizDeSopaRojo) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (matriu[i][j] == palabra.charAt(0)) {
                    if (encontrarDerecha(matriu, palabra, i, j, matrizDeSopaRojo)) {
                        return true;
                    }
                    if (encontrarAbajo(matriu, palabra, i, j, matrizDeSopaRojo)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    /**
     * This function checks if the rest of the word is in the row. It also checks if the word has already been found.
     *
     * @param matriu           It is the char matrix, with the alphabet soup values
     * @param palabra          It is the input that the user has sent, because thinks is in the alphabet soup
     * @param fila             It is the int i, that is the rows that has to be checked
     * @param columna          It is the int j, that is the columns that has to be checked
     * @param matrizDeSopaRojo It is the boolean matrix, with the true values where the word has been found or will be found.
     * @return
     */
    public static boolean encontrarDerecha(char[][] matriu, String palabra, int fila, int columna, boolean[][] matrizDeSopaRojo) {
        int longitud = palabra.length();
        if (columna + longitud > 10) {
            return false;
        }
        for (int i = 0; i < longitud; i++) {
            if (matriu[fila][columna + i] != palabra.charAt(i)) {
                return false;
            }
        }
        if (matrizDeSopaRojo[fila][columna + 1] == true) {
            System.out.println("Palabra repetida");
            return false;
        }
        for (int i = 0; i < longitud; i++) {
            matrizDeSopaRojo[fila][columna + i] = true;
        }
        return true;
    }
    /**
     * This function checks if the rest of the word is in the column. It also checks if the word has already been found.
     *
     * @param matriu           It is the char matrix, with the alphabet soup values
     * @param palabra          It is the input that the user has sent, because thinks is in the alphabet soup
     * @param fila             It is the int i, that is the rows that has to be checked
     * @param columna          It is the int j, that is the columns that has to be checked
     * @param matrizDeSopaRojo It is the boolean matrix, with the true values where the word has been found or will be found.
     * @return
     */
    public static boolean encontrarAbajo(char[][] matriu, String palabra, int fila, int columna, boolean[][] matrizDeSopaRojo) {
        int longitud = palabra.length();
        if (fila + longitud > 10) {
            return false;
        }

        for (int i = 0; i < longitud; i++) {
            if (matriu[fila + i][columna] != palabra.charAt(i)) {
                return false;
            }
        }
        if (matrizDeSopaRojo[fila + 1][columna] == true) {
            System.out.println("Palabra repetida");
            return false;
        }
        for (int i = 0; i < longitud; i++) {
            matrizDeSopaRojo[fila + i][columna] = true;
        }
        return true;
    }

    /**
     * fraseValida: It may seem false at first glance, but the necessary conditions are applied to make it 'true'.
     * In the 'while' loop, a System.out.println() is used to input the word puzzle phrase, and 'frase' is understood as the next input.
     * In the 'if' statement, 'frase' is interpreted in the 'validarFrase' function, and the specified conditions are applied in its instance (100 characters and only A-Z). At this point, 'fraseValida = true'.
     * In the 'else' statement, 'fraseValida' is still understood as 'false,' and the loop is repeated once again.
     */

    /**
     * This function checks that the first input with the string to create the puzzle comply with the condicions.
     * @param input This input contain the 100 characters phrase.
     * @return
     */

    public static String fraseValida(Scanner input) {
        System.out.println("Ingresa la frase para crear la sopa de letras:");
        String frase = "";
        while(true) {
            frase = input.nextLine();
            if (frase.length() == 100 && frase.matches("^[A-Z]*$")) {
                break;
            } else {
                System.out.println("La frase no cumple las condiciones, intentalo de nuevo.");
            }
        }
        return frase;
    }
}


