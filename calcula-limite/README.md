## Verificação de Limite de Dados Móveis

**Descrição**

Desenvolva um sistema para monitorar o consumo mensal de dados móveis de clientes, verificando se excede o limite do plano adquirido. O sistema deve comparar o limite mensal, recebido em gigabytes (GB), com o consumo total de dados acumulado até o momento, fornecido em megabytes (MB). Se o consumo total ultrapassar o limite mensal, o sistema deverá informar ao cliente para adquirir ou renovar o pacote; caso contrário, deve retornar quanto em megabytes (MB) ainda está disponível para uso no mês.

**Entrada**

A entrada do programa é fornecida em duas linhas:

* A primeira linha contém o limite mensal de dados em gigabytes (GB).
* A segunda linha contém o consumo total de dados móveis em megabytes (MB).

**Saída**

Deverá retornar "Limite de dados excedido. Compre ou renove seu pacote" caso o cliente não tenha limite e "Você ainda possui um quantidade de MB disponíveis" caso contrário.

**Exemplos**

| Entrada (Limite em GB, Consumo em MB) | Saída |
|---|---|
| 10, 11264 | Limite de dados excedido. Compre ou renove seu pacote. |
| 25, 20480 | Você ainda possui 5120 MB disponíveis. |
| 20, 19456 | Você ainda possui 1024 MB disponíveis. |