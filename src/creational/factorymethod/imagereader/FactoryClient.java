package src.creational.factorymethod.imagereader;

public class FactoryClient {
    public static void main(String[] args) {
        DecodedImage decodedImage;
        ImageReader reader = null;
        String image = args[0];
        String format = image.substring(image.indexOf('.') + 1, image.length());
        if (format.equalsIgnoreCase("gif")) {
            reader = new GifReader(image);
        } else if (format.equalsIgnoreCase("jpeg")) {
            reader = new JpegReader(image);
        }

        assert reader != null;
        decodedImage = reader.getDecodedImage();
        System.out.println(decodedImage);
    }
}
