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
        String[] palabrasCorrectas = {"Volvo", "BMW", "Ford", "Mazda", "Nissan"};
        while (casos < 5) {
            System.out.println();
            System.out.println("Ingrese una palabra:");
            String palabraUsuario = input.nextLine();
            if (palabrasCorrectas[0].equals(palabraUsuario) || palabrasCorrectas[1].equals(palabraUsuario) || palabrasCorrectas[2].equals(palabraUsuario) || palabrasCorrectas[3].equals(palabraUsuario) || palabrasCorrectas[4].equals(palabraUsuario)) {
                System.out.println("Palabra repetida");
                printearMatrizFinal(matrizDeSopa, matrizDeSopaRojo);
            } else if (palabraValida(palabraUsuario)) {
                if (encontraPalabra(matrizDeSopa, palabraUsuario, matrizDeSopaRojo)) {
                    palabrasCorrectas[casos] = palabraUsuario;
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
        for (int i = 0; i < longitud; i++) {
            matrizDeSopaRojo[fila + i][columna] = true;
        }
        return true;
    }
}