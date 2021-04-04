package SecretMessage;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class SolutionThree implements Strategy {
    @Override
    public String doOperation(String fileName) throws IOException {
        int bitMask = 0x00000001;
        int flag = 0;
        int numOfBits = 0;
        int theByte = 0;
        int numOfGreens = 0;
        StringBuilder result = new StringBuilder();
        BufferedImage image = ImageIO.read(new File("Syngenta.bmp"));

        for (int y = 0; y < image.getHeight(); y++) {
            for (int x = 0; x < image.getWidth(); x++) {
                if (numOfBits < 8) {
                    if (image.getRGB(x, y) == -10436608)
                        numOfGreens++;

                    flag = image.getRGB(x, y) & bitMask;

                    if (flag == 1) {
                        theByte = theByte >> 1;
                        theByte = theByte | 0x80;
                    }
                        theByte = theByte >> 1;

                    numOfBits++;
                }

                if (numOfBits == 8) {
                    if (theByte != 0)
                        ;
                    result.append((char) theByte);

                    numOfBits = 0;
                    theByte = 0;
                }
            }
        }
        return result.toString();
    }
}
