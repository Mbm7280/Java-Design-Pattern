package factory.abstractF;

/**
 * FirstTime 2020-05-26
 */
public class TestMake {

    public static void main(String[] args) {

        AbstarctFactory miFactory = new XiaoMiFactory();

        AbstarctFactory appleFactory = new AppleFactory();

        miFactory.makePc();
        miFactory.makePhone();

        System.out.println("--------------");

        appleFactory.makePhone();
        appleFactory.makePc();

    }

}
