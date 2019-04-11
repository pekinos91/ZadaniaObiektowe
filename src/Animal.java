import java.util.concurrent.atomic.AtomicInteger;

public abstract class Animal {

    static AtomicInteger nextId = new AtomicInteger();
    private int id;
    String name;
    float weight;


    public void introduce(){
        System.out.print(getId() + " : I'm a " +getClass().getTypeName()+ ". My name is " + getName() + " I weigh " + getWeight() + " kg");

    }


    public Animal() {
        id = nextId.incrementAndGet();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getWeight() {
        return weight;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

}
