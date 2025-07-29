class StudentArrayRunner {
    public static void main(String[] args) {
        StudentArray[] students = new StudentArray[3];

        StudentArray s1 = new StudentArray();
        s1.setName("Charan");
        s1.setRollNo(101);
        students[0] = s1;

        StudentArray s2 = new StudentArray();
        s2.setName("Ravi");
        s2.setRollNo(102);
        students[1] = s2;

        StudentArray s3 = new StudentArray();
        s3.setName("Sneha");
        s3.setRollNo(103);
        students[2] = s3;

        for (int i = 0; i < students.length; i++) {
            StudentArray s = students[i];
            System.out.println("Name: " + s.getName());
            System.out.println("Roll No: " + s.getRollNo());
            System.out.println();
        }
    }
}