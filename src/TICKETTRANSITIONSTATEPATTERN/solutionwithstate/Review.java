package TICKETTRANSITIONSTATEPATTERN.solutionwithstate;

import TICKETTRANSITIONSTATEPATTERN.dto.Ticket;
import TICKETTRANSITIONSTATEPATTERN.dto.User;

public class Review implements  TicketState{

    @Override
    public boolean startAnalysis(Ticket ticket, User user) {
        System.out.println( ticket.getDiscription() + " moved from review to analysis " );
        return true;
    }

    @Override
    public boolean startReview(Ticket ticket, User user) {
        System.out.println("Something went wrong");
        return false;
    }

    @Override
    public boolean markDone(Ticket ticket, User user) {
        System.out.println( ticket.getDiscription() + " moved from review to done " );
        return true;
    }
}
