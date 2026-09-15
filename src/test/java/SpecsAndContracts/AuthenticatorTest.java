package SpecsAndContracts;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AuthenticatorTest {

    @Test
    public void testInsecureMethodAllowsCorruption() {
        Authenticator auth = new Authenticator();

        char[] id = auth.getMitId("sonia"); // client gets a LIVE reference
        for (int i = 0; i < 5; i++) {
            id[i] = '*';
        }

        char[] cachedAgain = auth.getMitId("sonia");
        assertEquals("*****6789", new String(cachedAgain));
    }

    @Test
    public void testSecureMethodCannotBeCorrupted() {
        Authenticator auth = new Authenticator();
        String id = auth.getMitIdSecure("sonia");


        assertEquals("123456789", id);
        assertEquals("123456789", auth.getMitIdSecure("sonia"));
    }
}