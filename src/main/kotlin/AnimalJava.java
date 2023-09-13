public class AnimalJava {

    private String name;

    public AnimalJava() {}

    public AnimalJava(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void breath() {
        System.out.println(name + " is breathing");
    }
}