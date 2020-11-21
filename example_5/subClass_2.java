package lab_7_example_07_05;

public class subClass_2 extends superClass {
	
	private char subClass_2;

    public subClass_2(String superClass, char subClass_2) {
        super(superClass);
        this.subClass_2 = subClass_2;
    }

    @Override
    public String toString() {
        return "subClass_2{" +"subClass_2=" + subClass_2 +"} " + super.toString();

}}
