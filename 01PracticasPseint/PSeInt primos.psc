Algoritmo NumerosPrimos
	Escribir "Ingrese un numero"
	num1 <-0
	Leer num1 
	N<-0
	Para b<-1 Hasta num1 Con Paso 1 Hacer
		Si num1/num1==1 y num1 MOD b==0 Entonces
			N<-N+2
		Fin Si
	Fin Para
	Si N=4 Entonces
		Escribir num1 " Es numero primo"
	SiNo
		Escribir num1 " No es numero primo"
	Fin Si
FinAlgoritmo
