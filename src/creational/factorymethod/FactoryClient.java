package src.creational.factorymethod;

import java.util.Locale;

public class FactoryClient {
    public static void main(String[] args) {
        DecodedIamge decodedIamge;
        ImageReader reader = null;
        String image = args[0];
        String format = image.substring(image.indexOf('.') + 1, image.length());
        if (format.equalsIgnoreCase("gif")) {
            reader = new GifReader(image);
        } else if (format.equalsIgnoreCase("jpeg")) {
            reader = new JpegReader(image);
        }

        assert reader != null;
        decodedIamge = reader.getDecodedImage();
        System.out.println(decodedIamge);
    }
}
