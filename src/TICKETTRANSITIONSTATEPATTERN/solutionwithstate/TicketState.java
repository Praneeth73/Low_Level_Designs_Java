package TICKETTRANSITIONSTATEPATTERN.solutionwithstate;

import TICKETTRANSITIONSTATEPATTERN.dto.Ticket;
import TICKETTRANSITIONSTATEPATTERN.dto.User;

public interface TicketState {

    boolean startAnalysis(Ticket ticket, User user);
    boolean startReview(Ticket ticket, User user);
    boolean markDone(Ticket ticket, User user);

}
