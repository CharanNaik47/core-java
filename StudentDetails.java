class StudentDetails {
    public static void main(String[] args) {
        String[] names = {"Anu", "Ravi", "Sneha", "John", "Priya", "Kiran", "Meena", "Ajay", "Divya", "Vikas"};
        int[] ages = {20, 21, 22, 20, 23, 21, 22, 20, 23, 21};
        float[] marks = {85.5f, 75.2f, 90.0f, 88.5f, 92.1f, 78.0f, 80.5f, 86.3f, 79.4f, 88.0f};
        char[] grades = {'A', 'B', 'A', 'A', 'A', 'B', 'B', 'A', 'B', 'A'};
        long[] rollNos = {101,102,103,104,105,106,107,108,109,110};

        for (String name : names) {
            System.out.println("Name: " + name);
        }
        for (int age : ages) {
            System.out.println("Age: " + age);
        }
        for (float mark : marks) {
            System.out.println("Marks: " + mark);
        }
        for (char grade : grades) {
            System.out.println("Grade: " + grade);
        }
        for (long roll : rollNos) {
            System.out.println("Roll No: " + roll);
        }
    }
}
