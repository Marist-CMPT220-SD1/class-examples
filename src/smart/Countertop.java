package smart;
import java.util.List;
import java.util.ArrayList;

public class Countertop implements Subject {
    private List<Observer> observers = new ArrayList<Observer>();
    KnockQueue State = new KnockQueue();

    public void Countertop(){}
    public void KnockOn(Knock knock){
        State.addKnock(knock);

    }

    @Override
    public void subscribe(Observer obs) {
        observers.add(obs);

    }

    @Override
    public void unsubscribe(Observer obs) {
        for (Observer observer: observers){
            if (observer == obs){
                observers.remove(observer);
            }
        }



    }

    @Override
    public void notifySubscribers() {
        KnockPattern Pattern = State.getType();
        for(Observer observer: observers){
            observer.onNotify(Pattern);
        }

    }

    public void main (String args){

    }
}
