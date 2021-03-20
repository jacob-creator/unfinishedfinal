package jacobcreator;

public class Pyramid implements Shape{
    private final double Height, Width;

    public Pyramid (double height) {
        Height = height;
        Width = Height * 2;
    }

    public double getHeight(){
        return Height;
    }

    public double getWidth() {
        return Width;
    }

    @Override
    public double getArea() {
        return Width * Height / 2;
    }

    @Override
    public void draw() {

    }
}
