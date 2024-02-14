#include <stdio.h>
#include <stdlib.h>

int main()
{
    int celsius;
    printf("Digite a temperatura em celsius: ");
    scanf("%d", &celsius);
    printf("Essa temperatura convertida em  Fahrenheit é igual à %d", (celsius*1.8) + 32);
    return 0;
}

