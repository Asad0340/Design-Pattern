/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GOF.Proxy.Image.Exam;


public class Main {
    public static void main(String[] args) {
      Image image = new ProxyImage("test_10mb.jpg");
      Image image2 = new VirtualProxy("unsupported_image.png");
      Student student = new Student();
      ExamResults studentExamResults = new ExamResults(null); // Load questions on-demand
      
      image.display(); 
      System.out.println("");
      
      
      image.display(); 	
      image2.display();
      studentExamResults.loadQuestions();
      student.takeExam(studentExamResults);
      System.out.println("\n-----------------------------\n");
      Teacher teacher = new Teacher();
      teacher.reviewExamResults(studentExamResults);
    }
   
}
