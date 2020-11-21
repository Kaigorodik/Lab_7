package lab_7_example_07_02;

public class lab_7_example_07_02 {

	public static void main(String[] args) {
		
		superClass superClass = new superClass("superClass");
        System.out.println(superClass.toString());
        subClass subClass = new subClass(superClass.returnParameter(), superClass.returnParameterLength());
        System.out.println(subClass.toString());
        subClass.setParameter();
        System.out.println(subClass.toString());
        subClass.setParameter(55);
        System.out.println(subClass.toString());
        subClass.setParameter("superClass parameter");
        System.out.println(subClass.toString());

	}

}
