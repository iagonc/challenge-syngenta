package SecretMessage;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class SolutionOne implements Strategy {
    @Override
    public String doOperation(String fileName) {
        StringBuilder result = new StringBuilder();

        try {
            BufferedImage imagem = ImageIO.read(new File(fileName));

            int height = imagem.getHeight();
            int width = imagem.getWidth();

            String binary = null;

            for (int y = 0; y < height; y++) {
                for (int x = 0; x < width; x++) {
                    int RGBA = imagem.getRGB(x, y);

                    Color color = new Color(RGBA);
                    int sum = getSumOfColors(color);

                    binary = Integer.toBinaryString(sum);

                    int binario = Integer.parseInt(binary);

                    if (binario != 0)
                        result.append((char) binario);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return result.toString();
    }

    private int getSumOfColors(Color color) {
        int green = color.getGreen();
        int red = color.getRed();
        int blue = color.getBlue();

        return green + red + blue;
    }
}
