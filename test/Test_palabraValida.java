import static org.junit.jupiter.api.Assertions.*;

class Test_palabraValida {

    @org.junit.jupiter.api.Test
    void palabraValida_NO_OK() {
        String paraula = "no";
        assertFalse(PrincipalCodigoSopa.palabraValida(paraula));
    }

    @org.junit.jupiter.api.Test
    void palabraValida_OK_6_lletres() {
        String paraula = "chased";
        assertTrue(PrincipalCodigoSopa.palabraValida(paraula));
    }

    @org.junit.jupiter.api.Test
    void palabraValida_isEmpty() {
        String paraula = " ";
        assertFalse(PrincipalCodigoSopa.palabraValida(paraula));
    }

    @org.junit.jupiter.api.Test
    void palabraValida_isUpperCase() {
        String paraula = "HOLA";
        assertTrue(PrincipalCodigoSopa.palabraValida(paraula.toUpperCase()));
    }
}