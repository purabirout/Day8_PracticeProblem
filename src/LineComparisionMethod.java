package com.bridgelabz.employeewage;

public class LineComparisionMethod {
	public void lineEquals(Double line1, Double line2){
		if(line1.equals(line2))
			System.out.println("Both the lines Line-1 and Line-2 are Equal");

		else 
			System.out.println("Line-1 and Line-2 are not Equal");
	}

	public void lineCompareTo(Double line1, Double line2)
	{
		int result = line1.compareTo(line2);

		if(result > 0)
			System.out.println("Line-1 is Greaterthan Line-2");

		else if(result < 0)
			System.out.println("Line-1 is Lesserthan Line-2");
		else 
			System.out.println("Line-1 and Line-2 are Equal");

	}
	
	public static void main(String[] args) {
		LineComparisionMethod l1 = new LineComparisionMethod();
		LineComparisionMethod l2 = new LineComparisionMethod();
			l1.lineEquals(3.5, 4.8);
			l2.lineCompareTo(1.9, 1.9);

	}

}
