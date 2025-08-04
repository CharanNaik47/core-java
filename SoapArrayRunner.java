class SoapArrayRunner {
    public static void main(String[] args) {
        SoapArray[] soaps = new SoapArray[5];

        SoapArray s1 = new SoapArray();
        s1.setBrand("Dove");
        s1.setPrice(45.0);
		
        soaps[0] = s1;

        SoapArray s2 = new SoapArray();
        s2.setBrand("Lux");
        s2.setPrice(30.0);
		
        soaps[1] = s2;

        SoapArray s3 = new SoapArray();
        s3.setBrand("Pears");
        s3.setPrice(50.0);
		
        soaps[2] = s3;

        SoapArray s4 = new SoapArray();
        s4.setBrand("Cinthol");
        s4.setPrice(40.0);
		
        soaps[3] = s4;

        SoapArray s5 = new SoapArray();
        s5.setBrand("Liril");
        s5.setPrice(35.0);
		
        soaps[4] = s5;

        for (int i = 0; i < soaps.length; i++) {
            SoapArray s = soaps[i];
            System.out.println("Brand: " + s.getBrand());
            System.out.println("Price: " + s.getPrice());
            System.out.println();
        }
    }
}
