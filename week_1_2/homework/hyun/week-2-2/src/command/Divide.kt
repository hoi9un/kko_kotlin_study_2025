data class Divide(
    override val x: Int,
    override val y: Int
): CalcCommand(x, y) {
    override fun execute(): Int {
        return x / y
    }
}
