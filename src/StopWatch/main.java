package StopWatch;

import javafx.scene.paint.Stop;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StopWatch stopWatch=new StopWatch();
        System.out.println("enter 1 to start");
        int start=sc.nextInt();
        if(start==1)
        {
            stopWatch.start();
            System.out.println("now is "+java.time.LocalTime.now());
        }
        System.out.println("enter 0 to stop");
        int stop = sc.nextInt();
        if(stop==0)
        {
            stopWatch.stop();
            System.out.println("now is"+java.time.LocalTime.now());
            System.out.println(stopWatch.getElapsedtime());
        }
    }
}
