N = int(input())
medias = []
for x in range(0,N):
	notas = input().split(" ")
		
	n1 = float(notas[0])
	n2 = float(notas[1])
	n3 = float(notas[2])

	medias.append( ((n1*2)+(n2*3)+(n3*5))/10 )

for i in range(0,len(medias)):
	print("{0:.1f}".format(medias[i]))