

class Persona(val DNI: String) {

    var cuentas: Array<Cuenta?> = Array(3) { null }

    fun esMorosa(persona: Persona): Boolean {
        return persona.cuentas.find { it!= null && it.saldo < 0 } != null
    }

    fun transferencia(personaA: Persona, personaB: Persona, id1: Int, id2: Int, cantidad: Double): Boolean {

        var cuenta1: Cuenta? = null
        var cuenta2: Cuenta? = null

        for (cuenta in personaA.cuentas) {
            if (cuenta?.numCuenta == id1) {
                cuenta1 = cuenta
            }
        }

        for (cuenta in personaB.cuentas) {
            if (cuenta?.numCuenta == id2) {
                cuenta2 = cuenta
            }
        }

        if (cuenta1 == null || cuenta2 == null) {
            println("Alguna de las cuentas introducidas no fue encontrada")
            return false
        }

        cuenta1.saldo - cantidad
        cuenta2.saldo + cantidad
        println("Transferencia exitosa")
        return true
    }


    fun agregarCuenta(cuenta: Cuenta) {

        if (cuentas.contains(cuenta)) {
            println("Esta cuenta ya ha sido introducida")
            return
        }

        for (index in cuentas.indices) {
            if (cuentas[index] == null) {
                cuentas[index] = cuenta
                println("Cuenta agregada correctamente")
                return
            }
        }

        println("No se ha podido agregar la cuenta")
    }

    override fun toString(): String {
        val cuentasInfo = cuentas.filterNotNull().joinToString(", ") { "NumCuenta: ${it.numCuenta}, Saldo: ${it.saldo}" }
        return "Persona DNI: $DNI, Cuentas: [$cuentasInfo]"
    }
}