fun main(args: Array<String>) {
    println("Welcome to Snake And Ladder problem!")
    SnakeNLadder()
    val gameConsole = SnakeNLadderServiceImpl()
    println(gameConsole.startGame(97,2))
}
