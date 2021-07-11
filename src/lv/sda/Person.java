package lv.sda;

public class Person {
    private double height;
    private String gender;
    private String complexion;
    private int age;

    public double getHeight(){
        return height;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public String getGender(){
        return gender;
    }

    public void setGender(String gender){
        this.gender = gender;
    }

    public String getComplexion(){
        return complexion;
    }

    public void setComplexion(String complexion) {
        this.complexion = complexion;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void walking(boolean canWalk){
        if (canWalk){
            System.out.println("The person is walking near to me!");
        } else {
            System.out.println("The person is probably ill or a toddler.");
        }

    }

    public void talking(){
        System.out.println("The person is talking to me!");
    }

    public void eating(){
        System.out.println("The person is eating my food!");
    }

    public void running(){
        System.out.println("The person is running from me!");
    }
}
