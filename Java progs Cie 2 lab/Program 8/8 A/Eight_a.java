class WrongAge extends Exception {
    WrongAge(String message) {
        super(message);
    }
}
class AgeInvalid extends Exception {
    AgeInvalid(String message) {
        super(message);
    }
}
class Father {
    int age;
    public Father(int age) throws WrongAge {
        try{
        if (age <= 0) {
            throw new WrongAge("Age cannot be negative");
        }
        this.age = age;
    }
    catch(WrongAge e)
    {
        System.out.println(e.getMessage());
    }
  }
}
class Son extends Father {
    int age;
    public Son(int fatherAge, int sonAge) throws WrongAge, AgeInvalid {
        super(fatherAge);
        try{
        if (sonAge >= fatherAge) {
            throw new AgeInvalid("Son's age must be less than father's age");
        }
        this.age = sonAge;
    }
    catch(AgeInvalid e)
    {
        System.out.println(e.getMessage());
    }
  }
}
public class Eight_a {
    public static void main(String args[]) throws WrongAge, AgeInvalid
    {
        Father f = new Father(0);
        Son s = new Son(10,20);
    }
}