interface SnakeNLadderService {
    fun calculatePlayerPosition(initialPosition: Int, diceValue: Int): Int
    fun isWin(player: Int): Boolean
    fun startGame(initialPosition: Int, diceValue: Int): String
}