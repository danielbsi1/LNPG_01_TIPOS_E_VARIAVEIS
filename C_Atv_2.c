#include <stdio.h>
#include <stdlib.h>

int main()
{
    int numero;
    printf("Digite um n�mero: ");
    scanf("%d", &numero);
    if(numero%2 == 0){
        printf("Esse n�mero � par");
    } else{
        printf("Esse n�mero � impar");
    }
    return 0;
}
