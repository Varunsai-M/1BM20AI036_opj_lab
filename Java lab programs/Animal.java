public abstract class Animal {
    protected Animal (int legs) {
        this.legs = legs;
    }
    public abstract void eat ();
    public void walk () {
        System.ou.println("This animal walks on " + legs + "legs.");
    }

}
public interface Pet {
    public String getName();
    public void setName (String n);
    public void play ();
}
public class Cat extends Animal implements Pet {
    private String name;
    public Cat (String n) {
        super (4);
        name = n;
    }
    public Cat() {
        this("");
    }
    public String getName() {
        return name;
    }
    public void setName (String n) {
        name = n;
    }
    public void play () {
        System.out.println("name + " likes to play with string.");
    }
    public void eat () {
        System.out.println("Cats like to eat spiders and mice.");
    }


}
public class Fish extends Animal implements Pet {
    private String name;
    public Fish () {
        super (0); 
    }

    public void setName (String name) {
        this.name = name;
    }
    public String getName () {
        return name;
    }
    public void play () {
        System.out.println("Fish swim in their tanks all day.");
    }
    public void walk () {
        super.walk();
        System.out.println("Fish, of course, can't walk; they swim.");
    }
    public void eat () {
        System.out.println("Fish eat pond scum.");
    }

}
public class Spider extends Animal {
    public Spider () {
        super (8);
    }

    public void eat () {
        System.out.println("The spider eats a fly.");
    }

}
public class TestAnimals {
    public static void main(String[] args) {
        Fish f = new Fish();
        Cat c = new Cat("Fluffy");
        Animal a = new Fish();
        Aminal e = new Cat ();

        f.play();
        c.play();
        e.eat();
        e.walk();
        a.walk();
    }
}
