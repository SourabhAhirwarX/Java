#include<stdio.h>

int main() {
    int n, a, s=0, j;
    scanf("%d",&n);
    a = n;
    while(n>0) {
        j = n%10;
        s = s + (j*j*j);
        n = n/10;
    }
    if(a==s) {
        printf("Armstrong");
    }
    else {
        printf("Not Armstrong");
    }
}