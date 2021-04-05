import GreenPixelCounter.ImageAssessment;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ImageAssessmentTest {
    final String FILE_NAME = "Syngenta.bmp";
    @Test
    public void givenAValidImage_thenWhenCountNumberOfGreenPixels_willReturnAValidNumber() {
        ImageAssessment imageAssessment = new ImageAssessment();


        assertEquals(298, imageAssessment.countGreens(FILE_NAME));
    }
}