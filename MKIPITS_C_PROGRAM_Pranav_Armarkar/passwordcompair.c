#include<stdio.h>
#include<conio.h>
int main()
{
	int value;
	char Name [20];
	int Mobile_No [30];
	char Email [40];
	char User_Id [40];
	char Password[40];
	char cPassword[40];
	printf("Enter Name = ");
	scanf("%s",&Name);
    printf("\nEnter Email Name = ");
    scanf("%s",&Email);
    printf("\nEnter Email Mobile No. = ");
    scanf("%d",&Mobile_No);
    printf("\nEnter User Id = ");
	scanf("%s",&User_Id);
	printf("\nEnter Password = ");
	scanf("%s",&Password);
	printf("\nEnter conform Password = ");
	scanf("%s",&cPassword);
  if(strcmp(User_Id,"mkpits"))
  {
    printf("\n User_Id valid ");
  }else 
  printf("\n User_Id invalid ");
  
  value = strcmp(Password,cPassword);
  if(value==0)
  {
  	printf("\n fine ");
  }else
  printf("\n check Password ");
  }