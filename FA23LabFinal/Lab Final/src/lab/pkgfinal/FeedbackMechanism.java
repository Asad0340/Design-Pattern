/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkgfinal;

/**
 *
 * @author Asad
 */
// FeedbackMechanism class follows Strategy pattern
abstract class FeedbackMechanism {
    private String type;

    public FeedbackMechanism(String type) {
        this.type = type;
    }

    public abstract void collectFeedback();
}

class Survey extends FeedbackMechanism {
    public Survey(String type) {
        super(type);
    }

    @Override
    public void collectFeedback() {
        System.out.println("Collecting survey feedback...");
        // Implementation to collect survey feedback
    }
}

class Poll extends FeedbackMechanism {
    public Poll(String type) {
        super(type);
    }

    @Override
    public void collectFeedback() {
        System.out.println("Collecting poll feedback...");
        // Implementation to collect poll feedback
    }
}

class DirectContact extends FeedbackMechanism {
    public DirectContact(String type) {
        super(type);
    }

    @Override
    public void collectFeedback() {
        System.out.println("Collecting direct contact feedback...");
        // Implementation to collect direct contact feedback
    }
}
