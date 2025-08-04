class FilmArrayRunner {
    public static void main(String[] args) {
        FilmArray[] films = new FilmArray[5];

        FilmArray f1 = new FilmArray();
        f1.setTitle("RRR");
        f1.setYear(2022);

        FilmArray f2 = new FilmArray();
        f2.setTitle("Pushpa");
        f2.setYear(2021);

        FilmArray f3 = new FilmArray();
        f3.setTitle("Vikram");
        f3.setYear(2023);

        FilmArray f4 = new FilmArray();
        f4.setTitle("KGF");
        f4.setYear(2018);

        FilmArray f5 = new FilmArray();
        f5.setTitle("Kantara");
        f5.setYear(2023);

        for (int i = 0; i < films.length; i++) {
            if (i == 0) {
			films[i] = f1;}
            else if (i == 1){
			films[i] = f2;}
            else if (i == 2) {
			films[i] = f3;}
            else if (i == 3) {
			films[i] = f4;}
            else if (i == 4){
			films[i] = f5;}
        }

        for (int i = 0; i < films.length; i++) {
			FilmArray film=films[i];
            if (film != null) {
                System.out.println("Film Title: " + film.getTitle());
                System.out.println("Release Year: " + film.getYear());
                System.out.println();
            }
			for (int i = 0; i < films.length; i++) {
            if (films[i] != null) {
                System.out.println("Title: " + films[i].getTitle());
                System.out.println("Year: " + films[i].getYear());
                System.out.println();
            }
        }
    }
}