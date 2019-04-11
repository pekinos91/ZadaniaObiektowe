public class Wolf extends Animal implements Canine{
    int fangLength;
    @Override
    public void introduce() {
        super.introduce();
        System.out.println(" and my fang length is " + fangLength);
    }

   @Override
    public void bark(){

        System.out.print("BARK BARK BARK");
   }

}
