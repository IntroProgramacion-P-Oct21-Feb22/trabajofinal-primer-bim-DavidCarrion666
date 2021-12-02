sueldo = 0
nombre_empleado = (input("Ingrese el nombre del empleado"))
tipo_empleado = float(input("Ingrese el tipo de empleado"))
numero_horas = float(input("Ingrese el numero de horas trabajadas"))
cuota = float(input("Ingrese la cuota a pagar por hora"))

if tipo_empleado == 1:
    if numero_horas > 40:
        cuota = numero_horas * 1.5 * cuota
        sueldo = cuota
    else:
        print("no alcana las horas requeridas")
else:
    if tipo_empleado == 2:
        cuota = numero_horas * 2 * cuota
        sueldo = cuota
    else:
        if tipo_empleado == 3:
            cuota = numero_horas * 2.5 * cuota
            sueldo = cuota
        else:
            if tipo_empleado == 4:
                cuota = numero_horas * 3 * cuota
                sueldo = cuota
            else:
                print("El tipo de empleado es incorecto")

print("El sueldo a pagar es de: %s\n" %(sueldo))
