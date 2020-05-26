package factory.abstractF;

public class AppleMac implements Pc {

    public AppleMac() {
        this.makePc();
    }

    @Override
    public void makePc() {
        System.out.println("Make a Apple Mac");
    }

}
