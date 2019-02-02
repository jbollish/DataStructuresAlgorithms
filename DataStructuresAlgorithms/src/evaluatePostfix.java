/**
A class for evaluating postfix
@author Joseph Bollish
*/
public class evaluatePostfix
{
	/** method to evaluate postfix
	@param exp to take in string expression
	*/
	public int postfixEval(String exp) 
	{
		StackInterface<Integer> valueStack = new StackArray<>();
		int charCounter = exp.length();
		int index = 0;
		char nextCharacter = ' ';
		int result = 0;
		 
		while(index < charCounter) 
		{
			nextCharacter = exp.charAt(index);
			if(Character.isDigit(nextCharacter))
	            valueStack.push(nextCharacter - '0');
			  else
	            {
	                int operand1 = valueStack.pop();
	                int operand2 = valueStack.pop();
	                 
	                switch(nextCharacter)
	                {
	                    case '+':
	                    result = operand2 + operand1;
	                    valueStack.push(result);
	                    break;
	                     
	                    case '-':
	                    result = operand2 - operand1;
		                valueStack.push(result);
	                    break;
	                     
	                    case '/':
	                    result = operand2 / operand1;
		                valueStack.push(result);;
	                    break;
	                     
	                    case '*':
	                    result = operand2 * operand1;
		                valueStack.push(result);
	                    break;
	                    
	                    default: break;
	              }// end switch
	            }
			index++;
		}// end while 
		return valueStack.peek();
	}// end postfixEval	
	
//	public void clearstack()
}// end evaluatePostfix
