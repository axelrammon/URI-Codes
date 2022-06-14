numeros = input().split(" ")

a = int(numeros[0])
b = int(numeros[1])
c = int(numeros[2])

maior = 0
meio = 0
menor = 0

if a > b and a > c and b > c:
	maior = a
	meio = b
	menor = c
elif a > b and a > c and c > b:
	maior = a
	meio = c
	menor = b
elif b > a and b > c and a > c:
	maior = b
	meio = a
	menor = c
elif b > a and b > c and c > a:
	maior = b
	meio = c
	menor = a
elif c > b and c > a and a > b:
	maior = c
	meio = a
	menor = b
elif c > a and c > b and b > a:
	maior = c
	meio = b
	menor = a

print(menor)
print(meio)
print(maior)
print()
print(a)
print(b)
print(c)