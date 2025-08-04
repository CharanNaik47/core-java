class FlightArrayRunner {
    public static void main(String[] args) {
        FlightArray[] flights = new FlightArray[5];

        FlightArray f1 = new FlightArray();
        f1.setFlightName("IndiGo");
        f1.setSeats(180);

        FlightArray f2 = new FlightArray();
        f2.setFlightName("Air India");
        f2.setSeats(200);

        FlightArray f3 = new FlightArray();
        f3.setFlightName("SpiceJet");
        f3.setSeats(160);

        FlightArray f4 = new FlightArray();
        f4.setFlightName("Vistara");
        f4.setSeats(190);

        FlightArray f5 = new FlightArray();
        f5.setFlightName("GoAir");
        f5.setSeats(170);

        for (int i = 0; i < flights.length; i++) {
            if (i == 0) flights[i] = f1;
            else if (i == 1) flights[i] = f2;
            else if (i == 2) flights[i] = f3;
            else if (i == 3) flights[i] = f4;
            else if (i == 4) flights[i] = f5;
        }

        for (int i = 0; i < flights.length; i++) {
            if (flights[i] != null) {
                System.out.println("Flight: " + flights[i].getFlightName());
                System.out.println("Seats: " + flights[i].getSeats());
                System.out.println();
            }
        }
    }
}
