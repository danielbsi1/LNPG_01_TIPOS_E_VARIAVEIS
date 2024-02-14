#include <stdio.h>
#include <stdlib.h>

int main()
{
    printf("Bem vindo a calculadora em C");
    float numero_1;
    printf("Digite o primeiro número: ");
    scanf("%f", &numero_1);
    float numero_2;
    printf("digite o segundo número: ");
    scanf("%f", &numero_2);
    float divisao = numero_1 / numero_2;
    printf("%.f + %.f = %.1f\n", numero_1, numero_2, numero_1 + numero_2);
    printf("%.f / %.f = %.1f\n", numero_1, numero_2, divisao);
    printf("%.f X %.f = %.1f\n", numero_1, numero_2, numero_1 * numero_2);
    printf("%.f - %.f = %.1f\n", numero_1, numero_2, numero_1 - numero_2);

    return 0;
}
