package CircleClass;

public class CircleClass {
    private double radius;
    CircleClass(){

    }
    CircleClass(double radius){
        this.radius=radius;
    }
    public double getRadius(){
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return Math.PI*(Math.pow(radius,2));
    }
    public double circumference(){
        return radius*2;
    }
    public void display()
    {
        System.out.println(getArea());
        System.out.println(circumference());
    }

}
