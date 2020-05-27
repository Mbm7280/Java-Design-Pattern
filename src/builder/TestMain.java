package builder;

// 2020-05-27
public class TestMain {

    public static void main(String[] args) {

        Director director = new Director();
        director.constructProduct(new ConcerteBuilder());

    }

}
