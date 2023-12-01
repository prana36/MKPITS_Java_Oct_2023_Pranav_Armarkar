#include<stdio.h>
int main()
{
	int x,y,z;
	printf("Enter x =");
	scanf("%d",&x);
	printf("Enter y =");
	scanf("%d",&y);
	x=x+y;
	y=x-y;
	x=x-y;
	//x=x-y;
		printf("\nswaped value of x= %d",x);
	printf("\nswaped value of y= %d",y);
		
}
