numeros = input().split(" ")

A = int(numeros[0])
B = int(numeros[1])

if B % A == 0 or A % B == 0:
	print("Sao Multiplos")
else:
	print("Nao sao Multiplos")
