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
import java.util.ArrayList;
import java.util.List;

// FeedbackSystem class follows Singleton pattern
class FeedbackSystem {
    private List<FeedbackCategory> feedbackCategories;
    private List<FeedbackMechanism> feedbackMechanisms;
    private List<FeedbackObserver> feedbackObservers;
    private FeedbackAnalysisDashboard feedbackAnalysisDashboard;
    private FeedbackCommunication feedbackCommunication;

    // Singleton instance
    private static FeedbackSystem instance;

    private FeedbackSystem() {
        feedbackCategories = new ArrayList<>();
        feedbackMechanisms = new ArrayList<>();
        feedbackObservers = new ArrayList<>();
        feedbackAnalysisDashboard = new FeedbackAnalysisDashboard();
        feedbackCommunication = new FeedbackCommunication();
    }

    public static FeedbackSystem getInstance() {
        if (instance == null) {
            instance = new FeedbackSystem();
        }
        return instance;
    }

    public void gatherFeedback() {
        System.out.println("Gathering feedback...");
        // Implementation to gather feedback
    }

    public void analyzeFeedback() {
        System.out.println("Analyzing feedback...");
        // Implementation to analyze feedback
        feedbackAnalysisDashboard.visualizeData();
    }

    public void communicateImprovements() {
        System.out.println("Communicating improvements...");
        // Implementation to communicate improvements
    }

    public List<FeedbackCategory> getFeedbackCategories() {
        return feedbackCategories;
    }

    public List<FeedbackMechanism> getFeedbackMechanisms() {
        return feedbackMechanisms;
    }

    public List<FeedbackObserver> getFeedbackObservers() {
        return feedbackObservers;
    }
}
