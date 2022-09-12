import SnakeNLadder.Companion.WINPOINT
import SnakeNLadder.Companion.ladder
import SnakeNLadder.Companion.snake

class SnakeNLadderServiceImpl : SnakeNLadderService {
    override fun calculatePlayerPosition(initialPosition: Int, diceValue: Int): Int {
        var changedPosition = initialPosition
        changedPosition += diceValue
        if (changedPosition > WINPOINT) {
            changedPosition -= diceValue
            return changedPosition
        }
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

    override fun startGame(initialPosition: Int, diceValue: Int) {
        val finalPosition: Int = calculatePlayerPosition(initialPosition, diceValue)
        if (isWin(finalPosition)) {
            println("Yay!! You won!!")
            return
        } else {
            println("Position $finalPosition")
        }
    }
}