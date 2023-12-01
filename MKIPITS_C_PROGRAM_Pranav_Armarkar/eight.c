#include<stdio.h>
int main() 
{
    int hindi,eng,maths,chem,bio,percentage;
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
         percentage = (hindi+eng+maths+chem+bio)*100/500;
         printf("\npercentage= %d",percentage);
         {
             if(percentage<50)
             printf("Grade is E");
          else if(percentage>=50,percentage<60)
             printf("Grade is D");
         }
           {
              if(percentage>=60,percentage<70)
             printf("Grade is c");
         else if(percentage>=70,percentage<80)
             printf("Grade is b");
           }
         if(percentage>=80)
             printf("Grade is a");
             
   return 0;
}