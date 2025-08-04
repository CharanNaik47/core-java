class TimeTableRunner {
    public static void main(String[] args) {
        TimeTableArray[] timetable = new TimeTableArray[5];

        TimeTableArray t1 = new TimeTableArray();
        t1.setSubject("Math");
        t1.setTime("9:00 AM");
        timetable[0] = t1;

        TimeTableArray t2 = new TimeTableArray();
        t2.setSubject("Science");
        t2.setTime("10:00 AM");
        timetable[1] = t2;

        TimeTableArray t3 = new TimeTableArray();
        t3.setSubject("English");
        t3.setTime("11:00 AM");
        timetable[2] = t3;

        TimeTableArray t4 = new TimeTableArray();
        t4.setSubject("Social");
        t4.setTime("12:00 PM");
        timetable[3] = t4;

        TimeTableArray t5 = new TimeTableArray();
        t5.setSubject("Computer");
        t5.setTime("1:00 PM");
        timetable[4] = t5;

        for (int i = 0; i < timetable.length; i++) {
            TimeTableArray t = timetable[i];
            System.out.println("Subject: " + t.getSubject());
            System.out.println("Time: " + t.getTime());
            System.out.println();
        }
    }
}
