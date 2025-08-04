class E_CommerceArrayRunner {
    public static void main(String[] args) {
        E_CommerceArray[] products = new E_CommerceArray[5];

        E_CommerceArray p1 = new E_CommerceArray();
        p1.setProduct("Laptop");
        p1.setPrice(55000.0);

        E_CommerceArray p2 = new E_CommerceArray();
        p2.setProduct("Mobile");
        p2.setPrice(20000.0);

        E_CommerceArray p3 = new E_CommerceArray();
        p3.setProduct("Headphones");
        p3.setPrice(1500.0);

        E_CommerceArray p4 = new E_CommerceArray();
        p4.setProduct("Watch");
        p4.setPrice(3000.0);

        E_CommerceArray p5 = new E_CommerceArray();
        p5.setProduct("Keyboard");
        p5.setPrice(800.0);

        for (int i = 0; i < products.length; i++) {
            if (i == 0) products[i] = p1;
            else if (i == 1)
				products[i] = p2;
            else if (i == 2)
				products[i] = p3;
            else if (i == 3)
				products[i] = p4;
            else if (i == 4
			products[i] = p5;
        }

        for (int i = 0; i < products.length; i++) {
			E_CommerceArray product=products[i];
            if (products[i] != null) {
                System.out.println("Product Name: " + product.getProduct());
                System.out.println("Product Price: ₹" + product.getPrice());
                System.out.println();
            }
			if (products[i] != null) {
                System.out.println("Product: " + products[i].getProduct());
                System.out.println("Price: ₹" + products[i].getPrice());
                System.out.println();
            }
        }
    }
}
