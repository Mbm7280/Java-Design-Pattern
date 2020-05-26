package factory.abstractF;

public class AppleFactory implements AbstarctFactory {
    @Override
    public Phone makePhone() {
        return new ApplePhone();
    }

    @Override
    public Pc makePc() {
        return new AppleMac();
    }
}
