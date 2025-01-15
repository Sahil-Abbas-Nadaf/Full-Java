import com.sahil.shape.Rectangle;
import com.sahil.shape.Shape;
import com.sahil.shape.Square;
import com.sahil.shape.Circle;
import com.sahil.shape.Cylinder;

public class RunExShape {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(4, 5);
        Square sq = new Square(5);
        Circle c = new Circle(6);
        Cylinder cd = new Cylinder(2, 3);

        double ra = r.area();
        System.out.println("Area of Rectangle is " + ra);

        double sqa = sq.area();
        System.out.println("Area of Square is " + sqa);

        double ca = c.area();
        System.out.println("Area of Circle is " + ca);

        double cda = cd.area();
        System.out.println("Surface Area of Cylinder is " + cda);
    }
}
