package TICKETTRANSITIONSTATEPATTERN.solutionwithstate;

import TICKETTRANSITIONSTATEPATTERN.dto.Ticket;
import TICKETTRANSITIONSTATEPATTERN.dto.User;

public class Analysis implements  TicketState{

    public static Analysis instance = null;

    private Analysis(){

    }

    public synchronized static Analysis getInstance(){
        if(instance ==  null){
            return  new Analysis();
        }else{
            return instance;
        }
    }

    @Override
    public boolean startAnalysis(Ticket ticket, User user) {
        System.out.println("Something went wrong");
        return false;
    }

    @Override
    public boolean startReview(Ticket ticket, User user) {
        System.out.println( ticket.getDiscription() + " moved from analysis to review " );
        return true;
    }

    @Override
    public boolean markDone(Ticket ticket, User user) {
        System.out.println( ticket.getDiscription() + " moved from analysis to done " );
        return true;
    }
}
