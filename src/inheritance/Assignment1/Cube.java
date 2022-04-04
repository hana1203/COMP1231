package inheritance.Assignment1;

public class Cube extends ThreeDShape {

    public Cube(int length) {
        super(length, length);
        name = "Cube";
    }

    @Override
    public int getLength() {
        return super.getLength();
    }

    @Override
    public void setLength(int length) {
        super.setLength(length);
    }

    @Override
    public double computeVolume() {
        return volume = length * length * length;
    }

    @Override
    public double computeSurfaceArea() {
        return surfaceArea = 6 * (length * length);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
