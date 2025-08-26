import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class LoginTest {
    
    @Test
    public void loginAvecCredentialsCorrect(){
        assertEquals(1, 1);
    }
    @Test
    public void loginAvecCredentialsIncorrect(){
        assertEquals(1, 2);
    }
}
