package factory.FMethod;

public class MiPhone implements Phone {

    public MiPhone() {
        this.make();
    }

    @Override
    public void make() {
        System.out.println("Make a XiaoMi Phone");
    }
}
