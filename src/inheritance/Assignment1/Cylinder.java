package inheritance.Assignment1;


public class Cylinder extends ThreeDShape{

    public Cylinder(int radius, int height) {
        super(radius, height);
        name = "Cylinder";
    }

    @Override
    public int getLength() {
        return super.getLength();
    }

    @Override
    public int getHeight() {
        return super.getHeight();
    }

    @Override
    public void setLength(int length) {
        super.setLength(length);
    }

    @Override
    public void setHeight(int height) {
        super.setHeight(height);
    }

    @Override
    public double computeVolume() {
        volume = Math.PI * Math.pow(length,2) * height;
        return volume;
    }

    @Override
    public double computeSurfaceArea() {
        surfaceArea = (2 * Math.PI * Math.pow(length,2)) + (2 * Math.PI * length * height);
        return surfaceArea;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
