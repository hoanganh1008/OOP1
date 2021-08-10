package fan;

public class fan {
    public static final int SLOW=1,MEDIUM=2,FAST=3;
    private int speed=1;
    private boolean isRunning=false;
    private double radius=5;
    private String color="blue";
    public fan(){
    }
    public fan(int speed,double radius,String color,boolean isRunning){
        this.speed=speed;
        this.radius=radius;
        this.color=color;
        this.isRunning=isRunning;
    }
    public int getSpeed()
    {
        return this.speed;
    }

    public double getRadius()
    {
        return this.radius;
    }
    public boolean getRunning()
    {
        return true;
    }
    public String getColor(){
        return this.color;}
    public void display()
        {
            if(isRunning)
            {
                System.out.println("Fan is on and the speed is:"+speed+"color:"+color+"radius is"+ radius);
        }
            else
            {
                System.out.println("Fan is off"+"color:"+color+"radius is"+ radius);
            }
    }

}
