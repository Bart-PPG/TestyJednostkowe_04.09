import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SzyfryTest {

    @Test
    void szyftrCezaraJezeliKlucz0() {
        Assertions.assertEquals("ABC",Szyfry.szyfrCezara("ABC",0));
    }
    @Test
    void szyftrCezaraJezeliKluczJezliKluczMniejszyodDlugosciAlfabetu() {
        Assertions.assertEquals("DEF",Szyfry.szyfrCezara("ABC",3));
    }
    @Test
    void szyftrCezaraJezeliKluczWiekszyNizDlugoscAlfabetu() {
        Assertions.assertEquals("DEF",Szyfry.szyfrCezara("ABC",81));
    }

    @Test
    void szyftrCezaraJezeliKluczUjemny() {
        Assertions.assertEquals("ABC",Szyfry.szyfrCezara("DEF",-3));
    }

    @Test
    void szyftrCezaraJezeliBezZawijaniaWierszyKlucz3() {
        Assertions.assertEquals("DEF",Szyfry.szyfrCezara("ABC",3));
    }

    @Test
    void szyftrCezaraJezeliZZawijaniaWierszyKlucz3() {
        Assertions.assertEquals("ABC",Szyfry.szyfrCezara("XYZ",3));
    }
}