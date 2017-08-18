#include<stdio.h>
int main()
{
	/* code */
	int m,n,r,c,i,j;
	char fore[20][20];
	scanf("%d",&m);
	scanf("%d",&n);
	if(m>=3 && m<=20 && n>=3 && n<=20 ){
		scanf("%d",&r);
		scanf("%d",&c);
		for(i=0;i<m;i++){
			for(j=0;j<n;j++){
				scanf("%c",&fore[i][j]);
			}
		}
		for(i=0;i<m;i++){
			for(j=0;j<n;j++){
				printf("%c",fore[i][j]);
			}
			printf("\n");
		}
	}
	return 0;
}