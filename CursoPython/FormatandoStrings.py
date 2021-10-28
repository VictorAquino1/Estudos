"""
Manipulando Strings - Aula 6
* String indices
* Fatiamento de string [inicio:fim:passo]
* Funções built-in len, abs, type, print etc...
Essas funções podem ser usadas diretamente em cada tipo
"""
#positivos  [012345678]
texto      ='Python s2'
#negativos  -[987654321]
print(texto[0:6])

# : comando para indicar a range
# :: pular caracter

print(len(texto))
for letra in texto:
    print(letra)