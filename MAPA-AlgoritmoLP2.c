#include<stdio.h>
#include<stdlib.h>
#include<strings.h>
#include<locale.h>
#define TAM 5

struct cliente
{
	int codigo;
	char nome[50];
	char telefone[20];
	char email[30];
};
int main()
{
	setlocale(LC_ALL, "Portuguese");
	struct cliente cadastro[TAM];
	int op, i, cont=1;
	do{
		printf("\n________________AGENDA VERSÃ0 BETA________________\n");
		printf("\n MENU:\n 1-Inserir um novo cadastro;    \n 2-Mostrar todos os cadastros;   \n 0-Encerrar o programa. \n\n");
		printf("Digite a opção desejada: \n\n ");
		scanf("%d", &op);
		fflush(stdin);
	system("cls");
	switch(op){
		case 1:
			if(cont<=5){
			printf("\n________________CADASTRO________________\n\n");
			printf("\tCódigo: %d", cont);
			printf("\n\tDigite o nome do cliente: ");
			gets(cadastro[cont].nome);
			fflush(stdin);
			printf("\tDigite o telefone: ");
			gets(cadastro[cont].telefone);
			fflush(stdin);
			printf("\tDigite o e-mail: ");
			gets(cadastro[cont].email);
			fflush(stdin);
			printf("\n\n\tCadastro Realizado com Sucesso   \n\n\n");
		cont++;
	system("Pause");
	system("cls");
	}else{
		printf("\n\n\tAGENDA LOTADA!  \n\n");
	system("Pause");
	system("cls");
	}
	break;
		case 2:
			if(cont==1){
			printf("\n\n\tAGENDA VAZIA!   \n\n");
	system("Pause");
	system("cls");
	}else{
	system("cls");
		printf("\n________________CLIENTES CADASTRADOS________________\n\n");
			for(i=1; i<cont; i++){
			printf("      Código: %d\n", i);
			printf("      Nome: %s\n", cadastro[i].nome);
			printf("      Telefone: %s\n", cadastro[i].telefone);
			printf("      E-mail: %s\n\n", cadastro[i].email);
	}
	system("Pause");
	system("cls");
	}
	break;
		case 0:
			printf("\n\n\tPROGRAMA ENCERRADO    \n\n");
	break;
	default:
		printf("\n\n\tERRO: Opção Inválida!             \n\n");
	system("Pause");
	system("cls");
	}
	} while(op!=0);
	return(0);
}



