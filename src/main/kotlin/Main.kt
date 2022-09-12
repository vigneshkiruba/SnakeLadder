fun main(args: Array<String>) {
    println("Welcome to Snake And Ladder problem!")
    SnakeNLadder()
    val gameConsole = SnakeNLadderServiceImpl()
    gameConsole.startGame(97,3)
}
