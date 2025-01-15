class Circle{
    public int radius;

    public Circle(int r){
        System.out.println("I am Circle paramererized constructor.");
        this.radius = r;
    }
    public double area(){
        return Math.PI * this.radius * this.radius;
    }
}

class Cylinder extends Circle{
    int height;
    public Cylinder(int r, int h){
        super(r);
        this.height = h;
        System.out.format("The Radius is %d and Height is %d\n",this.radius, this.height);
    }
    public double volume(){
        return  Math.PI * this.radius * this.radius * this.height;
    }
}

class practiceonInheritance{
    public static void main(String[] args) {
        // problem 1:
        //Circle objC = new Circle(12);
        Cylinder obj = new Cylinder(12,14);
        double vol =  obj.volume();
        System.out.println("the volume of cylinder is:: "+ vol);

    }
}