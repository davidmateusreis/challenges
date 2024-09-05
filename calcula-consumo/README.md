## Cálculo de Consumo de Dados Móveis

**Descrição**

Você foi contratado por uma empresa de telecomunicações para desenvolver um sistema que calcule o consumo total de dados móveis de um cliente durante um mês. O consumo semanal de dados móveis é fornecido como entrada. Além de calcular o total de dados consumidos no mês, o sistema deve fornecer uma média semanal de consumo e identificar a semana de maior consumo.

**Entrada**

A entrada do programa é uma string com uma lista de valores representando o consumo semanal de dados em megabytes (MB), separados por vírgulas. Cada valor na lista corresponde ao consumo total de uma semana.

**Saída**

A saída do programa deve incluir:

* O consumo total de dados móveis em MB ao longo do mês.
* A média semanal de consumo de dados móveis.
* A semana de maior consumo (considerando o primeiro valor como o da semana 1).

**Exemplos**

| Entrada (Consumo Semanal em MB) | Saída (Total, Média, Maior Semana) |
|---|---|
| 2064, 4000, 2000, 3200 | Total mensal: 11264 MB, Média semanal: 2816 MB, Maior consumo: Semana 2 |
| 5000, 4880, 4600, 6000 | Total mensal: 20480 MB, Média semanal: 5120 MB, Maior consumo: Semana 4 |
| 4000, 4456, 6000, 5000 | Total mensal: 19456 MB, Média semanal: 4864 MB, Maior consumo: Semana 3 |