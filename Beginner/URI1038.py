numeros = input().split(" ")

codigo = float(numeros[0])
quantidade = float(numeros[1])
preco = 0

if codigo == 1:
	preco = 4.00
elif codigo == 2:
	preco = 4.50
elif codigo == 3:
	preco = 5.00
elif codigo == 4:
	preco = 2.00
elif codigo == 5:
	preco = 1.50

total = preco * quantidade

print("Total: R$ " + "%.2f" % total)