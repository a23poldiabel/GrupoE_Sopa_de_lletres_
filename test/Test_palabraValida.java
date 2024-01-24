import static org.junit.jupiter.api.Assertions.*;

class Test_palabraValida {

    @org.junit.jupiter.api.Test
    void palabraValida_NO_OK() {
        String paraula = "no";
        assertFalse(PrincipalCodigoSopa.palabraValida(paraula));
    }

    @org.junit.jupiter.api.Test
    void palabraValida_OK_6_lletres() {
        String paraula = "Aleska";
        assertTrue(PrincipalCodigoSopa.palabraValida(paraula));
    }
}