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
interface Strategy3 {
    int execute(int a, int b);
}

// Step 2: Create concrete strategy classes
class ConcreteStrategyAdd implements Strategy3 {
    public int execute(int a, int b) {
        return a + b;
    }
}

class ConcreteStrategySubtract implements Strategy3 {
    public int execute(int a, int b) {
        return a - b;
    }
}

class ConcreteStrategyMultiply implements Strategy3 {
    public int execute(int a, int b) {
        return a * b;
    }
}

class ConcreteStrategyDivide implements Strategy3 {
    public int execute(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
    }
}

class ConcreteStrategyPower implements Strategy3 {
    public int execute(int base, int power) {
        return (int) Math.pow(base, power);
    }
}

// Step 3: Implement Chain of Responsibility pattern
class RangeHandler {
    private RangeHandler next;
    private int minRange;
    private int maxRange;
    private Strategy3 strategy;

    public RangeHandler(int minRange, int maxRange, Strategy3 strategy) {
        this.minRange = minRange;
        this.maxRange = maxRange;
        this.strategy = strategy;
    }

    public void setNext(RangeHandler next) {
        this.next = next;
    }

    public int handle(int a, int b) {
        if (a >= minRange && a <= maxRange && b >= minRange && b <= maxRange) {
            return strategy.execute(a, b);
        } else if (next != null) {
            return next.handle(a, b);
        } else {
            throw new IllegalArgumentException("Numbers are not in any valid range.");
        }
    }
}

