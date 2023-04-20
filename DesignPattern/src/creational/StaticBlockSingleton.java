package creational;

public class StaticBlockSingleton {
    private static StaticBlockSingleton instance;
    private StaticBlockSingleton(){
    }

    //static block initialization for exception handling
//    static{
//
//    }

    public static StaticBlockSingleton getInstance(){
        try{
            instance = new StaticBlockSingleton();
        }catch(Exception e){
            throw new RuntimeException("Exception occured in creating singleton instance");
        }
        return instance;
    }
}
//Use: Call StaticBlockSingleton.instance