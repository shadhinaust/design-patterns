package src.creational.factorymethod;

public class DecodedIamge {
    private String image;

    public DecodedIamge(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return image + ": is decoded";
    }
}
