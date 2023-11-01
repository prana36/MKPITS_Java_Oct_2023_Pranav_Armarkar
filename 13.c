#include<stdio.h>
int main()
{
	int A1,A2,A3,SOAOT;
	printf("Enter A1 =");
	scanf("%d",&A1);
	printf("Enter A2 =");
	scanf("%d",&A2);
	printf("Enter A3 =");
	scanf("%d",&A3);
	SOAOT=A1+A2+A3;
	printf("%d",SOAOT);
	if(SOAOT>0 || SOAOT<=180)
	{
		printf("\nTriangle is formed");
	}else
		printf("\nTriangle is not formed");
	
}
