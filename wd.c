#include<stdio.h>
int main()
{

    char a[10];
    scanf("%s",a);
    if(strcmp(a,"sunday")==0)
        printf("false");
    else
        printf("true");
    return 0;
}
