package fan;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        fan obj=new fan();
        fan obj1=new fan(1,10,"yellow",true);
        fan obj2=new fan(2,5,"blue",false);
        obj1.display();
        obj2.display();
    }
}
