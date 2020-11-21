package lab_7_example_07_04;

public class subClass extends superClass {
	 public String subClass;

	    public subClass(char superClass, String subClass) {
	        super(superClass);
	        this.subClass = subClass;
	    }
	    
	    public subClass(subClass subClass) throws CloneNotSupportedException {
	        this(subClass.superClass, subClass.subClass);
	    }

	    @Override
	    public String toString() {
	        return "subClass {" +"subClass='" + subClass + '\'' +"} " + super.toString();
}}
