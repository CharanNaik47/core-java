class MedicineArrayRunner {
    public static void main(String[] args) {
        MedicineArray[] meds = new MedicineArray[5];

        MedicineArray m1 = new MedicineArray();
        m1.setName("Paracetamol");
        m1.setPrice(15.0);

        MedicineArray m2 = new MedicineArray();
        m2.setName("Dolo 650");
        m2.setPrice(20.0);

        MedicineArray m3 = new MedicineArray();
        m3.setName("Azithromycin");
        m3.setPrice(30.0);

        MedicineArray m4 = new MedicineArray();
        m4.setName("Cetrizine");
        m4.setPrice(10.0);

        MedicineArray m5 = new MedicineArray();
        m5.setName("Crocin");
        m5.setPrice(25.0);

        for (int i = 0; i < meds.length; i++) {
            if (i == 0) meds[i] = m1;
            else if (i == 1) meds[i] = m2;
            else if (i == 2) meds[i] = m3;
            else if (i == 3) meds[i] = m4;
            else if (i == 4) meds[i] = m5;
        }

        for (int i = 0; i < meds.length; i++) {
            if (meds[i] != null) {
                System.out.println("Medicine: " + meds[i].getName());
                System.out.println("Price: ₹" + meds[i].getPrice());
                System.out.println();
            }
        }
    }
}