class TV {
    String comp;
    float size ;
    int sNo;
    double price;
    int warr;

    public static void main(String[] args) {
        Tv b1 = new Tv();
        t1.comp = "LG";
        System.out.println(t1.comp);
        t1.size = 24.5f;
        System.out.println(t1.size);

        Tv t2 = new Tv();
        t2.comp = "samsang";
        System.out.println(t2.comp);
        t2.comp = 12.8;
        System.out.println(t2.author);

        Tv t3 = new Tv();
        t3.comp = "Sony";
        System.out.println(t3.comp);
        t3.size = 22.5f;
        System.out.println(t3.size);

        Tv t4 = new Tv();
        t4.comp = "Thoshibha";
        System.out.println(t4.comp);
        t4.size = 24.5f;
        System.out.println(t4.size);

        Tv t5 = new Tv();
        b5.title = "Onida";
        System.out.println(b5.title);
        b5.author = "CLRS";
        System.out.println(b5.author);

        Book b6 = new Book();
        b6.title = "Micro Max";
        System.out.println(b6.title);
        b6.author = "Abraham Silberschatz";
        System.out.println(b6.author);

        Book b7 = new Book();
        b7.title = "DBMS";
        System.out.println(b7.title);
        b7.author = "Raghu Ramakrishnan";
        System.out.println(b7.author);

        Book b8 = new Book();
        b8.title = "Computer Networks";
        System.out.println(b8.title);
        b8.author = "Andrew S. Tanenbaum";
        System.out.println(b8.author);

        Book b9 = new Book();
        b9.title = "AI Basics";
        System.out.println(b9.title);
        b9.author = "Stuart Russell";
        System.out.println(b9.author);

        Book b10 = new Book();
        b10.title = "Machine Learning";
        System.out.println(b10.title);
        b10.author = "Tom Mitchell";
        System.out.println(b10.author);

        b1.setBook("New Book", "New Author", 500, 599.99, "New Publisher");
        System.out.println(b1.title);
        System.out.println(b1.author);
        System.out.println(b1.pages);
        System.out.println(b1.price);
        System.out.println(b1.publisher);
    }

    public void setBook(String t, String a, int p, double pr, String pub) {
        title = t;
        author = a;
        pages = p;
        price = pr;
        publisher = pub;
    }
}