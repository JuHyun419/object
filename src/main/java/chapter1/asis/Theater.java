package chapter1.asis;

public class Theater {

    private final TicketSeller ticketSeller;

    public Theater(TicketSeller ticketSeller) {
        this.ticketSeller = ticketSeller;
    }

    public void enter(Audience audience) {
        // 관람객이 초대장이 있는 경우 -> 매표소의 티켓을 발급 받아서 관람객의 가방에 넣어준다. (누가? 소극장이 ..)
        if (audience.getBag().hasInvitation()) {
            final Ticket ticket = ticketSeller.getTicketOffice().getTicket();
            audience.getBag().setTicket(ticket);
        } else {
            // 관람객이 초대장이 없는 경우 -> 매표소의 티켓을 발급 받고, 관람객의 가방에서 금액을 차감하고, 매표소의 판매 금액을 더하고, 관람객의 가방에 넣어준다. (누가? 소극장이 ..)
            final Ticket ticket = ticketSeller.getTicketOffice().getTicket();
            audience.getBag().minusAmount(ticket.getFee());
            ticketSeller.getTicketOffice().plusAmount(ticket.getFee());
            audience.getBag().setTicket(ticket);
        }
    }
}
