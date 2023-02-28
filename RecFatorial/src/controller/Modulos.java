package controller;

public class Modulos {
	public int funcFatorial (int fat, int x) {

		if (fat == 1) { //condição de parada: ao chegar em 1, parar a operação para que não chege a zero, anulando todo o cálculo.
			return 1;
		} else {
			return fat * funcFatorial(fat-x, x); //se fat-x não for igual a 1, chama a função novamente.
		}
	}
}
