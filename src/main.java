import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter width");
        double width=scanner.nextDouble();
        System.out.println("enter height");
        double height=scanner.nextDouble();
        rectangle rectangle = new rectangle(width,height);
        System.out.println("Your Rectangle \n"+ rectangle.display());
        System.out.println("Perimeter of the Rectangle: "+ rectangle.getPerimeter());
        System.out.println("Area of the Rectangle: "+ rectangle.getArea());
    }
    }

