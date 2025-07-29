class MobileArrayRunner {
    public static void main(String[] args) {
		
        Mobile[] mobiles = new Mobile[3];

        MobileArray m1 = new MobileArray();
        m1.setBrand("Samsung");
        m1.setPrice(18000);
		
        mobiles[0] = m1;

        MobileArray m2 = new MobileArray();
        m2.setBrand("iPhone");
        m2.setPrice(85000);
		
        mobiles[1] = m2;

        MobileArray m3 = new MobileArray();
        m3.setBrand("Realme");
        m3.setPrice(14000);
		
        mobiles[2] = m3;

        for (int i = 0; i < mobiles.length; i++) {
            MobileArray m = mobiles[i];
            System.out.println("Brand: " + m.getBrand());
            System.out.println("Price: ₹" + m.getPrice());
            System.out.println();
        }
    }
}
