#language:pt

Funcionalidade: Cadastro de movimentação
	Como um usuário cadastrado
	Desejo acessar o sistema 
	Para cadastrar movimentação
	
Cenário: Cadastro de movimentação falha 
	Dado Acessar a página de autenticação
	E Informar o email de acesso "email@email.com"
	E Informar a senha de acesso "@Admin1234"
	E Solicitar o acesso à minha conta de usuário
	E Selecionar aba Cadastrar Movimentação
	E Informar nome da movimentação "Compra de computador"
	E Informar data da movimentação "06-06-2024"
	E Informar valor da movimentação "5000"
	E Selecionar o tipo da movimentação "<tipo>"
	E Informar a descrição da movimentação "Compra de novos computadores e periféricos para o escritório."
	E Selecionar a categoria "<categoria>"
	Quando Solicitar o cadastro 
	Então A Movimentação não é salva com sucesso 

	Exemplos:
	| tipo               | categoria                          |
	| Conta a receber    | DESPESAS DE ALIMENTAÇÃO            |
	| Conta a pagar      | DESPESAS DE CARTÃO DE CRÉDITO      |
	| Conta a pagar      | DESPESAS DE CASA                   |
	| Conta a pagar      | DESPESAS DE SAÚDE                  |
	| Conta a pagar      | OUTROS                             |
	| Conta a receber    | SALÁRIO E RENDA                    |
	| Conta a pagar      | VIAGENS E LAZER                    |
