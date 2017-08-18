import java.util.*;
class Rooks{
	static int max = 0;
	static ArrayList<Integer> al1;
	int perm(int chess[][],int a,int i,int j,int cnt,int n,ArrayList<Integer> al) {
		ArrayList<Integer>ad = new ArrayList<Integer>();
		for(int x =0;x<al.size();x++){
			ad.add(al.get(x));
		}

		int che[][] = new int[n][n];
		for(int x=0;x<n;x++){
			for(int y=0;y<n;y++){
				che[x][y]=chess[x][y];
			}
			
		}
		ad.add(che[i][j]);
		cnt = cnt+che[i][j];
		che[i][j]=-1;
		
		
		int count =0;
		for(int z=0;z<n;z++){
			if(che[i][z]==-1)
				count++;
		}	
		if (count >1)
			return 0;
		
		count =0;
		for(int z=0;z<n;z++){
			if(che[z][j]==-1)
				count++;	
		}
		if (count >1)
			return 0;
		
		
		if(a==0 && cnt>max){
			Rooks.max=cnt;
			al1=ad;
			return 0;
		}else if (a==0){
			return 0;
		}
		

		Rooks r = new Rooks();
		for(int x=0;x<n;x++){
			for (int y =0;y<n ;y++ ) {
				if(che[x][y]!=-1){
					
					r.perm(che,a-1,x,y,cnt,n,ad);
				}
					
			}

		}
		return 0;
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String c = sc.next();
		int arr []= new int[2];
		StringTokenizer st = new StringTokenizer(c,",");
		int cut=0;
		while (st.hasMoreTokens()){
			arr[cut]=Integer.parseInt(st.nextToken());
			cut++;
		}
		int chess[][]= new int[n][n];
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				chess[i][j]=sc.nextInt();
			}
		}
		Rooks r = new Rooks();
		ArrayList <Integer> al= new ArrayList<Integer>();
		r.perm(chess,n-1,arr[0]-1,arr[1]-1,0,n,al);
		System.out.println();
		System.out.println();
		for(int i=0;i<4;i++){
			System.out.print(Rooks.al1.get(i)+" ");
		}
		System.out.println();
		System.out.println(Rooks.max);
		
	}
}
/*
4
3,3
50 58 13 57
40 32 26 48
37 13 28 20
49 25 31 28
*/