# Usage of Image-Comparison
Examples of the usage [image-comparison](https://github.com/romankh3/image-comparison) project.

# Description
The main idea is to show how to use this comparison tool.

## Dependency
It's easy to add dependency.

**Latest version is `3.3.0`**

### Maven
```xml
   <dependency>
       <groupId>com.github.romankh3</groupId>
       <artifactId>image-comparison</artifactId>
       <version>3.3.0</version>
   </dependency>
```

### Gradle
```groovy
compile 'com.github.romankh3:image-comparison:3.3.0'
```

## Code
See the example of the usage below:
```java
public class Main {

    public static void main(String[] args) throws IOException, URISyntaxException {
        // load the images to be compared
        BufferedImage bufferedImage1 = ImageComparisonUtil.readImageFromResources("image1.png");
        BufferedImage bufferedImage2 = ImageComparisonUtil.readImageFromResources("image2.png");

        // where to save the result (leave null if you want to see the result in the UI)
        File resultDestination = new File( "result.png" );

        //Create ImageComparison object for it.
        ImageComparison imageComparison = new ImageComparison( bufferedImage1, bufferedImage2, resultDestination );

        //Can be used another constructor for it, without destination.
        new ImageComparison("image1.png", "image2.png");
        //or
        new ImageComparison(bufferedImage1, bufferedImage2);



        //Also can be configured BEFORE comparing next properties:

        //Threshold - it's the max distance between non-equal pixels. By default it's 5.
        imageComparison.setThreshold(10);
        imageComparison.getThreshold();

        //RectangleListWidth - Width of the line that is drawn in the rectangle. By default it's 1.
        imageComparison.setRectangleLineWidth(5);
        imageComparison.getRectangleLineWidth();

        //Destination. Before comparing also can be added destination file for result image.
        imageComparison.setDestination(resultDestination);
        imageComparison.getDestination();

        //MaximalRectangleCount - It means that would get first x biggest rectangles for drawing.
        // by default all the rectangles would be drawn.
        imageComparison.setMaximalRectangleCount(10);
        imageComparison.getMaximalRectangleCount();

        //MinimalRectangleSize - The number of the minimal rectangle size. Count as (width x height).
        // by default it's 1.
        imageComparison.setMinimalRectangleSize(100);
        imageComparison.getMinimalRectangleSize();

        //After configuring the ImageComparison object, can be executed compare() method:
        ComparisonResult comparisonResult = imageComparison.compareImages();

        //Can be found ComparisonState.
        ComparisonState comparisonState = comparisonResult.getComparisonState();

        //And Result Image
        BufferedImage resultImage = comparisonResult.getResult();

        //Image can be saved after comparison, using ImageComparisonUtil.
        ImageComparisonUtil.saveImage(resultDestination, resultImage);
    }
}
```

# Contribution
Feel free to create Pull-Request of the example of the usage `image-comparison` tool.
