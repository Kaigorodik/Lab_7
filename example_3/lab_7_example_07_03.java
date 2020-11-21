package lab_7_example_07_03;

public class lab_7_example_07_03 {

	public static void main(String[] args) {
		
		subsubClass subsubClass = new subsubClass(7, '4', "17");
        System.out.println(subsubClass.toString());
        subsubClass.setParameter(113);
        System.out.println(subsubClass.toString());
        subsubClass.setParameter(177, 'e');
        System.out.println(subsubClass.toString());
        subsubClass.setParameter(193, 'A', "Hello");
        System.out.println(subsubClass.toString());

	}

}
