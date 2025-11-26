public class Blowfish extends Fish implements AnimalBehavior, AnimalMove
{
     private String dangerLevel;

    public Blowfish() {}

    public Blowfish(String name)
    {
        super(name);
    }

    public Blowfish(String name, String dangerLevel)

    {
        super(name);
        this.dangerLevel = dangerLevel;
    }

    @Override
    public void eat()
    {
        System.out.println(name + " eat small sea food");
     }

    @Override
    public void sleep()
    {
        System.out.println(name + " the blowfish sleeps");
    }

    @Override
    public void move()
    {
        System.out.println("Blowfish swims");
    }

    public void inflate()
    {
        System.out.println(name + " infles");
    }

}
