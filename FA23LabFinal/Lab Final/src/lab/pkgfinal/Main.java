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
public class Main {
    public static void main(String[] args) {
        // Example usage:

        // Singleton pattern
        FeedbackSystem feedbackSystem = FeedbackSystem.getInstance();

        // Strategy pattern
        FeedbackMechanism survey = new Survey("Survey");
        FeedbackMechanism poll = new Poll("Poll");
        FeedbackMechanism directContact = new DirectContact("DirectContact");

        // Observer pattern
        FeedbackObserver dashboard = new FeedbackAnalysisDashboard();
        feedbackSystem.getFeedbackObservers().add(dashboard);

        // Factory Method pattern
        UserFactory userFactory = new UserFactory();
        User student = userFactory.createUser(UserType.STUDENT, "student1", "password1");
        User parent = userFactory.createUser(UserType.PARENT, "parent1", "password2");
        User teacher = userFactory.createUser(UserType.TEACHER, "teacher1", "password3");
        User administrator = userFactory.createUser(UserType.ADMINISTRATOR, "admin1", "password4");

        // Access surveys, polls, and communicate directly
        student.accessSurveys();
        student.accessPolls();
        student.communicateDirectly();

        parent.accessSurveys();
        parent.accessPolls();
        parent.communicateDirectly();

        teacher.accessSurveys();
        teacher.accessPolls();
        teacher.communicateDirectly();

        administrator.accessFeedbackAnalysisDashboard();

        // NullUser pattern
        User nullUser = new NullUser();
        nullUser.accessSurveys();  // Output: NullUser cannot access surveys.
        nullUser.accessPolls();    // Output: NullUser cannot access polls.
        nullUser.communicateDirectly();  // Output: NullUser cannot communicate directly.
    }
}

