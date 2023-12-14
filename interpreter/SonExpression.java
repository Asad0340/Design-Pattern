
package interpreter;

/**
 *
 * @author fa20-bse-153
 */
public class SonExpression implements Expression {
    
   private Expression parentExpression = null;
   private Expression sonExpression = null;

   public SonExpression(Expression parentExpression, Expression sonExpression) { 
      this.parentExpression = parentExpression;
      this.sonExpression = sonExpression;
   }

   @Override
   public boolean interpret(String context) {       
      return parentExpression.interpret(context) && sonExpression.interpret(context);
   }
}
