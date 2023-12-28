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
class User {
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // getters and setters

    void accessSurveys() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void accessPolls() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void communicateDirectly() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void accessFeedbackAnalysisDashboard() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

// User subclasses follow the Strategy pattern
class Student extends User {
    public Student(String username, String password) {
        super(username, password);
    }

    public void accessSurveys() {
        System.out.println("Accessing surveys as a student...");
        // Implementation for student to access surveys
    }

    public void accessPolls() {
        System.out.println("Accessing polls as a student...");
        // Implementation for student to access polls
    }

    public void communicateDirectly() {
        System.out.println("Communicating directly as a student...");
        // Implementation for student to communicate directly
    }
}

class Parent extends User {
    public Parent(String username, String password) {
        super(username, password);
    }

    public void accessSurveys() {
        System.out.println("Accessing surveys as a parent...");
        // Implementation for parent to access surveys
    }

    public void accessPolls() {
        System.out.println("Accessing polls as a parent...");
        // Implementation for parent to access polls
    }

    public void communicateDirectly() {
        System.out.println("Communicating directly as a parent...");
        // Implementation for parent to communicate directly
    }
}

class Teacher extends User {
    public Teacher(String username, String password) {
        super(username, password);
    }

    public void accessSurveys() {
        System.out.println("Accessing surveys as a teacher...");
        // Implementation for teacher to access surveys
    }

    public void accessPolls() {
        System.out.println("Accessing polls as a teacher...");
        // Implementation for teacher to access polls
    }

    public void communicateDirectly() {
        System.out.println("Communicating directly as a teacher...");
        // Implementation for teacher to communicate directly
    }
}

class Administrator extends User {
    public Administrator(String username, String password) {
        super(username, password);
    }

    public void accessFeedbackAnalysisDashboard() {
        System.out.println("Accessing feedback analysis dashboard as an administrator...");
        // Implementation for administrator to access feedback analysis dashboard
        FeedbackSystem.getInstance().analyzeFeedback();
    }
}

