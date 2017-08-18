import java.util.*;
class B{
	public static void main(String[] args)throws Exception {
		int m,n;
		Scanner sc = new Scanner(System.in) ;
		m= sc.nextInt();
		n= sc.nextInt();

		if(m>=3 && m<=20 && n>=3 && n<=20 ){
			int r= sc.nextInt(), c= sc.nextInt();
			String[][] st = new String[m][n];
			int fire[][] = new int[m][n];
			for(int i=0; i<m;i++){
				for(int j=0;j<n;j++){
					st[i][j]=sc.next();
					
				}
			}
			
			r=r-1;
			c=c-1;
			int count =1;
			st[r][c]=Integer.toString(count);
			ArrayList <Integer> rl  = new ArrayList<Integer>();
			ArrayList <Integer> cl  = new ArrayList<Integer>();
			rl.add(r);
			cl.add(c);
			int size= rl.size();
			while(rl.size()!=0){
				count++;
				for(int z=0;z<size;z++){
				r = Integer.valueOf(rl.get(0));
				c = Integer.valueOf(cl.get(0));
				rl.remove(0);
				cl.remove(0);
				
					for(int k=-1;k<2;k++){

						for(int l=-1;l<2;l++){

							//System.out.print(r+k );
								//System.out.print(" ");
								//System.out.print(c+l);
							if((r+k>=0 && r+k<m && c+l>=0 && c+l<n)&& !(k==0&&l==0)  ){
								
								if(st[r+k][c+l].equals("T")){
									rl.add(r+k);
									cl.add(c+l);
									st[r+k][c+l]=Integer.toString(count);
							}

								
							}
						}
					}
				}
				size = rl.size();
			}
			System.out.println(count-1);
			
		}
	}
}