import org.junit.Test;
import SecretMessage.SolutionOne;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class SolutionOneTest {
    final String VALID_MESSAGE = "This message was found";
    final String FILE_NAME = "Syngenta.bpm";

    @Test
    public void givenAValidImage_thenNoMessageWasFound() {
        SolutionOne solutionOne = new SolutionOne();
        assertNotEquals(VALID_MESSAGE, solutionOne.doOperation(FILE_NAME));
    }
}
