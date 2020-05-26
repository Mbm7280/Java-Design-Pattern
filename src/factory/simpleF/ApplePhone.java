package factory.simpleF;

public class ApplePhone implements Phone {

    public ApplePhone() {
        this.make();
    }

    @Override
    public void make() {
        System.out.println("Make a Apple Phone");
    }
}
