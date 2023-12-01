#include<stdio.h>
int main() 
{
    int hindi,eng,maths,chem,bio,T,average;
    printf("Pranav Marksheet\n");
     printf("hindi= ");
     scanf("%d",&hindi);
      printf("eng= ");
      scanf("%d",&eng);
       printf("maths= ");
       scanf("%d",&maths);
        printf("chem= ");
        scanf("%d",&chem);
         printf("bio= ");
         scanf("%d",&bio);
         T = hindi+eng+maths+chem+bio;
         printf("\ntotal=  %d",T);
         average = T/5 ;
          printf("\naverage=  %d",average);
        {
             if(average>=50)
             printf("\nResult is PASS");
         
         else
         printf("\nResult is FAIL");
        }
   return 0;
}