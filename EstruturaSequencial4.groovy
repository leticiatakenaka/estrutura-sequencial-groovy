package EstruturaSequencial
//Fa�a um Programa que pe�a as 4 notas bimestrais e mostre a m�dia.
def a,b,c,d
println"Digite a primeira nota: "
a = System.console().readLine().toInteger()
println"Digite a segunda nota: "
b = System.console().readLine().toInteger()
println"Digite a terceira nota: "
c = System.console().readLine().toInteger()
println"Digite a quarta nota: "
d = System.console().readLine().toInteger()
println"A m�dia � "+((a+b+c+d)/4)