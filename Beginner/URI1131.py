novoGrenal = 1
vInter = 0
vGremio = 0
empate = 0
totalGrenais = 0
melhor = ""

novoGrenalPrint = ("Novo grenal (1-sim 2-nao)\n")
quantidadeGrenal = 0

while novoGrenal == 1:

	placar = input().split(" ")

	inter = int(placar[0])
	gremio = int(placar[1])

	novoGrenal = int(input())

	if novoGrenal == 1 or novoGrenal == 2:
		quantidadeGrenal = quantidadeGrenal + 1

	if inter > gremio:
		vInter = vInter + 1
	elif gremio > inter:
		vGremio = vGremio + 1
	else:
		empate = empate + 1
	

	totalGrenais = totalGrenais + 1

	if vInter > vGremio:
		melhor = "Inter"
	elif vInter < vGremio:
		melhor = "Gremio"
	
novoGrenalPrint = (novoGrenalPrint * quantidadeGrenal)
print(novoGrenalPrint, end="")
print(totalGrenais, "grenais")
print("Inter:"+ str(vInter))
print("Gremio:"+str(vGremio))
print("Empates:"+str(empate))
print(melhor, "venceu mais")