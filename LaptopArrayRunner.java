class LaptopArrayRunner {
    public static void main(String[] args) {
        LaptopArray[] laptops = new LaptopArray[5];

        LaptopArray l1 = new LaptopArray();
        l1.setModel("Dell Inspiron");
        l1.setRam(8);
		
        laptops[0] = l1;

        LaptopArray l2 = new LaptopArray();
        l2.setModel("HP Pavilion");
        l2.setRam(16);
		
        laptops[1] = l2;

        LaptopArray l3 = new LaptopArray();
        l3.setModel("Lenovo IdeaPad");
        l3.setRam(8);
		
        laptops[2] = l3;

        LaptopArray l4 = new LaptopArray();
        l4.setModel("Acer Aspire");
        l4.setRam(12);
		
        laptops[3] = l4;

        LaptopArray l5 = new LaptopArray();
        l5.setModel("MacBook Air");
        l5.setRam(8);
		
        laptops[4] = l5;

        for (int i = 0; i < laptops.length; i++) {
            LaptopArray l = laptops[i];
            System.out.println("Model: " + l.getModel());
            System.out.println("RAM: " + l.getRam() + " GB");
            System.out.println();
        }
    }
}
