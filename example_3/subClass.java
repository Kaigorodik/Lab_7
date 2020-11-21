package lab_7_example_07_03;

public class subClass extends superClass {
	public char subClass;

    public subClass (int superClass, char subClass) {
        super(superClass);
        this.subClass = subClass;
    }
    public void setParameter(int superClass, char subClass) {
        super.setParameter(superClass);
        this.subClass = subClass;
    }
    @Override
    public String toString() {
        return "subClass{" + "subClass=" + subClass +"} " + super.toString();

}}
