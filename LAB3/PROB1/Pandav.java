abstract class Pandav extends Bharatvanshi {
    String name;
    boolean kindness; 

    Pandav(String name, boolean kindness) {
        this.name = name;
        this.kindness = kindness;
    }

    abstract void obey();
    abstract void kind();
}
