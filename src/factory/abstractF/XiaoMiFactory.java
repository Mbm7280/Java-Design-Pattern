package factory.abstractF;

import factory.FMethod.AbstractFactory;
import factory.FMethod.Phone;

public class XiaoMiFactory implements AbstarctFactory {

    @Override
    public factory.abstractF.Phone makePhone() {
        return new MiPhone();
    }

    @Override
    public Pc makePc() {
        return new XiaoMiPC();
    }
}
