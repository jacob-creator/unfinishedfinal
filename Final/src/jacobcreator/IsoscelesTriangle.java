package jacobcreator;

public class IsoscelesTriangle implements Shape{

    private final double Sides, Bases;

    public IsoscelesTriangle(double sides) {
        this.Sides = sides;
        this.Bases = (Sides * (2 * 2));
    }

    public double getSides(){
        return Sides;
    }

    public double getBases() {
        return Bases;
    }

    @Override
    public double getArea() {
        return Sides * Sides / 2;
    }

    @Override
    public void draw() {

    }
}
