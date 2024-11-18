//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        TicketBookingFacade ticketBookingFacade = new TicketBookingFacade();
        ticketBookingFacade.bookTicket("Москва", "Санкт-Петербург", "18-11-2024", 12, 10000, "Кредитная карта");
    }
}