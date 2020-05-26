package factory.FMethod;

/**
 * FirstTime 2020-05-26
 */
public class TestMake {

    public static void main(String[] args) {

        AbstractFactory xiaoMiFactory = new XiaoMiFactory();
        AbstractFactory appleFactory = new AppleFactory();
        xiaoMiFactory.makePhone();

        System.out.println("--------------");

        appleFactory.makePhone();

    }

}
