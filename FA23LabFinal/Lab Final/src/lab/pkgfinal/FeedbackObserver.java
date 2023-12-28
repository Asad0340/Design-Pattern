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
// FeedbackObserver class follows Observer pattern
interface FeedbackObserver {
    void update(Feedback changedFeedback);
}

// FeedbackAnalysisDashboard class follows Observer pattern
class FeedbackAnalysisDashboard implements FeedbackObserver {
    public void visualizeData() {
        System.out.println("Visualizing feedback data...");
        // Implementation to visualize feedback data
    }

    @Override
    public void update(Feedback changedFeedback) {
        System.out.println("Updating feedback analysis dashboard...");
        // Implementation to update feedback analysis dashboard
    }
}

