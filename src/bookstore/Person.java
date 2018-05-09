package bookstore;

public class Person {

    private String name;
    Person(){}
    public Person(String name) {
        this.name = name;
        System.out.println("Person: ");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Person(String name, int books){
        System.out.println("Author: " + name + ", books:" + books);
    }
}
