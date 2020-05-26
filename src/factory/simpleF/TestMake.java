package factory.simpleF;

/**
 * FirstTime 2020-05-26
 */
public class TestMake {

    public static void main(String[] args) {

        PhoneFactory factory = new PhoneFactory();
        Phone miPhone = factory.phoneMake("MiPhone");
        Phone applePhone = factory.phoneMake("ApplePhone");

    }

}
