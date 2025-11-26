public class Dog extends Mammal implements AnimalBehavior, AnimalMove
{
    private String breed;

      public Dog() {}

    public Dog(String name)
     {
        super(name);
    }

    public Dog(String name, String breed)
     {
         super(name);
        this.breed = breed;
    }

    @Override
    public void eat()
     {
        System.out.println(name + " eats dog food");
    }

    @Override
    public void getVoice()
    {
        System.out.println(name + " barks");
    }

    @Override
    public void sleep()
    {
        System.out.println(name + " the dog sleeps");
    }

    @Override
    public void move()
    {
        System.out.println("Dog runs  ");
    }

    public void fetch()
    {
        System.out.println(name + " fetche");
    }
}
