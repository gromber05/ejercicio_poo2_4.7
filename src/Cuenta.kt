

class Cuenta(val numCuenta: Int, val saldo: Double) {

    companion object {

        fun esMorosa(persona: Persona): Boolean {
            return persona.cuentas.find { it!= null && it.saldo < 0 } != null
        }

        fun transferencia(personaA: Persona, personaB: Persona, id1: Int, id2: Int, cantidad: Double): Boolean {

            if (personaA.cuentas[id1] == null || personaB.cuentas[id2] == null) {
                println("Alguna de las cuentas introducidas no fue encontrada")
                return false
            }

            personaA.cuentas[id1]?.saldo ?: 0 - cantidad
            personaB.cuentas[id2]?.saldo ?: 0 - cantidad
            return true
        }
    }

    fun consultarSaldo() = println("Tú saldo actual es de $saldo")

    fun recibirAbono(dinero: Double) = saldo + dinero

    fun realizarPago(dinero: Double) = saldo - dinero


}