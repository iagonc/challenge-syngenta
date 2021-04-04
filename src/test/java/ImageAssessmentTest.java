import GreenPixelCounter.ImageAssessment;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ImageAssessmentTest {
    @Test
    public void givenAValidImage_thenWhenCountNumberOfGreenPixels_willReturnAValidNumber() {
        ImageAssessment imageAssessment = new ImageAssessment();

        assertEquals(298, imageAssessment.countGreens("Syngenta.bmp"));
    }
}