package jacobcreator;

public class Rectangle implements Shape{

        private final double Width, Height;

        public Rectangle (double width, double height) {
            Width = width;
            Height = height;
        }

        public double getWidth() {
            return Width;
        }

        public double getHeight() {
            return Height;
        }

        @Override
        public double getArea() {
            return Width * Height;
        }

        @Override
        public void draw() {
        }
}
