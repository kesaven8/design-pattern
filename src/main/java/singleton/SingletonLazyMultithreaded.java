package singleton;

public class SingletonLazyMultithreaded {

    private static SingletonLazyMultithreaded sc = null;
    private SingletonLazyMultithreaded(){}
    public static synchronized SingletonLazyMultithreaded getInstance(){ // synchronized is important as it solved the problem of 2 thread
        if(sc==null){
            sc = new SingletonLazyMultithreaded();
        }
        return sc;
    }

}
