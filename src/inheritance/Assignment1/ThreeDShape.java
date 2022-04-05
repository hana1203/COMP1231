package inheritance.Assignment1;

public class ThreeDShape {
    // Store fundamental attribute data about its dimensions.
    protected String name;
    protected int length;
    protected int height;
    protected double volume;
    protected double surfaceArea;

    // Set up 3D shape with common attribute : length and height.
    public ThreeDShape(int length, int height) {
       this.length = length;
       this.height = height;
       this.name = "3D shape";
    }

    // Provide methods to access dimension data.
    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }

    // Provide methods to modify dimension data.
    public void setLength(int length) {
        this.length = length;
    }
    public void setHeight(int height) {
        this.height = height;
    }

    // Provide a method to compute shape’s volume.
    public double computeVolume() {
        return volume;
    }

    // Provide a method to compute surface area.
    public double computeSurfaceArea() {
        return surfaceArea;
    }

    // Return a description of 3D shape as a string.
    public String toString() {
        if (length <0 || height <0) {
            return "invalid length";
        }
        return "Name of the 3D shape: "+ name + "\nVolume: "+volume + "\nSurface Area: "+surfaceArea;
    }
}
