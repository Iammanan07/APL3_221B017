class Duryodhan extends Kaurav {
    Duryodhan(String name) {
        super(name);
    }

    @Override
    void fight() {
        System.out.println(name + " fights fiercely.");
    }

    @Override
    void disobey() {
        System.out.println(name + " is disobedient.");
    }

    @Override
    void cruel() {
        System.out.println(name + " is cruel.");
    }
}
