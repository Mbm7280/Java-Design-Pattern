package factory.FMethod;

public class AppleFactory implements AbstractFactory {
    @Override
    public Phone makePhone() {
        return new ApplePhone();
    }
}
