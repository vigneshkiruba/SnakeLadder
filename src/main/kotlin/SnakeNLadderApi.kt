class SnakeNLadderApi {
    fun test(position: Int, diceValue: Int) {
        SnakeNLadder()
        val gameConsole = SnakeNLadderServiceImpl()
        println(gameConsole.startGame(position, diceValue))
    }
}