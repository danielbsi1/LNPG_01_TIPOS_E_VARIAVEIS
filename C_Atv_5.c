
#include <stdio.h>
#include <stdlib.h>

int main()
{
    float nota_1;
    printf("Digite a primeira nota: ");
    scanf("%f", &nota_1);
    int peso_1;
    printf("Qual é o peso dessa nota? ");
    scanf("%d", &peso_1);
    float nota_2;
    printf("digite a segunda nota: ");
    scanf("%f", &nota_2);
    int peso_2;
    printf("Qual é o peso dessa nota? ");
    scanf("%d", &peso_2);
    float nota_3;
    printf("digite a terceira nota: ");
    scanf("%f", &nota_3);
    int peso_3;
    printf("Qual é o peso dessa nota? ");
    scanf("%d", &peso_3);
    float peso_total = peso_1 + peso_2 + peso_3;
    int nota_total = nota_1 * peso_1 + nota_2 * peso_2 + nota_3 * peso_3;
    printf("A média ponderada resultante é %.2f", nota_total / peso_total);

    return 0;
}
