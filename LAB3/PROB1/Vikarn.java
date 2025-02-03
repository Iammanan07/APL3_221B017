class Vikarn extends Kaurav {
    Vikarn(String name) {
        super(name);
    }

    @Override
    void fight() {
        System.out.println(name + " fights well.");
    }

    @Override
    void disobey() {
        System.out.println(name + " is obedient.");
    }

    @Override
    void cruel() {
        System.out.println(name + " is kind.");
    }
}
