#ni >= ni-1

liste = [1, 2, 3, 4, 4, 4,5  , 6, 7]

def leggTil(x):
	for i in range(len(liste)):
		if liste[i] > x:
			liste.insert(i, x)
			break
leggTil(1)

print(liste)                                                                                      
