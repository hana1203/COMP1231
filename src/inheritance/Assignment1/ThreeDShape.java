package inheritance.Assignment1;

public class ThreeDShape {
    protected String name;
    protected int length;
    protected int height;
    protected double volume;
    protected double surfaceArea;

    // store fundamental attribute data about its dimensions
    public ThreeDShape(int length, int height) {
       this.length = length;
       this.height = height;
       this.name = "3D shape";
    }

    // provide methods to access dimension data

    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }

    // provide methods to modify dimension data
    public void setLength(int length) {
        this.length = length;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    // provide a method to compute shape’s volume
    public double computeVolume() {
        return volume;
    }

    // provide a method to compute surface area
    public double computeSurfaceArea() {
        return surfaceArea;
    }

    // print out
    public String toString() {
        return "Name of the 3D shape: "+ name + "\nVolume: "+volume + "\nSurface Area: "+surfaceArea;
    }
}
