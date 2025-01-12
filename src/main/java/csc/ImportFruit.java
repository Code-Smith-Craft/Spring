package csc;

public class ImportFruit {

    private Fruit fruit;

    public ImportFruit(Fruit fruit) {
        this.fruit = fruit;
    }

    public void whatFruit() {
        System.out.println("This is a fruit " + fruit.getName() + " import to Russia");
    }
}
