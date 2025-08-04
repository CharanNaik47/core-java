class BooksArrayRunner {
    public static void main(String[] args) {
        BooksArray[] books = new BooksArray[5];

        BooksArray b1 = new BooksArray();
        b1.setTitle("The Alchemist");
        b1.setAuthor("Paulo Coelho");

        BooksArray b2 = new BooksArray();
        b2.setTitle("Wings of Fire");
        b2.setAuthor("APJ Abdul Kalam");

        BooksArray b3 = new BooksArray();
        b3.setTitle("Ikigai");
        b3.setAuthor("Francesc Miralles");

        BooksArray b4 = new BooksArray();
        b4.setTitle("Rich Dad Poor Dad");
        b4.setAuthor("Robert Kiyosaki");

        BooksArray b5 = new BooksArray();
        b5.setTitle("Atomic Habits");
        b5.setAuthor("James Clear");

        for (int i = 0; i < books.length; i++) {
			
            if (i == 0)
				books[i] = b1;
            else if (i == 1) 
				books[i] = b2;
            else if (i == 2)
				books[i] = b3;
            else if (i == 3)
				books[i] = b4;
            else if (i == 4) 
				books[i] = b5;
        }

        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                System.out.println("Title: " + books[i].getTitle());
                System.out.println("Author: " + books[i].getAuthor());
                System.out.println();
            }
        }
    }
}
