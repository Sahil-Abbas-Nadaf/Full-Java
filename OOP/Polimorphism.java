interface Camera{
    void takeSnap();
    void recordVideo();
    //for example of Default method
    // private void greet(){  if the logic of default method is going to increse then the half code we can able to put in privater method
    //     System.out.println("Hello, Good Morning");
    // }
    default void record4kVideo(){
        //greet();
        System.out.println("Recording in 4k.");
    }
}

interface Wifi{
    String[] getNetworks();
    void connectToNetwork(String network);
}

class CellPhone{
    void callNumber(int phoneNumber){
        System.out.println("Calling "+phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting....");
    }
}

class SmartPhone extends CellPhone implements Wifi,Camera{
    public void takeSnap(){
        System.out.println("Taking Snap");
    }

    public void recordVideo(){
        System.out.println("Video Recording Start...");
    }

    public String[] getNetworks(){
        System.out.println("Gettign list of networks...");
        String[] networkList = {"Arman","Sahil","Mubin5G"};
        return networkList;
    }

    public void connectToNetwork(String network){
        System.out.println("Connecting To "+network);
    }

    public void greeting(){
        System.out.println("Hello World, Welcome to java developers.");
    }

    // public void record4kVideo(){
    //     System.out.println("take Snap and Recording in 4k.");
    // } 
}

public class Polimorphism{
    public static void main(String[] args) {
        /*poly means many
        and 
        forms means ways*/
        Camera cam = new SmartPhone();
        //cam.getNetworks();// throws an error bacauses we can access only Camera methods and we also provide reference of 
        // Camera that is way this allow only Camera's methods only for example
        //cam.greeting(); --> this is not allowed
        cam.record4kVideo();
        cam.recordVideo();
        cam.takeSnap();

        /* Notes :
          Camera cam = new SmartPhone(); this can use only Camera methods
          SmartPhone s = new SmartPhone(); this can use all methods because it is Inherited from the class and interfaces
          */
    SmartPhone sp = new SmartPhone();
    sp.recordVideo();
    sp.getNetworks();
    sp.callNumber(786);
    }
}