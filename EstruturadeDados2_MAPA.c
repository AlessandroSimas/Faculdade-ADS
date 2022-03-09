#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <string.h>
#define TAM 5

typedef struct atividade {
	char ra[10];
	char nome[30];
	char extensao[10];
	char matricula[10];
}atividade;

typedef struct fila {
	atividade dados[TAM];
	int ini;
	int fim;
}fila;

fila fila_atividade;
int op;

void enfileirar();
void desenfileirar();
void esvaziar();
void imprime();
void menu();

int main(){
setlocale(LC_ALL, "Portuguese");
	op = 1;
	//fila_atividade.ini = 0;
	//fila_atividade.fim = 0;
while (op != 0) {
	system("cls");
	imprime();
	menu();
	scanf("%d", &op);
	fflush(stdin);
switch (op) {
	case 1:
		enfileirar();
	break;
	case 2:
		desenfileirar();	
		printf("Atividade Removida\n\n" );
		system ("pause");
	break;
	case 3:
		esvaziar();
	break;	
}
}
	return(0);
}


void enfileirar(){
if (fila_atividade.fim == TAM) {
	printf("A fila de atividades está cheia.\n\n");
	system("pause");
}
else {
	printf("Digite o RA do aluno:\n");
	scanf("%s",fila_atividade.dados[fila_atividade.fim].ra);
	fflush(stdin);
	printf("Digite o Nome do arquivo:\n");
	scanf("%s", fila_atividade.dados[fila_atividade.fim].nome);
	fflush(stdin);
	printf("Digite a Extensão do arquivo:\n");
	scanf("%s",fila_atividade.dados[fila_atividade.fim].extensao);
	fflush(stdin);
	printf("Digite a Matrícula do professor:\n");
	scanf("%s",fila_atividade.dados[fila_atividade.fim].matricula);	
	fila_atividade.fim++;
}
}

void desenfileirar() {
if (fila_atividade.ini == fila_atividade.fim) {
	printf("Fila de atividades está vazia!\n\n");
	system("pause");
}
else {
int i;
	for (i = 0; i < fila_atividade.fim; i++) {
	strcpy (fila_atividade.dados[i].ra, fila_atividade.dados[i+1].ra);
	strcpy (fila_atividade.dados[i].nome, fila_atividade.dados[i+1].nome);
	strcpy (fila_atividade.dados[i].extensao, fila_atividade.dados[i+1].extensao);
	strcpy (fila_atividade.dados[i].matricula, fila_atividade.dados[i+1].matricula);
}
/*strcpy (fila_atividade.dados[fila_atividade.fim-1].ra, "  " );
strcpy (fila_atividade.dados[fila_atividade.fim-1].nome, "");
strcpy (fila_atividade.dados[fila_atividade.fim-1].extensao, "");
strcpy (fila_atividade.dados[fila_atividade.fim-1].matricula, "");*/
fila_atividade.fim--;
	return  strcpy (fila_atividade.dados[fila_atividade.fim-1].matricula, "");
}
}

void imprime() {
int i;
printf("[________________Início____________\n");
for (i = 0; i< fila_atividade.fim; i++) {
printf("RA: %s ", fila_atividade.dados[i].ra);
printf("NOME: %s ", fila_atividade.dados[i].nome);
printf("EXTENSÃO: %s ", fila_atividade.dados[i].extensao);
printf("MATRÍCULA: %s\n", fila_atividade.dados[i].matricula);
}
printf("________________Fim________________]\n\n");
}

void menu() {
	printf("\n________________FILA DE ATIVIDADES PARA CORREÇÃO________________\n");
		printf("\n MENU:\n 1-Inserir um elemento na fila;    \n 2-Remover um elemento da fila;    \n 3-Esvaziar a fila    \n 0-Encerrar o programa. \n\n");
		printf("Digite a opção desejada: \n\n ");
}

void esvaziar(){
	fila_atividade.fim = 0;
	if (fila_atividade.ini == fila_atividade.fim ){
		printf ("\n Fila Vazia !\n\n" );
		system("pause");
	} 
		
}

