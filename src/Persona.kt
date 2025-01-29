

class Persona(val DNI: String, cuentas: Array<Cuenta?>) {

    var cuentas: Array<Cuenta?> = Array(3) { null }

    fun agregarCuenta(cuenta: Cuenta) {
        var cambios = 0

        if (cuentas.size + 1 !in 0..3) {
            println("No puedes agregar más de tres cuentas")
            return
        }

        if (cuenta in cuentas) {
            println("Esta cuenta ya ha sido introducida")
            return
        }

        cuentas.forEachIndexed { index, elemento ->
            if (elemento == null) {
                cuentas[index] = cuenta
                cambios++
                return@forEachIndexed
            }
        }

        if (cambios == 0) {
            println("No se ha podido ejecutar ningún cambio")
            return
        }

    }

}