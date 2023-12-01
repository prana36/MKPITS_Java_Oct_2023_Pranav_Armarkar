#include <stdio.h>
int main()
{
   int a ,b ;
   printf("Enter a no1.: ");
   scanf("%d", &a);
    printf("Enter a no2.: ");
   scanf("%d", &b);
   if (a>b) 
   {
      printf("%d \na is greater than b.",a);
   }
   else if (a<b)
   {
       printf("%d \nb is greater than a.",b);
   }
   return 0;
}