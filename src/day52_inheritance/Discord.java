package day52_inheritance;

public class Discord extends MobileApp{
    public void Chat(String someone){
        System.out.println("Chatting with " + someone + " on Discord");
    }

    /*
    override download method
     */

    @Override
    public boolean download(){
        System.out.println("Downloaded Discord 0.0.23 from App Store");
        return true;
    }

    @Override
    public void useTheApp(int minutes){
        super.useTheApp(minutes);
        Chat("Vladislav");

    }

    public void printInfo(){
        System.out.println("App Name = " + getName());
        System.out.println("App Version = " + getVersion());
    }



}
