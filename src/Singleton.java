public class Singleton {

    //1.饿汉模式
//    private static Singleton instance  = new Singleton();

    //1.懒汉模式
    private volatile static Singleton instance ;

    private  Singleton(){};

    public static  Singleton getInstance() {
        if(instance == null){
            synchronized(Singleton.class){
                if(instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }


}
