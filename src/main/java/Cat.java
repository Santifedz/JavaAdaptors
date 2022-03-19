public class Cat implements Beast {
    @Override
    public String roar() {
        String noise =  "Meow! i'm a cat";
        return noise;
    }
    @Override
    public String name() {
        String name =  "Sabrina";
        return name;
    }
    @Override
    public String pet() {
        String action =  "* purrrs *";
        return action;
    }

}
