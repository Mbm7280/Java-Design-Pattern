package iterator;

public class client {

    public static void main(String[] args) {

        Aggregate aggregate = new ConcreateAggreate();
        Iterator<Integer> iterator = (Iterator<Integer>) aggregate.createIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }

}
