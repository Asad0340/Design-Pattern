/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interpreter;

/**
 *
 * @author fa20-bse-153
 */
public class InterpreterPatternDemo {

   // ... (existing code)

   // Rule: Stuart is a son of Robert
   public static Expression getSonExpression(){
      Expression robert = new TerminalExpression("Robert");
      Expression stuart = new TerminalExpression("Stuart");
      return new SonExpression(robert, stuart);
   }

   // Rule: Samantha is a daughter of Julie
   public static Expression getDaughterExpression(){
      Expression julie = new TerminalExpression("Julie");
      Expression samantha = new TerminalExpression("Samantha");
      return new DaughterExpression(julie, samantha);
   }

   public static void main(String[] args) {
      // ... (existing code)

      Expression isSon = getSonExpression();
      Expression isDaughter = getDaughterExpression();

      System.out.println("Is Stuart a son of Robert? " + isSon.interpret("Robert Stuart"));
      System.out.println("Is Samantha a daughter of Julie? " + isDaughter.interpret("Julie Samantha"));
   }
}

