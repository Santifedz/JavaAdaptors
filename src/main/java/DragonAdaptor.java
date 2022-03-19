public class DragonAdaptor implements Beast{
    Dragon Deez;

    public DragonAdaptor(Dragon Deez) {
        Deez = new Dragon();
    }

    @Override
    public String roar() {
        return Deez.speak();
    }

    @Override
    public String name() {
        return Deez.title();
    }

    @Override
    public String pet() {
        return Deez.attack();
    }
}
