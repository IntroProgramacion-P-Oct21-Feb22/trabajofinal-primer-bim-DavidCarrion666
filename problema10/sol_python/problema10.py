contador = 0
entrada_datos = 0
numero = 0
media = 0
variedad = 0
contador1 = 0
bandera = True
dato = 0
numero_comparacion = 0


while bandera:
    entrada_datos = (float(input("ingrese los datos requeridos")))
    contador = contador + 1

    if entrada_datos != numero_comparacion:
        contador1 = contador1 + 1
    else:
        contador1 = contador1 + 0

    dato = dato + entrada_datos

    flush = True
    salida = (str(input("Ingrese si para salir del proceso")))

    if salida == "si":
        bandera = False


media = dato / contador
print("la media es %s\n" %(media))
print("la variedad de datos es %s\n" %(contador1))