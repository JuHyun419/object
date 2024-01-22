package chapter1.tobe;

public class TicketSeller {

    private final TicketOffice ticketOffice;

    public TicketSeller(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }

    public void sellTo(Audience audience) {
//        ticketOffice.plusAmount(
//                audience.buy(ticketOffice.getTicket())
//        );

        ticketOffice.sellTicketTo(audience);
    }
}
