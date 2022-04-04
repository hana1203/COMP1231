package inheritance.Assignment1;

public class Sphere extends ThreeDShape{

    public Sphere(int radius) {
        super(radius, radius);
        name = "Sphere";
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
        return volume = (double)4/3 * Math.PI * Math.pow(length,3);
    }

    @Override
    public double computeSurfaceArea() {
        return surfaceArea = 4 * Math.PI * Math.pow(length,2);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
