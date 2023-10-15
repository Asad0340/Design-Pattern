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

interface Strategy1
{
     public int method(int a , int b);
}
class Opeartion1 implements Strategy1
{
    @Override
    public int method(int a, int b) 
    {
        return a+b;
    }
}
class Opeartion2 implements Strategy1
{
    @Override
    public int method(int a, int b) 
    {
        return a-b;
    }
}

class Context1 
{

    private Strategy1 strategy;
    public void setStrategy1(Strategy1 strategy) 
    {
        this.strategy = strategy;
    }
    int executeStrategy1(int i, int i0) 
    {
       return strategy.method(i,i0);
    }

}