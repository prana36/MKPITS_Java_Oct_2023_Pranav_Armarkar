#include <stdio.h>
int main()
{
   int a ,b,c ;
   printf("Enter a no1.: ");
   scanf("%d", &a);
    printf("Enter a no2.: ");
   scanf("%d", &b);
   printf("Enter a no3.: ");
   scanf("%d", &c);
   if (a>b&&a>c) 
   {
      printf("%d \na is greater than b and c.",a);
   }
   else if (a<b&&b>c)
   {
       printf("%d \nb is greater than a and c.",b);
   }
   else if (a<c&&b<c)
   {
       printf("%d \nc is greater than a and b.",c);
   }
   return 0;
}