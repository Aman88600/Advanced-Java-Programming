class Student {
    private String name;
    private int age;

    public Student() {
        this.name = "";
        this.age = 0;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class StudentBean {
    public static void main(String[] args) {
        Student obj = new Student();
        obj.setAge(21);
        obj.setName("Aman Basoya");

        String name = obj.getName();
        int age = obj.getAge();

        System.out.printf("The Name of Student is %s and Age is %d", name, age);
    }
}
