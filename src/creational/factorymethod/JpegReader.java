package src.creational.factorymethod;

public class JpegReader implements ImageReader {
    private DecodedIamge decodedIamge;

    public JpegReader(String image) {
        this.decodedIamge = new DecodedIamge(image);
    }

    @Override
    public DecodedIamge getDecodedImage() {
        return decodedIamge;
    }
}
