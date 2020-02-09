package Tasks;

public class Calc {
	private int y,x,result;
	
	public int setY(int y) {
		this.y = y;
		return y;
	}
	
	public int setX(int x) {
	 this.x = x;
	 return x;
	}
	
	public void plus() {
		result = x+y;
	}
	
	public void minus() {
		result = x-y;
	}
	
	public int getResult() {
		
		return result;
	}

	
}
