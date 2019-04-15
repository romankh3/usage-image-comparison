package com.github.romankh3.usage.imagecomparison;


import com.github.romankh3.image.comparison.ImageComparison;
import com.github.romankh3.image.comparison.ImageComparisonTools;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

public class Main {

    public static void main(String[] args) throws IOException, URISyntaxException {
        BufferedImage bufferedImage1 = ImageComparisonTools.readImageFromResources("image1.png");
        BufferedImage bufferedImage2 = ImageComparisonTools.readImageFromResources("image2.png");

        File result = new File("target/images/result.png");

        ImageComparison imageComparison = new ImageComparison(bufferedImage1, bufferedImage2, result);
        ImageComparisonTools.createGUI(imageComparison.compareImages());
    }
}
