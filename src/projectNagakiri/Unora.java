package projectNagakiri;

public class Unora {

	public static void main(String[] args) {
//<<<<<<< HEAD

//		String nakagiri="kengo";
//		String urano = "fumitaka";
//
//		String uragiri = nakagiri+urano;
//
//		System.out.println(uragiri);

//=======
//		fib(1,1,1000);
//>>>>>>> refs/remotes/origin/develop
	}

	public static void fib(int seed,int next,int threshold){
		if(seed <=threshold){
			System.out.print(seed+" ");
			fib(next,seed+next,threshold);
		}
	}
}
