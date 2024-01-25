import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Test_encontraPalabra {

    static String cadena = "";
    char[][] sopa = new char[10][10];
    boolean[][] trobat = new boolean[10][10];
    @BeforeEach
    void setUp() {
        //inicialitzem una sopa i una cadena que es la font de la sopa
        char lletra = 'A';
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                sopa[i][j] = lletra;
                cadena += lletra;
                lletra++;
                if (lletra > 'Z')
                    lletra = 'A';
            }
        }
    }
    @Test
    void test_encontraPalabra_paraulaNoTrobada() {
            assertFalse(PrincipalCodigoSopa.encontraPalabra(sopa,"ABjDE",trobat));
    }

    @Test
    void test_encontraPalabra_paraulaTrobada() {
        assertTrue(PrincipalCodigoSopa.encontraPalabra(sopa,"ABCDE",trobat));
    }

    @Test
    void test_encontraPalabra_paraulaTrobada_trueMatriuTrobat() {
        String nom = "ABCDE";
        boolean[][] aux = new boolean[10][10];
        for (int i = 0; i < nom.length(); i++) {
            aux[0][i]=true;
        }
        PrincipalCodigoSopa.encontraPalabra(sopa,nom,trobat);
        assertArrayEquals(aux,trobat);
    }
    @Test
    void test_encontraPalabra_paraulaTrobada_trueMatriuTrobatVertical() {
        String nom = "AKU";
        boolean[][] aux = new boolean[10][10];
        for (int i = 0; i < nom.length(); i++) {
            aux[i][0]=true;
        }
        PrincipalCodigoSopa.encontraPalabra(sopa,nom,trobat);
        assertArrayEquals(aux,trobat);
    }
}