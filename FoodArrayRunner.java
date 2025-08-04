class FoodArrayRunner {
    public static void main(String[] args) {
        FoodArray[] menu = new FoodArray[5];

        FoodArray f1 = new FoodArray();
        f1.setItem("Pizza");
        f1.setPrice(250.0);

        FoodArray f2 = new FoodArray();
        f2.setItem("Burger");
        f2.setPrice(120.0);

        FoodArray f3 = new FoodArray();
        f3.setItem("Sandwich");
        f3.setPrice(80.0);

        FoodArray f4 = new FoodArray();
        f4.setItem("Pasta");
        f4.setPrice(150.0);

        FoodArray f5 = new FoodArray();
        f5.setItem("Ice Cream");
        f5.setPrice(60.0);

        for (int i = 0; i < menu.length; i++) {
            if (i == 0) menu[i] = f1;
            else if (i == 1) menu[i] = f2;
            else if (i == 2) menu[i] = f3;
            else if (i == 3) menu[i] = f4;
            else if (i == 4) menu[i] = f5;
        }

        for (int i = 0; i < menu.length; i++) {
            if (menu[i] != null) {
                System.out.println("Food Item: " + menu[i].getItem());
                System.out.println("Price: ₹" + menu[i].getPrice());
                System.out.println();
            }
        }
    }
}
