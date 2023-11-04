package TICKETTRANSITIONSTATEPATTERN.dto;


import TICKETTRANSITIONSTATEPATTERN.solutionwithstate.Analysis;
import TICKETTRANSITIONSTATEPATTERN.solutionwithstate.TicketState;

public class Ticket {

    private String discription;
    private User createdBy;
    // old version
    //private TicketState ticketState;

    // using state design pattern
    private TicketState state;

    // When ticket is created ticket state will be in the initial  state that is ANALYSIS STATE.
    public Ticket(String discription, User createdBy) {
        this.discription = discription;
        this.createdBy = createdBy;
        this.state = new Analysis();
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    public void setCreatedBy(User createdBy) {
        this.createdBy = createdBy;
    }

    public void setTicketState(TicketState ticketState) {
        this.state = ticketState;
    }

    public User getCreatedBy() {
        return createdBy;
    }

    public TicketState getTicketState() {
        return state;
    }
}


