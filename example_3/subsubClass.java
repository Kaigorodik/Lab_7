package lab_7_example_07_03;

public class subsubClass extends subClass {
	 public String subsubClass;
	 
	 public subsubClass(int superClass, char subClass, String subsubClass) {
	        super(superClass, subClass);
	        this.subsubClass = subsubClass;
	    }
	 
	 public void setParameter(int superClass, char subClass, String subsubClass) {
	        super.setParameter(superClass, subClass);
	        this.subsubClass = subsubClass;
	    }
	 
	 @Override
	    public String toString() {
	        return "subsubClass{" +
	                "subsubClass='" + subsubClass + '\'' +"} " + super.toString();

}}
