import GreenPixelCounter.ImageAssessment;
import SecretMessage.Context;
import SecretMessage.SolutionOne;
import SecretMessage.SolutionThree;
import SecretMessage.SolutionTwo;

import java.io.IOException;

public class SyngentaChallenge {
    public static final String FILE_NAME = "Syngenta.bmp";

    public static void main(String[] args) throws IOException {
        String result;

        // Image Assessment
        ImageAssessment imageAssessment = new ImageAssessment();
        int numberOfGreens = imageAssessment.countGreens(FILE_NAME);
        System.out.println("NUMBER OF GREENS:");
        System.out.println(numberOfGreens);
        System.out.println();

        // Solution One
        Context context = new Context(new SolutionOne());
        result = context.executeStrategy(FILE_NAME);
        System.out.println("SOLUTION ONE:");
        System.out.println(result);
        System.out.println();

        // Solution Two
        context = new Context(new SolutionTwo());
        System.out.println("SOLUTION TWO:");
        result = context.executeStrategy(FILE_NAME);
        System.out.println(result);
        System.out.println();

        // Solution Tree
        context = new Context(new SolutionThree());
        result = context.executeStrategy(FILE_NAME);
        System.out.println("SOLUTION THREE:");
        System.out.println(result);

    }
}
