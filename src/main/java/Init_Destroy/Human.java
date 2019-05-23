package Init_Destroy;

public class Human {
    private String name ;
    private int age ;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public void introduce(){
        System.out.println("My name is : "+this.name+" age : "+this.age+" ." );

    }

    public void die(){
        System.out.println("I'm dead .");

    }
}
