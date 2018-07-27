package projectNagakiri;

public class Unora {

	public static void main(String[] args) {
		fib(1,1,1000);
	}

	public static void fib(int seed,int next,int threshold){
		if(seed <=threshold){
			System.out.print(seed+" ");
			fib(next,seed+next,threshold);
		}
	}
}
