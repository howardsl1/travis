/**
 * Calculator.java
 *
 * A simple JUnit example program.
 *
 * @author Dr. Fenwick
 * @version Spring 2019
 *
 */

public class Calculator {

    /**
     * Eval the expression parameter
     *
     * LIMITATION: The expresion can only contain + operations 
     * and integer literal operands.
     *
     * @param expression contains mathematical expression to evaluate
     * @return integer result of desired mathematical expression 
     */    
    public int evaluate(String expression) {
	int sum = 0;
        expression = expression.trim();
	for (String summand: expression.split("\\+")) {
        sum += Integer.valueOf(summand.trim());
	}
	return sum;
    }

    
}
