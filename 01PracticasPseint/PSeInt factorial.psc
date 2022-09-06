Algoritmo factorial
	definir num1, a, b como entero 
	Escribir "Introdusca un número"
	Leer num1
	Si num1<0 Entonces
		Escribir error
	SiNo
		a=1
		b=1
		Mientras a<=num1 Hacer
			b=b*a
			a=a+1
		Fin Mientras
		Escribir b " es el factorial de ", num1
	Fin si
FinAlgoritmo
