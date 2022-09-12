class SnakeNLadderApi {
    fun test(a: Int, b: Int) {
        SnakeNLadder()
        val gameConsole = SnakeNLadderServiceImpl()
        println(gameConsole.startGame(a, b))
    }
}