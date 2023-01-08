class Teacher {
    private int Teacher_ID;
    private String Teacher_name;
    private String T_specialization;
    private String T_Collegename;
    private int T_experience;
    private String T_Course;

    public void initialize(int Teacher_ID, String Teacher_name, String T_specialization, 
            String T_Collegename, int T_experience, String T_Course) {
        this.Teacher_ID = Teacher_ID;
        this.Teacher_name = Teacher_name;
        this.T_specialization = T_specialization;
        this.T_Collegename = T_Collegename;
        this.T_experience = T_experience;
        this.T_Course = T_Course;
    }

    public void display() {
        System.out.println("Teacher ID: " + Teacher_ID);
        System.out.println("Teacher name: " + Teacher_name);
        System.out.println("Specialization: " + T_specialization);
        System.out.println("College name: " + T_Collegename);
        System.out.println("Experience: " + T_experience);
        System.out.println("Course: " + T_Course);
    }
}

public class Driver {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.initialize(123, "John Smith", "Computer Science", "XYZ College", 10, "Java Programming");
        t.display();
    }
}
