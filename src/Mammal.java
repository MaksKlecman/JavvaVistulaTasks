public class Mammal extends Animal
{
     protected boolean hasFur;

    public Mammal() {}

    public Mammal(String name, int age, double weight, boolean hasFur)
    {
        super(name, age, weight);
         this.hasFur = hasFur;
    }

    public Mammal(String name)
    {
        super(name);
     }

    @Override
     public void eat()
     {
        System.out.println(name + " the mammal eats");
    }

    @Override
    public void getVoice()
    {
        System.out.println(name + " makes mammal sounds");
    }
}
