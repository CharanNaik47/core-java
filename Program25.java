class Program25 {

    static int rollNo = 101;
    static String name = "Anjali";
    static String course = "MCA";
    static float marks = 89.5f;
    static String grade = "A";

    public static void main(String[] args) {
        System.out.println("Roll No: " + getRollNo());
        System.out.println("Name: " + getName());
        System.out.println("Course: " + getCourse());
        System.out.println("Marks: " + getMarks());
        System.out.println("Grade: " + getGrade());
    }

    public static int getRollNo() {
        return rollNo;
    }

    public static String getName() {
        return name;
    }

    public static String getCourse() {
        return course;
    }

    public static float getMarks() {
        return marks;
    }

    public static String getGrade() {
        return grade;
    }
}
