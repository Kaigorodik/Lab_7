package lab_7_example_07_02;

public class superClass {
	  private String superclassString;
	  
	  public superClass(String superclassString) {
	        this.superclassString = superclassString;
	    }

	  public String returnParameter() {
	        return superclassString;
	    }
	  
	  public int returnParameterLength() {
	        return superclassString.length();
	    }
	  
	  public void setParameter(String superclassString) {
	        this.superclassString = superclassString;
	    }
	  
	  public void setParameter() {
	        this.superclassString = "Hello";
	    }
	  
	  @Override
	    public String toString() {
	        return "superClass{" +
	                "superclassString='" + superclassString + '\'' +
	                '}';
	    }
	}

