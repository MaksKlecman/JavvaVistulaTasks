public class Bird extends Animal
{
     protected String featherColor;

    public Bird() {}

    public Bird(String name, int age, double weight, String featherColor)
    {
        super(name, age, weight);
         this.featherColor = featherColor;
    }

    public Bird(String name)
     {
        super(name);
    }


    public Bird(String name, String featherColor)
    {
         super(name);
        this.featherColor = featherColor;
    }

    @Override
    public void eat()
    {
        System.out.println(name + "  the bird eats seeds");
    }

    @Override
    public void getVoice()
    {
        System.out.println(name + " chi rps");
    }
}
