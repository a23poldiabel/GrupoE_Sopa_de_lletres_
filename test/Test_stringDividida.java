import static org.junit.jupiter.api.Assertions.*;

class Test_stringDividida {


    /**
     * Verificar que haya un salto de línea al final de la matriz, tambien se puede usar para ve rel prime caracter de la cadena
     */


    @org.junit.jupiter.api.Test
    public void testSinSaltoDeLineaAlFinal() {
        String operadorSopaDeLetras = "NASQYCCSOZMRWOIHZNFRZUIFEUWBYTPBFPCSFQQIPYTHONBGVIJPDDBTNEVWGGESOYPYTUFYUILECHAVVBZSHXTAJTDZXLYJAVAQ";
        char[][] matriz = new char[10][10];

        matriz = PrincipalCodigoSopa.stringDividida(operadorSopaDeLetras, matriz);

        assertEquals('J', matriz[9][9]);

    }


    /**
     * Verifica si la matriz se llena correctamente
     */
    @org.junit.jupiter.api.Test
    public void Test_StringDividida_OperadorLargo() {
        char[][] matriz = new char[10][10];
        String operador = "NASQYCCSOZMRWOIHZNFRZUIFEUWBYTPBFPCSFQQIPYTHONBGVIJPDDBTNEVWGGESOYPYTUFYUILECHAVVBZSHXTAJTDZXLYJAVAQ";
        char[][] resultado = PrincipalCodigoSopa.stringDividida(operador, matriz);

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                assertEquals(operador.charAt(i * 10 + j), resultado[i][j]);
            }
        }
    }


    /**
     * Verifica si la matriz se lleno correctamente con el operador repetido
     */

    @org.junit.jupiter.api.Test
    public void Test_StringDividida_OperadorCorto() {
        char[][] matriz = new char[10][10];
        String operador = "ABCD";
        char[][] resultado = PrincipalCodigoSopa.stringDividida(operador, matriz);

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                assertEquals(operador.charAt((i * 10 + j) % operador.length()), resultado[i][j]);
            }
        }
    }


    /**
     * Verifica si la matriz se lleno correctamente con el operador nulo
     */

    @org.junit.jupiter.api.Test
    public void Test_StringDividida_OperadorNulo() {
        char[][] matriz = new char[10][10];
        String operador = null;
        char[][] resultado = PrincipalCodigoSopa.stringDividida(operador, matriz);

        char[][] expected = new char[10][10];
        assertArrayEquals(expected, resultado);
    }
}