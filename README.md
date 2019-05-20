# Usage of Image-Comparison
Examples of the usage [image-comparison](https://github.com/romankh3/image-comparison) project.

# Description
The main idea is to show how to use this comparison tool.

## Dependency
It's easy to add dependency

### Maven
```xml
   <dependency>
       <groupId>com.github.romankh3</groupId>
       <artifactId>image-comparison</artifactId>
       <version>2.2.0</version>
   </dependency>
```

### Gradle
```groovy
compile 'com.github.romankh3:image-comparison:2.2.0'
```

## Code
See the example of the usage below:
```java
public class Main {

    public static void main(String[] args) throws IOException, URISyntaxException {
        // Get images for comparison
        BufferedImage bufferedImage1 = ImageComparisonTools.readImageFromResources("image1.png");
        BufferedImage bufferedImage2 = ImageComparisonTools.readImageFromResources("image2.png");

        // create File for the result image
        File result = new File("target/images/result.png");

        // Create ImageComparison instance based on previous data
        ImageComparison imageComparison = new ImageComparison(bufferedImage1, bufferedImage2, result);
        
        //Can be configured threshold value, by deafault it's 5.
        imageComparison.setThreshold(15)
        
        //Can be configurated rectangleLineWidth, by default it's 1.
        imageComparison.setRectangleLineWidth(10)
        
        //Compare them
        BufferedImage result = imageComparison.compareImages();
        
        //Show the result via JFrame:
        ImageComparisonTools.createGUI();
    }
}
```

# Contribution
Feel free to create Pull-Request of the example of the usage `image-comparison` tool.
