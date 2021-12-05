import scala.math._

var xn1: Float = 0
var xn: Float = 1
var i = 1

def calcularRaiz(): Float = {
  var fx: Float = pow(xn, 2).toFloat - sqrt(10).toFloat
  var derivadafx: Float = 2 * xn
  var formula: Float = xn - (fx / derivadafx)
  println("Iteracion #" + i + " = " + xn)

  xn = formula
  if (xn1 == xn) return xn
  xn1 = xn.toFloat
  i += 1
  calcularRaiz()
}

var resultado = calcularRaiz()
println("Resultado Raiz = " + resultado)
