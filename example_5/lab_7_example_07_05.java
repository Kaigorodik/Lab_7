package lab_7_example_07_05;

public class lab_7_example_07_05 {

	public static void main(String[] args) {
		
		 superClass superClass = new superClass("superClass");
	     System.out.println(superClass.toString());
	     subClass_1 subClass_1 = new subClass_1("superClass parameter_1", 7);
	     System.out.println(subClass_1.toString());
	     subClass_2 subClass_2 = new subClass_2("superClass parameter_2", '3');
	     System.out.println(subClass_2.toString());

	}

}
