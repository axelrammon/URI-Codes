X = int(input())
Y = int(input())

soma = 0

if X > Y:
	for i in range(Y,X):
		if i % 2 != 0:
			soma = soma + i
else:
	for i in range(X,Y):
		if i % 2 != 0:
			soma = soma + i

print(soma)