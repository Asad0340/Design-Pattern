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
public class DaughterExpression implements Expression {
    
   private Expression parentExpression = null;
   private Expression daughterExpression = null;

   public DaughterExpression(Expression parentExpression, Expression daughterExpression) { 
      this.parentExpression = parentExpression;
      this.daughterExpression = daughterExpression;
   }

   @Override
   public boolean interpret(String context) {       
      return parentExpression.interpret(context) && daughterExpression.interpret(context);
   }
}

