# Java-bancoAPI

Requisitos:
Deverá usar payloads no formato json
Usar prefixo e versionamento, ex.: “localhost:8080/api/v1/algumacoisa”
Usar os padrões de API REST, seguir o modelo de maturidade de Richardson a partir do nível 2 (alcançar a glória do REST, lembra?)
Aplicar validação (hibernate validator) em alguns atributos do payload de solicitação (onde fizer sentido)
Seguir aquela estrutura que já vimos em aula (uso de Controller, Service, Dao, Dto)
Usar o Optional pra facilitar alguns tratamentos (exemplo, dados não encontrados)
Criar e lançar exceções, fazer pelo menos essas duas: NotFoundException e BadRequestException
Usar o banco de dados Mysql
Deverá tratar 2 entidades: User e Account (no banco são 2 tabelas que podem ter o relacionamento de 1 pra 1)
A API deve lidar com contas do tipo poupança e conta corrente.
A API deverá conter:
Cadastrar o usuário cliente:
nome
idade
telefone
endereço
Criar conta, deverá enviar somente:
o tipo de conta (melhor tratar como um “Enum” no back ou usar números, 1 = Conta corrente, 2 = Conta poupança)
usuário da conta (mandar o ID do usuário e no back fazer relacionamento entre as tabelas)
Depositar valor em uma conta
Sacar valor de uma conta
Listar contas (usar o relacionamento):
número da conta
tipo de conta
saldo atual
nome do usuário da conta
Detalhes da conta/usuário (usar o relacionamento):
número da conta
tipo de conta
saldo atual
nome do usuário da conta
idade
telefone
endereço
Regras de negócio:
Quando depositar valor em contas do tipo poupança, AO VALOR ENVIADO, deverá somar/acrescentar mais R$ 0.5 (Só uma condição qualquer pra ter uma diferença da conta corrente)
Observações:
Não colocar no github publicamente, alguns coleguinhas estavam copiando do outro sem ele saber
Não fazer e passar para os demais coleguinhas, se tiver projeto igual ou muito parecido, onde mudam só o nome do projeto, readme, e etc, ou seja, se ficar claro que não teve esforço ou que copiou de alguém, vai ter penalização.
Vou usar a estratégia do 
@gabriel.lange
, na medida do possível ir chamando um por um para mostrar e ir explicando o que fez.
