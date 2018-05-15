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


    public static void main(String[] args) {
        Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        person2.setName("Jane");
        System.out.println(person1.getName());
        System.out.println(person2.getName());
    }
}
