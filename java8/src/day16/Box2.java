package day16;

public class Box2<T> {		//제네릭은 타입매개변수
	private T object;
	public void set(T object) {
		this.object = object;
	}
	public T get() {
		return object;
	}
}

