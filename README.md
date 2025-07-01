# ActionsBancaryAccount

===========================================
🏦 SISTEMA DE AÇÕES BANCÁRIAS - JAVA POO
===========================================

📌 DESCRIÇÃO:
Sistema simples de contas bancárias desenvolvido em Java, utilizando apenas o terminal (linha de comando).
Permite criar contas, realizar depósitos, saques, consultar saldo e ver todas as contas cadastradas.

-------------------------------------------
🧾 FUNCIONALIDADES:
-------------------------------------------
- Criar nova conta bancária
- Depositar valores em contas existentes
- Sacar valores (com validação de saldo)
- Consultar o saldo e os dados da conta
- Comando oculto: visualizar todas as contas (modo debug)

-------------------------------------------
📋 MENU PRINCIPAL:
-------------------------------------------
Atividade Ações Bancárias!
Escolha a função:
1 - Criar Conta
2 - Realizar Depósitos 
3 - Realizar Saques
4 - Consultar Saldo
0 - Fechar Sistema

-------------------------------------------
🖥️ EXEMPLO DE USO:
-------------------------------------------

✅ Criar Conta:
Digite o Nome do Titular:
João Silva
Digite o número da conta:
12345
Conta criada com sucesso!

💰 Depositar:
Digite a posição da conta:
1
Digite a quantia a ser depositada:
500
O valor RS 500 foi adicionado a sua conta - TOTAL: 500.0

💸 Sacar:
Digite a posição da conta:
1
Digite a quantia a ser sacada:
200
O valor RS 200 foi sacado de sua conta - TOTAL: 300.0

📊 Consultar Saldo:
Digite a posição da conta:
1
Titular da conta de número 12345: João Silva - SALDO: 300.0

🛠️ Debug:
Digite "debug" no menu principal para listar todas as contas cadastradas no sistema.

-------------------------------------------
📂 ARQUIVOS DO PROJETO:
-------------------------------------------
1. Main.java
   - Responsável pelo menu, entrada de dados e controle geral do sistema.

2. BancaryAccount.java
   - Classe que representa a conta bancária.
   - Contém atributos: accountHolder, accoutNumber, accountBalance
   - Métodos:
     - accountDetails() → mostra os dados da conta
     - accountDeposit(valor) → adiciona saldo
     - withdrawAccount(valor) → saca valor se saldo for suficiente

-------------------------------------------
✅ VALIDAÇÕES:
-------------------------------------------
- Verificação de índice ao acessar contas
- Verificação de saldo antes de sacar
- Mensagens de erro para entradas inválidas

-------------------------------------------
📌 OBSERVAÇÃO:
-------------------------------------------
Este sistema não possui persistência de dados. Todas as contas criadas existem apenas enquanto o programa estiver em execução.

Ideal para estudos com Java básico e introdução à Programação Orientada a Objetos (POO).

-------------------------------------------
👨‍💻 CRIADO PARA FINS DIDÁTICOS
-------------------------------------------
Você pode modificar, reaproveitar e expandir este sistema livremente.