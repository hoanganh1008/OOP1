package StopWatch;

public class StopWatch {
    long startTime=0;
    long stopTime=0;
    public boolean isRunning=false;
    public void start(){
        this.startTime=System.currentTimeMillis();
        this.isRunning=true;
    }
    public void stop(){
        this.stopTime=System.currentTimeMillis();
        this.isRunning=false;
    }
    public long getElapsedtime(){
        long time;
        if(isRunning){
            time=(System.currentTimeMillis()-startTime);
        }
        else{
            time=(stopTime-startTime);
        }
        return time;
    }
}

