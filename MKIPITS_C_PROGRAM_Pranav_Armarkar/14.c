#include<stdio.h>
int main()
{
	int x,y,z;
	printf("Enter x =");
	scanf("%d",&x);
	printf("Enter y =");
	scanf("%d",&y);
	z=x;
	x=y;
	y=z;
	printf("\nswaped value of x= %d",x);
	printf("\nswaped value of y= %d",y);
		
}
