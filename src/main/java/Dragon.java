public class Dragon {
    public String title(){
        String Name = "Smaug";
        return Name + " the Dragon!";
    }
    public String speak(){
        return "It is I " + title();
    }
    public String attack(){
        return  "* breaths fire *";
    }
}
