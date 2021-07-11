package lv.sda;

public class Main {

    public static void main(String[] args) {

        Person person1 = new Person();
        person1.setAge(29);
        person1.setGender("Female");
        person1.setHeight(178);
        person1.setComplexion("White");

        System.out.println(person1.getAge());
        System.out.println(person1.getComplexion());
        System.out.println(person1.getGender());
        System.out.println(person1.getHeight());
        person1.running();
        person1.eating();
        person1.walking(false);
        person1.talking();

    }
}
