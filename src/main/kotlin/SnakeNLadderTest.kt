import io.kotest.core.spec.Spec
import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.shouldBe

class SnakeNLadderTest() : BehaviorSpec() {

    override suspend fun beforeSpec(spec: Spec) {
        SnakeNLadder()
    }


    init {
        given("Reached final position") {
            val gameConsole = SnakeNLadderServiceImpl()
            gameConsole.startGame(97, 3).shouldBe("Yay!! You won!!")
        }

        given("Swallowed by snake") {
            val gameConsole = SnakeNLadderServiceImpl()
            gameConsole.startGame(97, 2).shouldBe("Position 54")
        }

        given("Climb up the ladder") {
            val gameConsole = SnakeNLadderServiceImpl()
            gameConsole.startGame(5, 6).shouldBe("Position 40")
        }

        given("Normal case") {
            val gameConsole = SnakeNLadderServiceImpl()
            gameConsole.startGame(5, 2).shouldBe("Position 7")
        }
    }
}