package rectangle;

public class Point <V,T>{

	T x;
	V y;
	
	Point(T x, V y){
		this.x = x;
		this.y = y;
	}

	public T getX() {
		return x;
	}

	public V getY() {
		return y;
	}
	
	
}
