import java.util.*;
class Prime{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] st = new String [4];

		for(int i1 =0; i1<4;i1++){
			st[i1]=sc.nextLine();
		}
		int flag=0;
		int a[][]= new int[4][2];
		for(int i1 =0; i1<4;i1++){
			StringTokenizer str = new StringTokenizer(st[i1],",");
			int j=0;
			while(str.hasMoreTokens()){
				a[i1][j]=Integer.parseInt(str.nextToken());
				j++;
			}
		}
		if(a[0][0]>2&& a[0][0]<1000000000 && a[0][0]>2&& a[0][0]<1000000000){

				int b []= new int[2];
		b[0]= 2*a[1][0]+a[2][0]-a[3][0];
		b[1]= 2*a[1][1]+a[2][1]-a[3][1];
		int max =0;
		if(b[0]>b[1])
			max = 0;
		else
			max = 1;
		int i=0;
		
		for(i=b[max];i<a[0][0]*a[0][1];i=i+a[0][max]){
			if(max==0){
				if(i%a[0][1]==b[1])
					break;
			}else if(max==1){
				if(i%a[0][0]==b[0])
					break;
			}
		}
		System.out.println(i);

		}

		
		
		
	}
}