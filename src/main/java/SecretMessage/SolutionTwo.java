package SecretMessage;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class SolutionTwo implements Strategy {

    @Override
    public String doOperation(String fileName){
        StringBuilder result = new StringBuilder();
        String binary = "";

        try {
            BufferedImage imagem = ImageIO.read(new File(fileName));

            int height = imagem.getHeight();
            int width = imagem.getWidth();


            for (int y = 0; y < height; y++) {
                for (int x = 0; x < width; x++) {
                    int RGBA = imagem.getRGB(x, y);

                    Color color = new Color(RGBA);
                    binary = filterThenReturnABinary(color, x);

                    result.append(binary);
                    if (result.toString().length() % 9 == 0) {
                        result.append(" ");
                    }

                }
            }


        }catch (IOException e) {
            e.printStackTrace();
        }
        return result.toString();
    }

    private String filterThenReturnABinary(Color color, int x) {

        int green = color.getGreen();
        int red = color.getRed();
        int blue = color.getBlue();

        if (x % 7 == 0) {
            return "";
        }
        if (green == 255 && red == 255 && blue == 255) {
            return "0";
        } else if (green > red && green > blue) {
            return "1";
        }
        return "";
    }
}
