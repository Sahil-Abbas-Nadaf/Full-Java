class Cylinder{
    private int radius;
    private int height;

    public Cylinder(int radius, int height){
        this.radius = radius; 
        this.height = height;
    }

    public int getRadius(){
        return radius;
    }

    public int getHeight(){
        return height;
    }

    public void setRadius(int radius){
        this.radius = radius;
    }

    public void setHeight(int height){
        this.height = height;
    }

    public double surfaceArea(){
        return 2 * Math.PI * radius * radius + 2 * Math.PI * radius * height;
    }

    public double volume(){
        return  Math.PI * radius * radius * height;
    }
}

class Rectangle{
    private int lenght;
    private int breadth;

    public Rectangle(){
        lenght = 4;
        breadth = 5;
    }

    public Rectangle(int lenght, int breadth){
        this.lenght = lenght;
        this.breadth = breadth;
    }

    public int getlenght(){
        return lenght;
    }

    public int getbreadth(){
        return breadth;
    }
}

public class PracticesetonContructure{
    public static void main(String[] args) {
    /*
        // problem 1:
    Cylinder c = new Cylinder(9,12);
    //c.setRadius(9);
    //c.setHeight(12);
    System.out.println("The Radius is:: "+c.getRadius());
    System.out.println("The Height is:: "+c.getHeight());

    // problem 2:
    System.out.println("The surface area is: "+ c.surfaceArea());
    System.out.println("The surface area is: "+ c.volume());
    */

    // problem 3:
    Rectangle r = new Rectangle(12,30);
    System.out.println(r.getlenght());
    System.out.println(r.getbreadth());

    }
}