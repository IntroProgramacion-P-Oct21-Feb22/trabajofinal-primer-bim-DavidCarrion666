yarda = 0
pulgada = 0
pies = 0
metros = 0

metros_ingresados = (int(input("Ingrese la medida en metros")))

while metros < metros_ingresados:
    metros = metros + 1
    yarda = metros * 1.094
    pulgada = metros * 39.37
    pies = metros * 3.281

    print("metros=%s\t\t yardas=%.2f\t\t pulgadas=%.2f\t\t pies=%.2f\n" %(metros, yarda, pulgada, pies))




