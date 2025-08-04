class TeacherArrayRunner {
    public static void main(String[] args) {
        TeacherArray[] teachers = new TeacherArray[5];

        TeacherArray t1 = new TeacherArray();
        t1.setName("Ravi Sir");
        t1.setSubject("Mathematics");

        TeacherArray t2 = new TeacherArray();
        t2.setName("Priya Ma'am");
        t2.setSubject("English");

        TeacherArray t3 = new TeacherArray();
        t3.setName("Deepak Sir");
        t3.setSubject("Physics");

        TeacherArray t4 = new TeacherArray();
        t4.setName("Neha Ma'am");
        t4.setSubject("Computer Science");

        TeacherArray t5 = new TeacherArray();
        t5.setName("Anil Sir");
        t5.setSubject("Chemistry");

        for (int i = 0; i < teachers.length; i++) {
            if (i == 0) teachers[i] = t1;
            else if (i == 1) teachers[i] = t2;
            else if (i == 2) teachers[i] = t3;
            else if (i == 3) teachers[i] = t4;
            else if (i == 4) teachers[i] = t5;
        }

        for (int i = 0; i < teachers.length; i++) {
            if (teachers[i] != null) {
                System.out.println("Teacher: " + teachers[i].getName());
                System.out.println("Subject: " + teachers[i].getSubject());
                System.out.println();
            }
        }
    }
}
