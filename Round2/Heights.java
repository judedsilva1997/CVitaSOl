import java.util.*;
class Heights{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		if(t>=1 && t<=1000){
			for(int i1=0;i1<t;i1++){
				int n = sc.nextInt(), b = sc.nextInt();
				if(b>=1 && b<=1000){
					int flag=0;
					int h[] = new int[n];
					for(int i=0;i<n;i++){
						h[i]=sc.nextInt();
						if(h[i]<1 || h[i]>250)
							flag=1;
					}
					if(flag==0){
						int newh[]= new int[n];
						int max =h[0],pos=0;
						if(n%2==0){
							

							for(int i=0;i<n;i++){
								if(h[i]>=max){
									max=h[i];
									pos=i;
								}
							}
							for(int i=0;i<n;i++){
								if(h[i]==max)
									newh[i]=1;
								else
									newh[i]=0;
							}
							int x=-1;
							for(int p=0;p<n/2;p++){
								if(newh[p]==1){
									x=p;
									break;
								}
							}
							if(x==-1){
								x=n+5;
							}
							int y=-1,y1=-1;
							for(int p=n-1;p>=n/2;p--){
								if(newh[p]==1){
									y=n-1-p;
									y1=p;
									break;
								}
							}
							if(y==-1){
								y=n+5;
							}
							if(y>x){
								max = max +n/2-1-x;
								for(int i=(n/2)-1,j=n/2;j<n;i--,j++){
									newh[i]=max;
									newh[j]=max;
									max--;
								}
							}else{
								max = max +y1-n/2;
								for(int i=(n/2)-1,j=n/2;j<n;i--,j++){
									newh[i]=max;
									newh[j]=max;
									max--;
								}
							}
						}else{
							for(int i=0;i<n;i++){
								if(h[i]>max){
									max=h[i];
									pos=i;
								}
							}
							for(int i=0;i<n;i++){
								if(h[i]==max)
									newh[i]=1;
								else
									newh[i]=0;
							}
							int x=-1;
							for(int p=0;p<=n/2;p++){
								if(newh[p]==1){
									x=p;
									break;
								}	
							}
							if(x==-1){
								x=n+5;
							}
							int y=-1,y1=-1;
							for(int p=n-1;p>n/2;p--){
								if(newh[p]==1){
									y=n-1-p;
									y1=p;
									break;
								}
							}
							if(y==-1){
								y=n+5;
							}
							if(y>x){
								max = max +n/2-x;
								newh[n/2]=max;
								max--;
								for(int i=(n/2)-1,j=n/2+1;j<n;i--,j++){
									newh[i]=max;
									newh[j]=max;
									max--;
								}
							}else{
								max = max +y1-n/2;
								newh[n/2]=max;
								max--;
								for(int i=(n/2)-1,j=n/2+1;j<n;i--,j++){
									newh[i]=max;
									newh[j]=max;
									max--;
								}	
							}
						}
						double sum1 =0;
						for(int i=0;i<n;i++){
							double sum =0;
							int a = newh[i]-h[i];
							
							for(int j=b;j>=b-(a-1);j--)
								sum  = sum + Math.pow(Math.max(j,1),2);

							sum = sum * 1000;
							
							sum1= sum1 +sum;
						}
						System.out.printf("%.0f\n", sum1);

					}
				}

			}
		}
	}
}