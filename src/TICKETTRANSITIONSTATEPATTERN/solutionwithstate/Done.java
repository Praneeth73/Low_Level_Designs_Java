package TICKETTRANSITIONSTATEPATTERN.solutionwithstate;

import TICKETTRANSITIONSTATEPATTERN.dto.Ticket;
import TICKETTRANSITIONSTATEPATTERN.dto.User;

public class Done implements TicketState{

    public static Done instance = null;

    private Done(){

    }

    public synchronized static Done getInstance(){
        if(instance ==  null){
            return  new Done();
        }else{
            return instance;
        }
    }


    @Override
    public boolean startAnalysis(Ticket ticket, User user) {
        System.out.println( ticket.getDiscription() + " moved from done to analysis " );
        return true;
    }

    @Override
    public boolean startReview(Ticket ticket, User user) {
        System.out.println( ticket.getDiscription() + " moved from done to review " );
        return true;
    }

    @Override
    public boolean markDone(Ticket ticket, User user) {
        System.out.println("Something went wrong");
        return false;
    }
}
