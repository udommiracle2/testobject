public class Student{
    String name;
    int age;
    String course;

    public Student(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }


    public void introduce() {
        System.out.println("Hi, my name is " + name + ". I am " + age + " years old and I study " + course + ".");
    }

    public static void main(String[] args) {
        Student myObj = new Student("Miracle", 40, "Robotics");
        Student myObj2 = new Student("Udom", 100, "Quantum Physics");

        myObj.introduce();
        myObj2.introduce();
    }

}