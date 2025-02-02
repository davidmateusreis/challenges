## Verificação de Serviço Contratado

**Descrição**

Uma concessionária de telecomunicações oferece quatro tipos de serviços: telefonia móvel, telefonia fixa, banda larga e TV por assinatura. Para facilitar o atendimento ao cliente, é necessário implementar um programa que verifique se um cliente específico contratou um determinado serviço. Por exemplo, quando um cliente liga para a central de atendimento e menciona um serviço, o atendente deve ser capaz de rapidamente verificar se esse serviço está contratado pelo cliente.

**Entrada**

A entrada deve receber duas linhas. A primeira linha contém o nome do serviço a ser verificado (por exemplo, "movel", "fixa", "banda larga", "tv"). A segunda linha contém o nome do cliente seguido pelos serviços que ele contratou, todos separados por vírgulas (por exemplo, "Alice,movel,fixa").

**Saída**

Deverá retornar "Sim" se o cliente contratou o serviço e "Não" caso contrário.

**Exemplos**

| Entrada (Serviço, Cliente e Serviços Contratados) | Saída |
|---|---|
| Movel; Eren, Movel, Fixa | Sim |
| Fixa; Armin, Movel, TV | Não |
| TV; Mikasa, Movel, Fixa, TV | Sim |