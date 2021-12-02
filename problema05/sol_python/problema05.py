valor_x = float(input("Ingrese el valor de x"))
valor_y = float(input("Ingrese el valor de y"))

coordenadas = valor_x, valor_y

if valor_x > 0 and valor_y > 0:
    cuadrante = "cuandrante I"
else:
    if valor_x < 0 and valor_y > 0:
        cuadrante = "cuadrante II"
    else:
        if valor_x < 0 and valor_y < 0:
            cuadrante = "cuadrante III"
        else:
            if valor_x > 0 and valor_y < 0:
                cuadrante = "cuadrante IV"

print("Las coordenadas ingresadas son %s\nEstan ubicadas en el cuadrate %s\n"
      %(coordenadas, cuadrante))
