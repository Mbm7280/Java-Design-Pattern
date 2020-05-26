package factory.abstractF;

public class XiaoMiPC implements Pc {

    public XiaoMiPC() {
        this.makePc();
    }

    @Override
    public void makePc() {
        System.out.println("Make a XiaoMi Pc");
    }

}
