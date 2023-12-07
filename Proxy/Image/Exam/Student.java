/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GOF.Proxy.Image.Exam;


public class Student {
    public void takeExam(ExamResults examResults) {
        examResults.addAnswer("Question1", "StudentAnswer1");
        examResults.addAnswer("Question2", "StudentAnswer2");
        examResults.display();
    }
}
