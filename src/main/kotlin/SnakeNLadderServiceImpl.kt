import SnakeNLadder.Companion.WINPOINT
import SnakeNLadder.Companion.ladder
import SnakeNLadder.Companion.snake

class SnakeNLadderServiceImpl : SnakeNLadderService {
    override fun calculatePlayerPosition(initialPosition: Int, diceValue: Int): Int {
        var changedPosition = initialPosition
        changedPosition += diceValue
        if (null != snake[changedPosition]) {
            println("swallowed by snake")
            changedPosition = snake[changedPosition]!!
        }
        if (null != ladder[changedPosition]) {
            println("climb up the ladder")
            changedPosition = ladder[changedPosition]!!
        }
        return changedPosition
    }

    override fun isWin(player: Int): Boolean {
        return WINPOINT == player
    }

    override fun startGame(initialPosition: Int, diceValue: Int): String {
        val output: String
        val finalPosition: Int = calculatePlayerPosition(initialPosition, diceValue)
        output = if (isWin(finalPosition)) {
            "Yay!! You won!!"
        } else if (finalPosition > 100) {
            "Position exceeds the board"
        } else {
            "Position $finalPosition"
        }
        return output
    }
}