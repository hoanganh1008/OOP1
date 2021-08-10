package quaDraticEquation;

public class QuadraticEquation {
    double a,b,c;
    public QuadraticEquation(){}
        public QuadraticEquation(double a, double b,double c){
        this.a=a;
        this.b=b;
        this.c=c;}
        public double getA()
            {
                return this.a;
            }
        public double getB(){
        return this.b;
        }
        public double getC(){
        return this.c;
        }
        public double getDiscriminant(){
        double delta=Math.pow(b,2) - 4 * a * c;
        return delta;
        }
        public double getRoot1(){
        if(getDiscriminant()<0)
        return 0;
        else{double r1=(-b+Math.sqrt(Math.pow(b,2) - 4 * a * c))/2*a;
        return r1;   }}
        public double getRoot2(){
        if(getDiscriminant()<0){
            return 0;
        }
        else{
        double r2=(-b-Math.sqrt(Math.pow(b,2) - 4 * a * c))/2*a;
        return r2;
    }}
}
