package factory.builder;

public class ConcerteBuilder implements Builder {

    private Product product;

    public ConcerteBuilder(){
        product = new Product();
    }

    @Override
    public void buildBasic() {
        System.out.println("建造地基");
    }

    @Override
    public void buildWall() {
        System.out.println("建造围墙");
    }

    @Override
    public void buildRoof() {
        System.out.println("建造屋顶");
    }

    @Override
    public Product buildHouse() {
        return product;
    }
}
