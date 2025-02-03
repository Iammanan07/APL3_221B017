/******************************************************************************

Welcome to GDB Online.
  GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
  C#, OCaml, VB, Perl, Swift, Prolog, Javascript, Pascal, COBOL, HTML, CSS, JS
  Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/

abstract class Bharatvanshi {
    abstract void fight();  // Every Bharatvanshi is a fighter.
}
class Pandav extends Bharatvanshi {
    boolean isObedient;
    String kindness;

    Pandav(boolean isObedient, String kindness) {
        this.isObedient = isObedient;
        this.kindness = kindness;
    }

    void obey() {
        if (isObedient) {
            System.out.println("Obeying orders!");
        } else {
            System.out.println("Disobedient.");
        }
    }

    void showKindness() {
        System.out.println("Kindness: " + kindness);
    }

    @Override
    void fight() {
        System.out.println("Fighting bravely!");
    }
}
class Kaurav extends Bharatvanshi {
    boolean isObedient;
    String cruelty;

    Kaurav(boolean isObedient, String cruelty) {
        this.isObedient = isObedient;
        this.cruelty = cruelty;
    }

    void disobey() {
        if (!isObedient) {
            System.out.println("Disobeying orders!");
        } else {
            System.out.println("Obeying orders.");
        }
    }

    void showCruelty() {
        System.out.println("Cruelty: " + cruelty);
    }

    @Override
    void fight() {
        System.out.println("Fighting fiercely, but with cruelty.");
    }
}
class Arjun extends Pandav {
    Arjun() {
        super(true, "Very kind");  // Arjun is obedient and kind
    }

    @Override
    void fight() {
        System.out.println("Arjun fights with skill and determination.");
    }
}
class Bheem extends Pandav {
    Bheem() {
        super(true, "Kind, but less so than Arjun");
    }

    @Override
    void fight() {
        System.out.println("Bheem fights with immense strength.");
    }
}
class Duryodhan extends Kaurav {
    Duryodhan() {
        super(false, "Cruel and power-hungry");
    }

    @Override
    void fight() {
        System.out.println("Duryodhan fights with cruelty and aggression.");
    }
}
class Vikarn extends Kaurav {
    Vikarn() {
        super(true, "Kind, obedient, and noble");
    }

    @Override
    void fight() {
        System.out.println("Vikarn fights honorably.");
    }
}
public class Main {
    public static void main(String[] args) {
        // Create instances for testing
        Arjun arjun = new Arjun();
        Bheem bheem = new Bheem();
        Duryodhan duryodhan = new Duryodhan();
        Vikarn vikarn = new Vikarn();

        // Test Pandavs
        arjun.fight();  // Outputs: Arjun fights with skill and determination.
        arjun.obey();   // Outputs: Obeying orders!
        arjun.showKindness();  // Outputs: Kindness: Very kind

        bheem.fight();  // Outputs: Bheem fights with immense strength.
        bheem.obey();   // Outputs: Obeying orders!
        bheem.showKindness();  // Outputs: Kindness: Kind, but less so than Arjun

        // Test Kauravs
        duryodhan.fight();  // Outputs: Duryodhan fights with cruelty and aggression.
        duryodhan.disobey();  // Outputs: Disobeying orders!
        duryodhan.showCruelty();  // Outputs: Cruelty: Cruel and power-hungry

        vikarn.fight();  // Outputs: Vikarn fights honorably.
           // Outputs: Obeying orders.
        vikarn.showCruelty();  // Outputs: Cruelty: Kind, obedient, and noble
    }
}
