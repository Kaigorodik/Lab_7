package lab_7_example_07_05;

public class subClass_1 extends superClass {
	private int subClass_1;

    public subClass_1(String superClass, int subClass_1) {
        super(superClass);
        this.subClass_1 = subClass_1;
    }

    @Override
    public String toString() {
        return "subClass_1{" +"subClass_1=" + subClass_1 +"} " + super.toString();

}}
