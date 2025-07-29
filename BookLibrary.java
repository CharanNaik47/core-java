class BookLibrary {
    public static void main(String[] args) {
        String[] titles = {"Java", "Python", "C++", "SQL", "HTML", "CSS", "JS", "DS", "AI", "ML"};
        String[] authors = {"James", "Guido", "Bjarne", "Date", "Tim", "Hakon", "Brendan", "Narasimha", "Russell", "Andrew"};
        int[] pages = {500, 400, 450, 300, 150, 200, 350, 600, 700, 650};
        char[] rating = {'A', 'A', 'B', 'A', 'B', 'B', 'A', 'A', 'A', 'A'};
        double[] price = {450.0, 500.0, 430.0, 300.0, 200.0, 250.0, 480.0, 550.0, 800.0, 900.0};

        for (int i = 0; i < titles.length; i++) {
            System.out.println("Book: " + titles[i] + " by " + authors[i] +
                               " | Pages: " + pages[i] + " | Rating: " + rating[i] + " | Price: ₹" + price[i]);
        }
    }
}
