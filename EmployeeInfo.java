class EmployeeInfo {
    public static void main(String[] args) {
        String[] names = {"Ravi", "Sita", "Aman", "Neha", "Pooja", "Rahul", "Rani", "Asha", "Karan", "Manoj"};
        int[] empIds = {1001,1002,1003,1004,1005,1006,1007,1008,1009,1010};
        float[] salary = {40000f,45000f,50000f,42000f,47000f,51000f,39000f,46000f,48000f,50000f};
        char[] grade = {'B','A','A','B','A','S','B','A','A','A'};
        long[] contact = {9876543210L, 9123456789L, 9345678901L, 9988776655L, 9765432109L,
                          9456123789L, 9345687123L, 9871234567L, 9324561890L, 9001122334L};

        for (int i = 0; i < names.length; i++) {
            System.out.println("ID: " + empIds[i] + ", Name: " + names[i] + ", Salary: ₹" + salary[i] +
                               ", Grade: " + grade[i] + ", Contact: " + contact[i]);
        }
    }
}
