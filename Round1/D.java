import java.util.*;
class D{
	int prime (int a ){
		for(int i=2; i<Math.sqrt(a);i++){
			if(a%i==0 && number!=i)
				return 0;

		}
		return 1;
	}
	public static void main(String[] args) {
		int n,flag=0;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int primes [] = new int [n];
		for(int i=0;i<n;i++){
			primes[i]= sc.nextInt();
			D obj = new D();

			if(obj.prime(primes[i])==0){
				flag=1;
				break;
			}
		}
		int op =3,tot=1;

		if(flag ==0){
			int x=0, y=0;
			int pt =0;
			int j=0;
				for(int i=2 i<=primes[n-1];i++){
					  
						if(obj.prime(i)==1){
							if(i==prime[pt]){
								System.out.print("("+x+","+y+")");
								if(op==0){

								}
							}
							if(op==0 && j==tot){
								y+1;
								op=1;
							}else if(op=1&& j==tot){
								x+1;
								op=2;
							}
							else if (op=2&& j==tot){
								y-1;
								op=3
							}
							else if (op=3&& j==tot){
								y-1;
								op=0
							}


						}	
					
				}
		}
	}
}