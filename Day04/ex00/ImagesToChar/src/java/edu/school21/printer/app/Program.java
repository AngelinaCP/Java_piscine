package edu.school21.printer.app;

import edu.school21.printer.logic.Logic;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.IOException;


public class Program {

    private static final Integer WHITE = -1;
    private static final Integer BLACK = -16777216;

    public static void main(String[] args) {

        if (args.length != 3) {
            System.err.println("Error: Bad argument");
            System.exit(-1);
        }
        if (args[0].length() != 1 || args[1].length() != 1 || args[2].length() == 0)  {
            System.err.println("Error: Bad argument");
            System.exit(-1);
        }
        if (!args[2].endsWith(".bmp")) {
            System.err.println("Error: Bad argument");
            System.exit(-1);
        }
        char white = args[0].charAt(0);
        char black = args[1].charAt(0);
        String path = args[2];
        try (FileInputStream input = new FileInputStream(path)) {
            Logic image = new Logic(input, white, black);
            for (int i = 0; i < image.getHeight(); i++){
                for ( int j = 0; j < image.getWidth(); j++){
                    if (image.getRGB(j, i) == WHITE){
                        System.out.print(image.getWhite());
                    } else {
                        System.out.print(image.getBlack());
                    }
                }
                System.out.println();
            }
        } catch (IOException error) {
            System.err.println("FILE NOT FOUND");
            System.exit(-1);
        }

    }
}