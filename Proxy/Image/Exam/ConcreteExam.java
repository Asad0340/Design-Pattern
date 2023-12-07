/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GOF.Proxy.Image.Exam;

import java.util.HashMap;
import java.util.Map;


public class ConcreteExam implements Exam {
    private Map<String, String> questions; 

    @Override
    public void loadQuestions() {
        questions = new HashMap<>();
        questions.put("Question1", "Answer1");
        questions.put("Question2", "Answer2");
    }

    @Override
    public void display() {
        System.out.println("Displaying Exam Questions");
        for (Map.Entry<String, String> entry : questions.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
