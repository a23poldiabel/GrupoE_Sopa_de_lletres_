import static org.junit.jupiter.api.Assertions.*;

class Test_stringDividida {

    /**
     * Verifica si está asignado correctamente los caracteres del operador largo a la matriz de 10x10.
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
     *   El último carácter del operador NO! se coloque en la esquina inferior derecha de la matriz resultante (no coloca el carácter 'J' en la última posición)
     */


    @org.junit.jupiter.api.Test
    public void testSinSaltoDeLineaAlFinal() {
        String operadorSopaDeLetras = "NASQYCCSOZMRWOIHZNFRZUIFEUWBYTPBFPCSFQQIPYTHONBGVIJPDDBTNEVWGGESOYPYTUFYUILECHAVVBZSHXTAJTDZXLYJAVAQ";
        char[][] matriz = new char[10][10];

        matriz = PrincipalCodigoSopa.stringDividida(operadorSopaDeLetras, matriz);

        assertNotEquals('J', matriz[9][9]);

    }


    /**
     * Verifica que, si se pasa un operador nulo a la función stringDividida de la clase PrincipalCodigoSopa, la matriz resultante no debería estar vacía
     */


@org.junit.jupiter.api.Test
public void Test_StringDividida_testOperadorNuloConMatrizNoVacia() {
    char[][] matriz = new char[10][10];
    String operador = "NASQYCCSOZMRWOIHZNFRZUIFEUWBYTPBFPCSFQQIPYTHONBGVIJPDDBTNEVWGGESOYPYTUFYUILECHAVVBZSHXTAJTDZXLYJAVAQ";
    char[][] resultado = PrincipalCodigoSopa.stringDividida(operador, matriz);

    for (int i = 0; i < 10; i++) {
        for (int j = 0; j < 10; j++) {
            assertNotNull(operador.charAt(i * 10 + j), String.valueOf(resultado[i][j]));
        }
    }
}


    @org.junit.jupiter.api.Test
    public void Test_StringDividida_MismoOperadorMismoResultado() {
        char[][] matriz = new char[10][10];
        String operador = "NASQYCCSOZMRWOIHZNFRZUIFEUWBYTPBFPCSFQQIPYTHONBGVIJPDDBTNEVWGGESOYPYTUFYUILECHAVVBZSHXTAJTDZXLYJAVAQ";
        char[][] resultado = PrincipalCodigoSopa.stringDividida(operador, matriz);

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                assertSame(operador.charAt(i * 10 + j), resultado[i][j]);
            }
        }
    }
}





