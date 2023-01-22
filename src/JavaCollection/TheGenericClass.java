package JavaCollection;

class Generic<T>{
	private T data;

	public Generic(T data) {
		
		this.data = data;
	}

	public T getData() {
		return data;
	}

	@Override
	public String toString() {
		return "Generic [data=" + data + "]";
	}
	
	
	
	
	
}



public class TheGenericClass {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Generic<String> g = new Generic<String>("some data");
		String data = g.getData();
		System.out.println(data);
		

	}

}
