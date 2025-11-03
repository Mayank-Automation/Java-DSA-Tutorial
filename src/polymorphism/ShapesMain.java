package polymorphism;

public class ShapesMain {

    static void main() {

        Shapes shape = new Shapes();
        Circle circle = new Circle();
        Square square = new Square();
        Shapes shape1 = new Circle();
        Shapes circle2 = new Circle();

        shape.area();
        circle.area();
        square.area();
        shape1.area();
        circle2.area();


    }
}
