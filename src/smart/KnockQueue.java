package smart;

import structures.*;

enum Knock {NONE, WEAK, MEDIUM, STRONG}
enum KnockPattern {PALINDROME, MOSTLY_KNOCKS, MOSTLY_PAUSES}

/**
 * Knock Queue
 */
public class KnockQueue {

    private ArrayQueue<Knock> knocks;

    /**
     * Adds a knock to the queue
     * @param knock the knock that is being added
     */
    public void addKnock(Knock knock){
        knocks.enqueue(knock);
    }

    public KnockQueue(){
        this.knocks = new ArrayQueue<>();
    }
    /**
     * Realizes the knock pattern clearing it from history
     * @return the KnockPattern
     */
    public KnockPattern getType(){
        Queue<Knock> knocksQueueCopy = new ArrayQueue<>();
        Stack<Knock> knocksStackCopy = new ArrayStack<>();
        int knockCounter = 0;
        int pauseCounter = 0;
        //knocksStack
        while(!knocks.isEmpty()){
            Knock knock = knocks.dequeue();
            knocksQueueCopy.enqueue(knock);
            knocksStackCopy.push(knock);
            if(knock != Knock.NONE){ // TODO Fix the error in this test
                pauseCounter++;
            }else{
                knockCounter++;
            }
        }
        // check for palindrome
        boolean isPalindrome = true;
        while(!knocksQueueCopy.isEmpty()){
            if(knocksQueueCopy.dequeue() == knocksStackCopy.pop()) { // TODO Fix the error in this test
                isPalindrome = false;
                break;
            }
        }
        if(isPalindrome) return KnockPattern.PALINDROME;
        return knockCounter > pauseCounter ? KnockPattern.MOSTLY_KNOCKS: KnockPattern.MOSTLY_PAUSES;
    }

    public static void main(String[] args) {
        KnockQueue knocks = new KnockQueue();
        // Palindrome test
        knocks.addKnock(Knock.STRONG);
        knocks.addKnock(Knock.STRONG);
        knocks.addKnock(Knock.STRONG);
        knocks.addKnock(Knock.WEAK);
        knocks.addKnock(Knock.STRONG);
        knocks.addKnock(Knock.STRONG);
        knocks.addKnock(Knock.STRONG);
        System.out.println(knocks.getType());

        // Mostly knocks
        knocks.addKnock(Knock.NONE);
        knocks.addKnock(Knock.STRONG);
        knocks.addKnock(Knock.STRONG);
        knocks.addKnock(Knock.WEAK);
        knocks.addKnock(Knock.STRONG);
        knocks.addKnock(Knock.STRONG);
        knocks.addKnock(Knock.STRONG);
        System.out.println(knocks.getType());

        // Mostly Pauses
        knocks.addKnock(Knock.NONE);
        knocks.addKnock(Knock.NONE);
        knocks.addKnock(Knock.NONE);
        knocks.addKnock(Knock.NONE);
        knocks.addKnock(Knock.STRONG);
        knocks.addKnock(Knock.STRONG);
        knocks.addKnock(Knock.STRONG);
        System.out.println(knocks.getType());
    }
}
