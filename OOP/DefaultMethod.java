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

    // public void record4kVideo(){
    //     System.out.println("take Snap and Recording in 4k.");
    // }
}
public class DefaultMethod{
    public static void main(String[] args) {
        SmartPhone vivo = new SmartPhone();
        //vivo.greet(); --> throws an erro
        vivo.record4kVideo();
        String[] strArr = vivo.getNetworks();

        for(String items: strArr){
            System.out.println(items);
        }
    }
}
/*  Default Method using in Interface in java : 
jab bhi ham interface tayar karte hai aur use interface me jitni bhi 
methods hote hai vo hame simple class me implement karne hote hai aur 
vo bhi public. usi vakt for example hamne bahut sare interfaces tayar kar
liye then hame laga ki vo ek method implement kare to hame usi method ko
har jagah implement karna hoga jaha bhi hamne us interface ka access diya hoga.
usi ki bajay java developers ne ek default namak method tayar ki hai 
jisk madaat se ham log us method ko interface me hi implement kar sakenge
aur error bhi nahi milega aur hame us method ko kahi bhi implement nahi karna 
padhega but jab bhi use interface me implement karenge aur vo method 
reference class me bhi karenge to reference wale class ka implementation
run ho jayega aur jo bhi operation hai vo perform hoga.*/