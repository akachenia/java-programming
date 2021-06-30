package day58_polymorphism;

public class Casting {
    public static void main(String[] args) {
        // variable of worker and object of superMAn

        Worker worker = new SuperMan();
        worker.work("QA Manager");
        worker.getPaid();

        ((Father)worker).raiseKid();
        ((SuperMan) worker).playWithKid();

        //DownCasting from
        SuperMan superMan = (SuperMan) worker;
        superMan.feedKid();
        superMan.work("java dev");



    }
}
