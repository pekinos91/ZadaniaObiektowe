public class Dog extends Animal implements Canine{

    @Override
    public void bark() {
        System.out.print("bark bark bark");
    }
    void sitPretty(){
        System.out.println(name +" sits pretty");
    }


}
