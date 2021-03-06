package iterator;

public class ConcreateAggreate implements Aggregate {

    private Integer[] items;

    public ConcreateAggreate(){
        items = new Integer[10];
        for(int i = 0;i < items.length; i++){
            items[i] = i;
        }
    }

    @Override
    public Iterator createIterator() {
        return new ConcreteIterator<Integer>(items);
    }
}
