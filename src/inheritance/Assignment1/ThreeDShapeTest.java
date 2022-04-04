package inheritance.Assignment1;

public class ThreeDShapeTest {
    public static void main(String[] args) {
        Cube cube = new Cube(10);
        cube.computeSurfaceArea();
        cube.computeVolume();
        System.out.println(cube);

        Sphere sphere = new Sphere(15);
        System.out.println(sphere.getLength());
        System.out.println(sphere.getHeight());
        sphere.computeSurfaceArea();
        sphere.computeVolume();
        System.out.println(sphere);

        Cylinder cylinder = new Cylinder(5, 10);
        System.out.println(cylinder.getLength());
        System.out.println(cylinder.getHeight());
        cylinder.computeVolume();
        cylinder.computeSurfaceArea();
        System.out.println(cylinder);

    }





}
