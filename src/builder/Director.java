package builder;

public class Director {

    public Product constructProduct(Builder build){

        build.buildBasic();
        build.buildWall();
        build.buildRoof();
        return build.buildHouse();

    }

}
