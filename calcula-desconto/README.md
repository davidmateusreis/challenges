## Cálculo de Desconto Progressivo em Combo

**Descrição**

Implemente um programa que calcule o valor total de um combo de serviços (telefonia móvel, banda larga e TV por assinatura) aplicando um desconto progressivo baseado na quantidade de serviços contratados. Cada serviço adicional contratado além do primeiro aumenta o desconto. A implementação deve utilizar Programação Orientada a Objetos (POO) para representar os serviços e os descontos.

**Entrada**

A entrada deve ser fornecida em duas linhas:

* A primeira linha contém os valores dos serviços contratados separados por vírgulas (telefonia móvel, banda larga, TV por assinatura). Um valor 0 indica que o serviço não foi contratado.
* A segunda linha contém os percentuais de desconto para 1, 2 e 3 serviços contratados respectivamente, também separados por vírgulas.

**Saída**

Deverá retornar o valor total com o desconto aplicado.

**Exemplos**

| Entrada (Valores dos Serviços, Descontos) | Saída (Valor Total) |
|---|---|
| 50, 70, 0; 5, 10, 15 | 108.00 |
| 69, 89, 119; 7, 10, 20 | 201.60 |
| 0, 59, 99; 3, 5, 10 | 150.10 |