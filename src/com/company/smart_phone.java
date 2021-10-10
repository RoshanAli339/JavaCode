package com.company;

interface camera{
    void takeSnap();
    void recordVideo();
    private void greet(){
        System.out.println("Good morning");
    }
    default void recordin4k(){
        greet();
        System.out.println("Recording in 4k....");
    }
}
interface wifi{
    String[] getNetworks();
    void connecttonetwork(String network);
}
class Myphone{
    void cellPhone(long phoneNum){
        System.out.println("Calling: "+phoneNum);
    }
    void pickCall(long phoneNUmber){
        System.out.println("Ringing: "+phoneNUmber);
    }
}
class MySmartPhone extends Myphone implements camera, wifi{
    // public void recordin4k(){
    //    System.out.println("Taking snap in 4k");
    //} this overriding will be successful and there wouldn't be any error and the above statement will print
    public void takeSnap(){
        System.out.println("Taking a picture..");
    }
    public void recordVideo(){
        System.out.println("Capturing video....");
    }
    public String[] getNetworks(){
        System.out.println("Getting list of networks: ");
        String[] networklist = {"Harry","Roshan","Sadiq","Rafi"};
        return networklist;
    }
    public void connecttonetwork(String network){
        System.out.println("Connecting to: "+network);
    }
}
public class smart_phone {
    public static void main(String[] args) {
        MySmartPhone vivo = new MySmartPhone();
        vivo.takeSnap();
        vivo.recordVideo();
        String[] list = vivo.getNetworks();
        for(String item: list)
            System.out.println(item);
        vivo.connecttonetwork("Roshan");
        vivo.cellPhone(994964741);
        vivo.pickCall(901478578);
        vivo.recordin4k();//this will represent the default class automatically without being implemented in MySmartPhone
        // vivo.greet(); this is an error because private methods cannot be called....
        camera cam1 = new MySmartPhone();
        //cam1.connecttonetwork("Roshan"); cannot be used because cam1 is an object of camera in smartphone
        // so we cannot use any other methods except for the one's in camera
        cam1.recordVideo();
        cam1.recordin4k();
    }
}
