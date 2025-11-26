public class Pigeon extends Bird implements AnimalBehavior, AnimalMove
{
    private String species;

      public Pigeon() {}

    public Pigeon(String name) {
        super(name);
    }

    public Pigeon(String name, String species)
    {
        super(name);
        this.species = species;
    }

    @Override
    public void getVoice()
     {
        System.out.println(name + " cos");
    }

    @Override
     public void sleep()
    {
        System.out.println(name + " the pigeon sleeps");
    }

    @Override
    public void move()
    {
        System.out.println("Pigeon  flies");
    }

    public void deliverMessage()
    {
        System.out.println(name + "   delivers a message");
    }

}
