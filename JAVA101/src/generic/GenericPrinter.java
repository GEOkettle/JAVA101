package generic;

public class GenericPrinter<T> {
	//내부에서 메서드가같으면 어떤 자료형이던 받을 수 있는 <Type>을 받겠다.
	//다이아몬드 연산자
	private T material;

	public T getMaterial() {
		return material;
	}

	public void setMaterial(T material) {
		this.material = material;
	}
	
	public String toString() {
		return "재료는 " + material.toString() + " 입니다.";
	}
	
	
}
