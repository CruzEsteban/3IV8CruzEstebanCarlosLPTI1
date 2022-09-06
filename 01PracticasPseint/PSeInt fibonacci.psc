Algoritmo SerieDeFibonacci
	Escribir "Ingrese un nímero"
	Leer num1
	a<-0
	b<-0
	c<-1
	Para d<-1 Hasta num1 Con Paso 1 Hacer
		Escribir a
		a<-b+c
		c<-b
		b<-a		
	Fin Para
Fin algoritmo
