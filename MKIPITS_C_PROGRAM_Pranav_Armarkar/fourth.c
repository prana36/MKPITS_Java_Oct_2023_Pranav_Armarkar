#include<stdio.h>
int main() 
{
    int P,C,M,T,average;
    printf("Pranav Marksheet\n");
     printf("P= ");
     scanf("%d",&P);
      printf("C= ");
      scanf("%d",&C);
       printf("M= ");
       scanf("%d",&M);
       {
           if(P>=50)
           printf("\nPASS in P");
         
         else
         printf("\nFAIL in P");
       }
       {
       if(C>=50)
           printf("\nPASS in C");
         
         else
         printf("\nFAIL in C");
       }
       {
       if(M>=50)
           printf("\nPASS in M");
         
         else
         printf("\nFAIL in M");
        }
         T = P+C+M;
        // printf("\ntotal=  %d",T);
         average = T/3 ;
          printf("\naverage=  %d",average);
        {
             if(average>=60)
             printf("\nResult is PASS");
         
         else
         printf("\nResult is FAIL");
        }
   return 0;
}