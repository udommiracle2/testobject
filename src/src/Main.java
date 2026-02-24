public class Main{
    String name;
    int age;
    String course;

    public Main(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }


    public void introduce() {
        System.out.println("Hi, my name is " + name + ". I am " + age + " years old and I study " + course + ".");
    }

    public static void main(String[] args) {
        Main myObj = new Main("Miracle", 40, "Robotics");
        Main myObj2 = new Main("Udom", 100, "Quantum Physics");

        myObj.introduce();
        myObj2.introduce();
    }

}