package lab_7_example_1;

public class subClassTest extends superClassTest{
	
	private String str2; private String str3;
	//конструктор с одним параметром
	subClassTest(String strEx) { super(strEx);
	}
	//конструктор с двумя параметрами
	subClassTest(String strEx2, String strEx3){ this.str2 = strEx2;
	this.str3 = strEx3;
	}
	//@Override - аннотация для указываемая для того, чтобы показать что далее мы собираемся переопределять метод суперкласса
	@Override
	public String toString() {
	String ClassNameAndFieldValue; ClassNameAndFieldValue = "sub" + "\n" +
	" Class name: " + this.getClass().getSimpleName() + "\n" + " str 1 = " + this.getStr1() + "\n" +
	" str 2 = " + this.str2 + "\n" +
	" str 3 = " + this.str3;
	return ClassNameAndFieldValue ; }
	public String getStr3() { return str3;
	}
	public void setStr3(String str3) { this.str3 = str3;
	}
	public String getStr2() { return str2;
	}
	public void setStr2(String str2) { this.str2 = str2;
	} }
