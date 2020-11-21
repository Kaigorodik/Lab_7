package lab_7_example_07_04;

public class lab_7_example_07_04 {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		subsubClass subsubClass = new subsubClass('7', "55", 3);
	    System.out.println(subsubClass.toString());
	    subsubClass subsubClassCopy = new subsubClass(subsubClass);
	    System.out.println(subsubClassCopy.toString());

	}

}
