N = int(input())

for x in range(1, (N * 4) + 1):
	if x%4 == 0:
		print("PUM")
	else :
		print(x, end=" ")