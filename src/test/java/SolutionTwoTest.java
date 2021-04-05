import org.junit.Test;
import SecretMessage.SolutionTwo;
import java.io.IOException;
import static org.junit.Assert.assertNotEquals;

public class SolutionTwoTest {
    final String VALID_MESSAGE = "This message was found";
    final String FILE_NAME = "Syngenta.bpm";

    @Test
    public void givenAValidImagee_thenNoMessageWasFound() throws IOException {
        SolutionTwo solutionTwo = new SolutionTwo();
        assertNotEquals(VALID_MESSAGE, solutionTwo.doOperation(FILE_NAME));
    }
}
