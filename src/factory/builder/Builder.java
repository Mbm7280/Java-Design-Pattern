package factory.builder;

public interface Builder {


    // 建造地基
    public void buildBasic();

    // 建造围墙
    public void buildWall();

    // 建造屋顶
    public void buildRoof();

    // 建造房子
    public Product buildHouse();

}
