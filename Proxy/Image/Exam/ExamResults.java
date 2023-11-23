/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GOF.Proxy.Image.Exam;

/**
 *
 * @author fa20-bse-018
 */
interface ExamResults extends Cloneable {
    void addAnswer(String question, String answer);
    void showResults();
    ExamResults clone();
}
