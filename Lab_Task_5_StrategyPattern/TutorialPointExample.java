/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StrategyPattern;

/**
 *
 * @author fa20-bse-019
 */

interface Strategy 
{
    public int doSomeOperation(int num1 , int num2 , int num3);
}
class OperationAdd implements Strategy
{
    @Override
    public int doSomeOperation(int num1, int num2, int num3)
    {
        int sum = num1+num2+num3;
        return sum;
    }
}
class OperationMultiply implements Strategy
{

    @Override
    public int doSomeOperation(int num1, int num2, int num3) 
    {
        int mul = num1*num2*num3;
        return mul; 
    }
}
class Context 
{
   private Strategy strategy;

   public Context(Strategy strategy)
   {
      this.strategy = strategy;
   }
    int executeStrategy(int i, int i0,int i1) 
    {
       return strategy.doSomeOperation(i, i0,i1);
    }

    

   
}