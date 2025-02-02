

class Cuenta(val numCuenta: Int, var saldo: Double = 0.0) {

    fun consultarSaldo() = println("Tú saldo actual es de $saldo")

    fun recibirAbono(dinero: Double) {
        this.saldo += dinero
    }

    fun realizarPago(dinero: Double) {
        this.saldo -= dinero
    }

    override fun toString(): String {
        return "Cuenta: Numero de Cuenta: $numCuenta | Saldo: $saldo"
    }
}