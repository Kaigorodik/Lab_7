package lab_7_example_07_04;

public class subsubClass extends subClass {
	 public int subsubClass;
	 
	 public subsubClass(char superClass, String subClass, int subsubClass) {
	        super(superClass, subClass);
	        this.subsubClass = subsubClass;
	 }

	    public subsubClass(subsubClass subsubClass) throws CloneNotSupportedException {
	        this(subsubClass.superClass, subsubClass.subClass, subsubClass.subsubClass);
	    }
	    
	    @Override
	    public String toString() {
	        return "subsubClass{" + "subsubClass=" + subsubClass +"} " + super.toString();
}}
