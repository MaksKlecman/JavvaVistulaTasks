public class Fish extends Animal implements AnimalMove
{
    protected boolean saltWater;

     public Fish() {}

    public Fish(String name, int age, double weight, boolean saltWater)
    {
        super(name, age, weight);
         this.saltWater = saltWater;
    }

     public Fish(String name)
    {
        super(name);
     }

    @Override
    public void eat()
    {
        System.out.println(name + " the fish eats alge");
    }

    @Override
     public void getVoice()
     {
        System.out.println(name + " cannot speak");
    }
}
