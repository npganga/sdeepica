#include<stdio.h>
#include<conio.h>
void main()
{
int n1=0,n2=1,n3,i,number;
printf("enter the number of elements:");
scanf("%d",&number);
printf("%d%d",n1,n2);
for(i=2;i<number;i++)
{
n3=n1+n2;
printf("\n%d",n3);
n1=n2;
n2=n3;
}
getch();
}
