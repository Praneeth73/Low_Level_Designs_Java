package TICKETTRANSITIONSTATEPATTERN;

import TICKETTRANSITIONSTATEPATTERN.dto.Ticket;
import TICKETTRANSITIONSTATEPATTERN.dto.User;
import TICKETTRANSITIONSTATEPATTERN.enums.TicketState;
import TICKETTRANSITIONSTATEPATTERN.service.TicketService;

public class Main {
    public static void main(String[] args) {
        User user = new User("Praneeth");
        TicketService  ticketService = new TicketService();

        Ticket ticket  = ticketService.createTicket("First ticket " , user);
       // ticketService.changeTicketState(ticket, TicketState.REVIEW);
        ticketService.startReview(ticket,user);


    }
}
