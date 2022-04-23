package edu.school21.printer.logic;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.IOException;

public class Logic {
    private BufferedImage image;
    private char white;
    private char black;

    public Logic(FileInputStream image, char white, char black) throws IOException {
        this.white = white;
        this.black = black;
        this.image = ImageIO.read(image);
    }

    public Integer getWidth(){
        return this.image.getWidth();
    }

    public Integer getHeight(){
        return this.image.getHeight();
    }

    public Integer getRGB(int x, int y){
        return this.image.getRGB(x, y);
    }

    public char getWhite() {
        return black;
    }

    public char getBlack() {
        return white;
    }
}