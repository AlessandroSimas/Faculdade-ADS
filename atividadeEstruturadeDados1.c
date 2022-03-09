#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

typedef struct NO{
    int dado;
    struct NO *prox;
}NO;

typedef struct FILA{
    NO *inicio;
    NO *fim;
}FILA;

//FILA *f;

void enfileira(int dado, FILA *f){
    NO *ptr = (NO*) malloc(sizeof(NO));
    ptr->dado = dado;
    ptr->prox = NULL;
    if(f->inicio == NULL){
    	f->inicio = ptr;
	}
    else { 
		f->fim->prox = ptr;
	}  
    f->fim = ptr;
}

int desenfileira(FILA *f){
    NO *ptr = f->inicio;
    int dado;
    if(ptr != NULL){
        f->inicio = ptr->prox;
        ptr->prox = NULL;
        dado = ptr->dado;
        free(ptr);
        return dado;
    }
}

void imprimeFila (FILA *f){
	NO *ptr = f->inicio;
	if (ptr != NULL){
		while (ptr != NULL){	
		printf ("%d  ", ptr->dado);
		ptr = ptr->prox;
		}	
	} else{
		printf ("Fila vazia.\n");
		return;
	}
}
void inicializaFila (FILA *f){
	f->inicio = NULL;
    f->fim = NULL;
}

int main(){
    FILA *f1 = (FILA*) malloc(sizeof(FILA));
    inicializaFila(f1);
    setlocale(LC_ALL, "Portuguese");
    enfileira(10, f1);
    enfileira(30, f1);
    enfileira(50, f1);
    printf("Após 3 inserções:         \n");
    imprimeFila (f1);
    desenfileira(f1);
    printf("\nApós 1 exclusão:           \n");
    imprimeFila (f1);
    printf("\n");
    system("Pause");
    enfileira(14, f1);
    system("cls");
    printf("\nFILA Final:\n");
    imprimeFila (f1);
    return;
}
