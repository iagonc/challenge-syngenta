import org.junit.Test;
import SecretMessage.SolutionThree;
import java.io.IOException;
import static org.junit.Assert.assertNotEquals;

public class SolutionThreeTest {
    final String VALID_MESSAGE = "This message was found";
    final String FILE_NAME = "Syngenta.bmp";

    @Test
    public void givenAValidImage_thenNoMessageWasFound() throws IOException {
        SolutionThree solutionThree = new SolutionThree();
        assertNotEquals(VALID_MESSAGE, solutionThree.doOperation(FILE_NAME));
    }
}
