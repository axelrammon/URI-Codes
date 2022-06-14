N = int(input())
N = N+1
fatorial = 1

if N > 0 and N < 13:
	for x in range(1,N):
		fatorial = fatorial * x

print(fatorial)