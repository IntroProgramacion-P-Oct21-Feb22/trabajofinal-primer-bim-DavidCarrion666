
anguloA = float(input("Ingrese el valor del primer angulo\n"))
anguloB = float(input("Ingrese el valor del segundo angulo\n"))
anguloC = float(input("Ingrese el valor del tercer angulo\n"))


if anguloA == 90 or anguloB == 90 or anguloC == 90:
    tipo_triangulo = "rectangulo"
else:
    if (anguloA > 90 and anguloA <= 180) or (anguloB > 90 and anguloB <= 180) or (anguloC > 90 and anguloC <= 180):
        tipo_triangulo = "obtusangulo"
    else:
        if anguloA < 90 or anguloB < 90 or anguloC < 90:
            tipo_triangulo = "Acutangulo"


print("el triangulo es tipo", tipo_triangulo)



