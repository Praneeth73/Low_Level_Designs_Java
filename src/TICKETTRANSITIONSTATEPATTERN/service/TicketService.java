package TICKETTRANSITIONSTATEPATTERN.service;

import TICKETTRANSITIONSTATEPATTERN.dto.Ticket;
import TICKETTRANSITIONSTATEPATTERN.dto.User;
import TICKETTRANSITIONSTATEPATTERN.enums.TicketState;
import TICKETTRANSITIONSTATEPATTERN.solutionwithstate.Analysis;
import TICKETTRANSITIONSTATEPATTERN.solutionwithstate.Done;
import TICKETTRANSITIONSTATEPATTERN.solutionwithstate.Review;

import java.util.concurrent.locks.ReentrantLock;

public class TicketService {

    public final ReentrantLock lock = new ReentrantLock();

    public Ticket createTicket(String discription, User createdBy){
        return new Ticket(discription,createdBy);
    }

    public void startAnalysis(Ticket ticket, User user){
        boolean  isFeasible = ticket.getTicketState().startAnalysis(ticket,user);
        if(isFeasible){
            // why do we need new instance every time so we can do it as singleton class
            // this is the critical condition we need to handle the multi threading here
            lock.lock();
            if(ticket.getTicketState().startAnalysis(ticket,user)){
             ticket.setTicketState(Analysis.getInstance());
            }
            lock.unlock();
        }
    }

    public void startReview(Ticket ticket, User user){
        boolean isFeasible = ticket.getTicketState().startReview(ticket,user);
        if(isFeasible){
            lock.lock();
            if(ticket.getTicketState().startReview(ticket,user)){
                ticket.setTicketState(Review.getInstance());
            }
            lock.unlock();
        }
    }

    public void startDone(Ticket ticket, User user){
        boolean isFeasible = ticket.getTicketState().markDone(ticket,user);
        if(isFeasible){
            lock.lock();
            if(ticket.getTicketState().markDone(ticket,user)){
                ticket.setTicketState(Done.getInstance());
            }
            lock.unlock();
        }
    }

    // Flaws of this code unmanageable code, lot of code duplication, Hard add new state every time.
//    public void changeTicketState(Ticket ticket, TicketState newState){
//        TicketState oldState = ticket.getTicketState();
//        if(oldState.equals(TicketState.ANALYSIS)){
//            if(newState.equals(TicketState.REVIEW)){
//                System.out.println( ticket.getDiscription() + "moved from "+oldState +" to " + newState);
//            }
//            else if(newState.equals(TicketState.DONE)){
//                System.out.println( ticket.getDiscription() + "moved from "+oldState +" to " + newState);
//            }
//            else if(newState.equals(TicketState.ANALYSIS)){
//                System.out.println( "Something went wrong ");
//            }
//        } else if(oldState.equals(TicketState.REVIEW)){
//            if(newState.equals(TicketState.ANALYSIS)){
//                System.out.println( ticket.getDiscription() + "moved from "+oldState +" to " + newState);
//            }
//            else if(newState.equals(TicketState.DONE)){
//                System.out.println( ticket.getDiscription() + "moved from "+oldState +" to " + newState);
//            }
//            else if(newState.equals(TicketState.REVIEW)){
//                System.out.println( "Something went wrong ");
//            }
//        }
//        else if(oldState.equals(TicketState.DONE)){
//            if(newState.equals(TicketState.ANALYSIS)){
//                System.out.println( ticket.getDiscription() + "moved from "+oldState +" to " + newState);
//            }
//            else if(newState.equals(TicketState.DONE)){
//                System.out.println( "Something went wrong ");
//            }
//            else if(newState.equals(TicketState.REVIEW)){
//                System.out.println( ticket.getDiscription() + "moved from "+oldState +" to " + newState);
//            }
//        }
//    }

}

