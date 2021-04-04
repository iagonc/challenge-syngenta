package GreenPixelCounter;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageAssessment {
    public int countGreens(String imageFileName) {
        int numberOfGreens = 0;

        try {
            BufferedImage imagem = ImageIO.read(new File(imageFileName));

            int height = imagem.getHeight();
            int width = imagem.getWidth();

            for (int y = 0; y < height; y++) {
                for (int x = 0; x < width; x++) {
                    int RGBA = imagem.getRGB(x, y);

                    Color color = new Color(RGBA);

                    if (isGreen(color))
                        numberOfGreens++;
                }
            }
        } catch(IOException e) {
            e.printStackTrace();
        }

        return numberOfGreens;
    }

    private boolean isGreen(Color color) {
        int green = color.getGreen();
        int red = color.getRed();
        int blue = color.getBlue();

        if (green > red && green > blue)
            return true;

        return false;
    }
}