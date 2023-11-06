#include<stdio.h>
int main()
{
	float x,y;
	printf("Enter x =");
	scanf("%f",&x);
	printf("Enter y =");
	scanf("%f",&y);
	if(x>0&&y>0)
	{
		printf("\npoint lies on Quadrant 1");
	}else if(x<0&&y>0)
	{
		printf("\npoint lies on Quadrant 2");
	}else if(x<0&&y<0)
	{
	printf("\npoint lies on Quadrant 3");
    } else if(x>0&&y<0)
    {
    	printf("\npoint lies on Quadrant 4");
	} else
	{
		printf("\npoint lies on origin");
	}
}