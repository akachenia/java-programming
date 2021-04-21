package offcieHours;

public class CastingPractise {
    public static void main(String[] args) {
        //byte -> short-> int-> long-> float -> double

        byte b = 10;
        short s = b;
        byte b2 = (byte) s;

        double d = 5.3;
        int i = (short) d;
        int i2 = (int) d;
        System.out.println(i);
        System.out.println((double) i);
        float f = 3.54f;
        float f2 = (float) 3.54;

        float f3 = 5; //float = int -> 5.0
        float f4 = 5.5F; // float = double

        long l = 22313; // long = int
        long l2 = 312312313323L;
        System.out.println(l);
        System.out.println((double) l);
        System.out.println((float) l);
        double million = 1_000_000;
        System.out.println(million);


    }
}
