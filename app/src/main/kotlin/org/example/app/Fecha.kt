package org.example.app
class Fecha (private var anio: String = "", private var mes: String = "", private var dia: Int = 0) {
override fun toString(): String {
    return "clase(anio=$anio, mes=$mes, dia=$dia)"
}
}
