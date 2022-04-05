package inheritance.Assignment1;

public class ThreeDShapeTest {
    public static void main(String[] args) {

        // Create an array reference for 3D shape
        ThreeDShape[] shapes = new ThreeDShape[8];

        // Instantiate different shapes with different dimensions
        shapes[0] = new Cube(0);
        shapes[1] = new Cube(-1);
        shapes[2] = new Cube(1);
        shapes[3] = new Cube(10);
        shapes[4] = new Sphere(5);
        shapes[5] = new Sphere(10);
        shapes[6] = new Cylinder(3,5);
        shapes[7] = new Cylinder(7,10);

        //Compute the volume and surface area and print out for each shape.
        for (ThreeDShape shape: shapes) {
            shape.computeVolume();
            shape.computeSurfaceArea();
            System.out.println(shape);
            System.out.println("====================");
        }
        /*
        Name of the 3D shape: Cube
        Volume: 0.0
        Surface Area: 0.0
        ====================
        invalid length
        ====================
        Name of the 3D shape: Cube
        Volume: 1.0
        Surface Area: 6.0
        ====================
        Name of the 3D shape: Cube
        Volume: 1000.0
        Surface Area: 600.0
        ====================
        Name of the 3D shape: Sphere
        Volume: 523.5987755982989
        Surface Area: 314.1592653589793
        ====================
        Name of the 3D shape: Sphere
        Volume: 4188.790204786391
        Surface Area: 1256.6370614359173
        ====================
        Name of the 3D shape: Cylinder
        Volume: 141.3716694115407
        Surface Area: 150.79644737231007
        ====================
        Name of the 3D shape: Cylinder
        Volume: 1539.3804002589986
        Surface Area: 747.6990515543707
        ====================
         */

//        //Set particular length and height for each shape
//        for (ThreeDShape shape: shapes) {
//            shape.setLength(1);
//            shape.setHeight(2);
//            System.out.println("length: " + shape.getLength());
//            System.out.println("height: " + shape.getHeight());
//            shape.computeVolume();
//            shape.computeSurfaceArea();
//            System.out.println(shape);
//        }
            /*
            length: 1
            height: 2
            Name of the 3D shape: Cube
            Volume: 1.0
            Surface Area: 6.0

            length: 1
            height: 2
            Name of the 3D shape: Sphere
            Volume: 4.1887902047863905
            Surface Area: 12.566370614359172

            length: 1
            height: 2
            Name of the 3D shape: Cylinder
            Volume: 6.283185307179586
            Surface Area: 18.84955592153876

             */

        }

    }
