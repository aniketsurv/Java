package june29interface;

public interface GraphicsObject{

	
	void shape();
	void drawobject();
	default void noofsides() {
		System.out.println("print");
	}
	
}
