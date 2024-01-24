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
        //printearMatrizFinal(matrizDeSopa, matrizDeSopaRojo);
        while (casos < 5) {
            System.out.println();
            System.out.println("Ingrese una palabra:");
            String palabraUsuario = input.nextLine();
            /*if (palabraValida(palabraUsuario)) {
                if (EncontraPalabra(matrizDeSopa, palabraUsuario, matrizDeSopaRojo)) {
                    casos++;
                    System.out.println("Correcto!!!");
                    System.out.println();
                   PrintearMatrizFinal(matrizDeSopa, matrizDeSopaRojo);
                } else {
                    System.out.println("Incorrecto");
                    System.out.println();
                   PrintearMatrizFinal(matrizDeSopa, matrizDeSopaRojo);
                }
            } else {
                System.out.println("Palabra no valida");
                PrintearMatrizFinal(matrizDeSopa, matrizDeSopaRojo);
            }*/
        }
    }


}