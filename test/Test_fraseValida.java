import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Test_fraseValida {
    @Test
    void validarFrase_Fallo() {
        String frase = "NASQYCCSOZMRWOIHZNFRZUIFEUWBYTPBFPCSFQQIPYTHONBGVIJPDDBTNEVWGGESOYPYTUFYUILECHAVVBZSHXTAJTDZXLYJAVAq";
        assertFalse(PrincipalCodigoSopa.validarFrase(frase));
    }
    @Test
    void validarFrase_Correcta(){
        String frase = "NASQYCCSOZMRWOIHZNFRZUIFEUWBYTPBFPCSFQQIPYTHONBGVIJPDDBTNEVWGGESOYPYTUFYUILECHAVVBZSHXTAJTDZXLYJAVAQ";
        assertTrue(PrincipalCodigoSopa.validarFrase(frase));
    }
    @Test
    void validarFrase_Numeros(){
        String frase = "NASQYCCSOZMRWOIHZNFRZUIFEUWBYTPBFPCSFQQIPYTHONBGVIJPDDBTNEVWGGESOYPYTUFYUILECHAVVBZSHXTAJTDZXLYJAVA3";
        assertFalse(PrincipalCodigoSopa.validarFrase(frase));
    }
    @Test
    void validarFrase_CaracteresEspeciales(){
        String frase = "NASQYCCSOZMRWOIHZNFRZUIFEUWBYTPBFPCSFQQIPYTHONBGVIJPDDBTNEVWGGESOYPYTUFYUILECHAVVBZSHXTAJTDZXLYJAVA*";
        assertFalse(PrincipalCodigoSopa.validarFrase(frase));
    }
}