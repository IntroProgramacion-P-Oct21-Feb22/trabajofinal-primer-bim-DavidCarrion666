limite = 100
numerador = 1
denominador = 2
signo = "+"
cadena = ""

while denominador <= limite:
    cadena = ("%s %s %d/%d" %(cadena, signo, numerador, denominador))
    denominador = denominador + 1

print("1" + "" + cadena)
