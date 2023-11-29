package exercises.spring.greet;

public class Greeter {

    private final String name;

    public Greeter() {
        this("Warld");
    }

    public Greeter(String name) {
        this.name = name;
    }

    public void greet(String name){
        System.out.println(String.format("Hello, %s!", name));
    }
    public void greet(){
        System.out.println(String.format("Hello, %s!", name));
    }
}
