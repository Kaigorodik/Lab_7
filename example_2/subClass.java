package lab_7_example_07_02;

public class subClass extends superClass {
	public int intsubClass;
	
	public subClass(String superclassString, int intsubClass) {
        super(superclassString);
        this.intsubClass = intsubClass;
    }
	
	public void setParameter(String superclassString, int intsubClass) {
        super.setParameter(superclassString);
        this.intsubClass = intsubClass;
    }
	
	public void setParameter(int intsubClass) {
        super.setParameter();
        this.intsubClass = intsubClass;
    }
	@Override
    public void setParameter(String superclassString) {
        super.setParameter(superclassString);
        this.intsubClass = superclassString.length();
    }
	
	@Override
    public void setParameter() {
        super.setParameter();
        this.intsubClass = super.returnParameterLength();
    }
	
	 @Override
	    public String toString() {
	    return "subClass{" + "intsubClass=" + intsubClass + "} " + super.toString();

}}
