package gto;

public class Higto {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) 
	{
		//inheri.12
		new ChildClass("hi");
	}
}

class BaseClass {
    BaseClass() {
        System.out.print("*");
    }
    BaseClass(String str) {
        this();
        System.out.print("@" + str);
    }
}
class ChildClass extends BaseClass {
    ChildClass() {
        System.out.print("#");
    }
    ChildClass(String name) {
        this();
        System.out.print("$" + name);
    }
   
}
