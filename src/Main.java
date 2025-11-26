public class Main
{
    public static void main(String[] args)
    {

        Animal[]  zoo =
                {
                new Dog("Rex", "Shepherd"),
                 new Pigeon("Sky", "Rock  Pigeon"),
                 new Blowfish("Puffy", "High"),
                new Fish("Nemo", 1, 0.2, true)
        };

        for (Animal a : zoo)
        {
            ((AnimalMove) a).move();
        }

        for (Animal a : zoo)
        {
            AnimalName.name(a.getName());
        }

        AnimalBehavior[] sleepers =
                {
                 new Dog("Bolt"),
                new Pigeon("Feather"),
                new Blowfish("Spike")
        };

        for (AnimalBehavior ab : sleepers)
        {
            ab.sleep();
        }
    }
}
