package lab_7_example_07_04;

public class superClass {
	
	 public char superClass;

	    public superClass(char superClass) {
	        this.superClass = superClass;
	    }

	    public superClass(superClass superClass) throws CloneNotSupportedException {
	    this(superClass.superClass);
	    }
	    @Override
	    public String toString() {
	        return "superClass{" + "superClass=" + superClass + '}';


}}
