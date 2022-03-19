public class Dog implements Beast{
    @Override
    public String roar() {
        String noise =  "BARK! WOOF! BARK";
        return noise;
    }
    @Override
    public String name() {
        String name =  "Daisy";
        return name;
    }
    @Override
    public String pet() {
        String action =  "* wags tail *";
        return action;
    }
}
