import static org.junit.Assert.*;
import org.junit.Test;

public class PalindromeTest {

    @org.junit.Test
    public void check() {
        Palindrome palindrome=new Palindrome();
        assertEquals(true,palindrome.check("aba"));
        assertEquals(true,palindrome.check("madam"));
        assertEquals(true,palindrome.check(""));
        assertEquals(false,palindrome.check("abc"));
        assertEquals(false,palindrome.check("ab"));


    }
}