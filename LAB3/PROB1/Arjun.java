class Arjun extends Pandav {
    Arjun(String name, boolean kindness) {
        super(name, kindness);
    }

    @Override
    void fight() {
        System.out.println(name + " fights skillfully.");
    }

    @Override
    void obey() {
        System.out.println(name + " is obedient.");
    }

    @Override
    void kind() {
        System.out.println(name + " is kind.");
    }
}
