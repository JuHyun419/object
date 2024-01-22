package chapter1.tobe;

public class Theater {

    private final TicketSeller ticketSeller;

    public Theater(TicketSeller ticketSeller) {
        this.ticketSeller = ticketSeller;
    }

    public void enter(Audience audience) {
        // 소극장은 내부의 구현체를 알 필요가 없이 단지 판매원에게 명령을 한다.
        ticketSeller.sellTo(audience);
    }
}
