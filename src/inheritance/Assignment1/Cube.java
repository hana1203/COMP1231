package inheritance.Assignment1;

public class Cube extends ThreeDShape {

    // Set up only 1 parameter, as Cube is the 3D shape having the same length and height.
    public Cube(int length) {
        super(length, length);
        name = "Cube";
    }

    // Override the parent class's get, set method to access and modify the length.
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
