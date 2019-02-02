/**
A class demo for postfix evaluation
@author Joseph Bollish
*/
public class PostfixDemo 
{	
	public static void main(String[] args) 
	{
		System.out.println("This program evaluates two postfix epressions using five data types");
		System.out.println();
		System.out.println("First expression:");
		System.out.println("data1 data2 + data3 * data4 –");
		System.out.println();
		System.out.println("Second expression:");
		System.out.println("data1 data2 * data3 data1 – / data4 data5* +");
		System.out.println();
		System.out.println("Please enter values for each data type:");
		System.out.println();

		// storing data types 1 through 5
		System.out.println("Data type 1");
		DataType data1 = new DataType();
		data1.setData();
		
		System.out.println("Data type 2");
		DataType data2 = new DataType();
		data2.setData();
		
		System.out.println("Data type 3");
		DataType data3 = new DataType();
		data3.setData();
		
		System.out.println("Data type 4");
		DataType data4 = new DataType();
		data4.setData();
		
		System.out.println("Data type 5");
		DataType data5 = new DataType();
		data5.setData();
		
		evaluatePostfix theExp = new evaluatePostfix();
		
		// String expression for data1 data2 + data3 * data4 –
		String exp = data1.toString() + data2.toString()+ "+" + data3.toString() + "*" + data4.toString() + "-";
		
		// String expression for data1 data2 * data3 data1 – / data4 data5* +
		String exp2 = data1.toString() + data2.toString() + "*" + data3.toString() + data1.toString() + "-/"
				+ data4.toString() + data5.toString() + "*+";
		
		// print first expression evaluation 
		System.out.println("First expression " + exp + " = " + theExp.postfixEval(exp));
		
		System.out.println();
		
		// print second expression evaluation
		System.out.println("Second expression " + exp2 + " = "  + theExp.postfixEval(exp2));
	}// end main
}// end PostfixDemo class
