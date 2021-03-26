package Exercises;

public class Math {

	private int a=0;
	private int b=0;

	public Math(int a,int b) {
		this.a = a;
		this.b = b;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int sum() {
		return a+ b;
	}

	public int subtract() {
		return a-b;
	}

	public int mul() {
		return a*b;
	}

	public float div() {
		return a/b;
	}

	public float conditionalOperation() {

//		switch((a<b)?1:(a>b && b!=0)?2:(a==b)?3:(a>b )?4:-1){
//		case 1:
//			return sum();
//		case 2:
//			return div();
//		case 3:
//			return mul();
//		case 4:
//			return subtract();
//		default:
//			System.out.println("Invalid Condition");
//		}

		if(a<b) {
			return sum();
		}
		else if(a>b) {
			return subtract();
		}
		else if(a==b) {
			return mul();
		}
		else if(a>b && b!=0) {
			return div();
		}

		return 0;
	}

	public int func(int a, int b) {
		if(a>b) return -1;
		int sum = 0;

//		for(int i = a; i<=b; i++) {
//			sum+=i;
//		}

		while(a<=b) {
			sum+=a;
			a++;
		}

		return sum;
	}

}
