package src.creational.factorymethod;

public class GifReader implements ImageReader {
    private DecodedIamge decodedImage;

    public GifReader(String image) {
        this.decodedImage = new DecodedIamge(image);
    }

    @Override
    public DecodedIamge getDecodedImage() {
        return decodedImage;
    }
}
