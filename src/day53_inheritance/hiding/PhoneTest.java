package day53_inheritance.hiding;

import day53_inheritance.tesla.ModelX;

public class PhoneTest {
    public static void main(String[] args) {
        Phone phone = new Phone();
        Mobile mobile = new Mobile();

        phone.call();
        mobile.text();
        mobile.call();
    }
}
