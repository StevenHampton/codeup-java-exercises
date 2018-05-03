public class Person {
    private String name;
    public String getName(){
        return name;
    }
    public void setName(String names){
       name = names;
    }
    public void sayHello(){
        System.out.println("Hello there " + name);
    }
    Person(String personName){
        setName(personName);
    }
}
