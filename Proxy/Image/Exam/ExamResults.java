/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GOF.Proxy.Image.Exam;

import java.util.HashMap;
import java.util.Map;


public class ExamResults implements Exam {
        private Exam realExam;
    private Map<String, String> studentResults; 

    public ExamResults(Exam realExam) {
        this.realExam = realExam;
        this.studentResults = new HashMap<>();
    }

    
    public void addAnswer(String question, String answer) {
        studentResults.put(question, answer);
    }
    @Override
    public void display() {
        System.out.println("Displaying Student's Exam Results");
        for (Map.Entry<String, String> entry : studentResults.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
    public void displayAllResults() {
        realExam.display();
        System.out.println("\nDisplaying All Student Exam Results");
        for (Map.Entry<String, String> entry : studentResults.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
    @Override
    public void loadQuestions() {
        if (realExam == null) {
            realExam = new ConcreteExam();
            realExam.loadQuestions();
        }
    }
}
