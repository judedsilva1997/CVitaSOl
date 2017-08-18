#include<stdio.h>
int main()
{
	int k, field[20][20],ra,ca,rb,cb,i,j,l,flag=0,barrier[4],op,min,ml,step;
	scanf("%d",&k);
	if(k>=3&& k<=20){
		scanf("%d %d",&ra,&ca);
		scanf("%d %d",&rb,&cb);
		for(i=0;i<k;i++){
			for(j=0;j<k;j++){
				scanf("%d",&field[i][j]);
			}
		}
		
		//move upward

		min=1000;
		ml=10;
		step=0;
		for(l=1;l<5;l++){
			i=rb;
			j=cb;
			op=l;
			barrier[l-1]=0;
			while(i<k && j<k && i>=0&& j>=0){
				
				if(i==ra && j==ca){
					break;
				}
				else if(field[i][j]==1){
					
					barrier[l-1]++;
					if(op==1){
						
						op=2;
					}	
					else if(op==2){
						op=1;
						
					}else if(op==3){
						op=4;
					}
					else if(op==4){
						op=3;
					}
				}
				else if(field[i][j]==2){
					
					barrier[l-1]++;
					if(op==1)
						op=4;
					else if(op==2){
						op=3;
					}else if(op==3){
						op=2;
					}
					else if(op==4){
						op=1;
					}
				}

				if(op==1)
					i--;
				else if(op==2)
					j++;
				else if (op==3)
					i++;
				else if (op ==4)
					j--;
				step++;
			}
					if(i==ra && j==ca){

			if(min>step){
				min=step;
				ml=l-1;
			}
		}
			flag =0;
		}
		if(min==1000){
			printf("-1");
	
		}else if (barrier[ml]==0)
			printf("%d %d",min-1,barrier[ml]);
		else
			printf("%d %d",min,barrier[ml]);

	}
	return 0;
}