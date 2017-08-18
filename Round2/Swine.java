import java.util.*;
class Swine{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		if(n<=15){
			int a[][]= new int [n][n];
			int change[][] = new int [n][n];
			for(int i =0;i<n;i++){
				for(int j=0;j<n;j++){
					a[i][j]=sc.nextInt();
					change[i][j]=0;
				}
			}
			int x=sc.nextInt();
			int y=sc.nextInt();
			int b=sc.nextInt();
			int d = sc.nextInt();

			if(a[x-1][y-1]==1){
				a[x-1][y-1]=5;
				ArrayList <Integer> rl  = new ArrayList<Integer>();
				ArrayList <Integer> cl  = new ArrayList<Integer>();
				rl.add(x-1);
				cl.add(y-1);
				int size= rl.size();
				int count =5;
				while(rl.size()!=0){
				for(int z=0;z<size;z++){
				int r = Integer.valueOf(rl.get(0));
				int c = Integer.valueOf(cl.get(0));
				rl.remove(0);
				cl.remove(0);
				
					for(int k=-1;k<2;k++){

						for(int l=-1;l<2;l++){

								
							if((r+k>=0 && r+k<n && c+l>=0 && c+l<n)&& !(k==0&&l==0)  ){
								//System.out.print(r+k );
								//System.out.print(" ");
								//System.out.print(c+l);
								if(a[r+k][c+l]==1&&count >1){
									rl.add(r+k);
									cl.add(c+l);
									a[r+k][c+l]=count;
							}

								
							}
						}
					}
				}
				
				count--;
				size = rl.size();
			}
			}
			if(a[b-1][d-1]!=1){
				
				a[b-1][d-1]=1;
				ArrayList <Integer> rl  = new ArrayList<Integer>();
				ArrayList <Integer> cl  = new ArrayList<Integer>();
				rl.add(b-1);
				cl.add(d-1);
				int size= rl.size();
				int count =0;
				while(rl.size()!=0){
				for(int z=0;z<size;z++){
						
				int r = Integer.valueOf(rl.get(0));
				int c = Integer.valueOf(cl.get(0));
				rl.remove(0);
				cl.remove(0);
				
					for(int k=-1;k<2;k++){

						for(int l=-1;l<2;l++){

								
							if((r+k>=0 && r+k<n && c+l>=0 && c+l<n)&& !(k==0&&l==0)  ){
								//System.out.print(r+k );
								//System.out.print(" ");
								//System.out.print(c+l);
								if(a[r+k][c+l]>1){
									
									if(count ==0 && change[r+k][c+l]==0)
									{		rl.add(r+k);
											cl.add(c+l);
											a[r+k][c+l]=1;
											change[r+k][c+l]=1;
									}	
									else if (count >0 && change[r+k][c+l]==0){
										rl.add(r+k);
										cl.add(c+l);
										a[r+k][c+l]--;
										change[r+k][c+l]=1;
										
									}	
							}

								
							}
						}
					}

				}
				
				count ++;
				size = rl.size();
			}
			}
			for(int i =0;i<n;i++){
				for(int j=0;j<n;j++){
					System.out.print(a[i][j]+" ");
				}
				System.out.println();
			}
		}
		
	}
}