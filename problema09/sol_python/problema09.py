limite = 44
val1 = 12
val2 = 11
cadena = ""

while val2 <= limite:

    cadena = ((cadena + "+%s-%s " %(val1, val2)))


    val1 = val1 + 12
    val2 = val2 + 11

print (cadena)

