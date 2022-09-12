class SnakeNLadder {
    init {
        snake[99] = 54
        snake[70] = 55
        snake[52] = 42
        snake[25] = 2
        snake[95] = 72
        ladder[6] = 25
        ladder[11] = 40
        ladder[60] = 85
        ladder[46] = 90
        ladder[17] = 69
    }

    companion object {
        const val WINPOINT = 100
        var snake: MutableMap<Int, Int> = HashMap()
        var ladder: MutableMap<Int, Int> = HashMap()
    }
}