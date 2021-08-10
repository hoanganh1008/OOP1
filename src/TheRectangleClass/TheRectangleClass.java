package TheRectangleClass;

public class TheRectangleClass {
    float length;
    float width;
    TheRectangleClass(float length,float width){
        this.length=length;
        this.width=width;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }
    public float getArea(){
        return width*length;
    }
    public float getPerimeter(){
        return (width+length)*2;
    }
    public void display()
    {
        System.out.println(getArea());
        System.out.println(getPerimeter());
    }
}
