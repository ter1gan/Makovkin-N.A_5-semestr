public class TicketBookingFacade {
    private FlightSearch flightSearch;
    private SeatSelection seatSelection;
    private PaymentProcessor paymentProcessor;

    public TicketBookingFacade() {
        flightSearch = new FlightSearch();
        seatSelection = new SeatSelection();
        paymentProcessor = new PaymentProcessor();
    }

    public void bookTicket(String from, String to, String date, int seatNumber, double amount, String paymentMethod) {
        flightSearch.searchFlights(from, to, date);
        // Здесь мы предположим, что рейс найден и присвоен flightId
        int flightId = 101; // ПримерId найденного рейса

        seatSelection.selectSeat(flightId, seatNumber);
        paymentProcessor.payForTicket(amount, paymentMethod);
        System.out.println("Билет успешно забронирован!");
    }
}
