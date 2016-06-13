package basics;

public class hello {
	public float Demo(float a, float b){
		return (a+b);
	}
	public int Demo(int a, int b){
		return (a+b);
	}
	public double Demo(double a, double b){
		return (a+b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hello a=new hello();
		System.out.println(a.Demo(2,5));
		System.out.println(a.Demo(2.5,3.5));
		System.out.println(a.Demo(15,3.5));
		

	}


}

