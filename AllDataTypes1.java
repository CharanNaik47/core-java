class AllDataTypes1 {
    public static void main(String[] args) {
        int[] intArr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        float[] floatArr = {1.1f, 2.2f, 3.3f, 4.4f, 5.5f, 6.6f, 7.7f, 8.8f, 9.9f, 10.1f};
        long[] longArr = {100L, 200L, 300L, 400L, 500L, 600L, 700L, 800L, 900L, 1000L};
        double[] doubleArr = {10.0, 20.5, 30.1, 40.6, 50.3, 60.9, 70.8, 80.2, 90.4, 100.0};
        String[] stringArr = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
        short[] shortArr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        boolean[] boolArr = {true, false, true, false, true, false, true, false, true, false};
        char[] charArr = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};
        byte[] byteArr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < 10; i++) {
            System.out.println(intArr[i] + " " + floatArr[i] + " " + longArr[i] + " " + doubleArr[i]
                               + " " + stringArr[i] + " " + shortArr[i] + " " + boolArr[i] + " " + charArr[i]
                               + " " + byteArr[i]);
        }
    }
}
