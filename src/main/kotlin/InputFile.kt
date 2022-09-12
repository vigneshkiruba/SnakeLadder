import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader
import java.util.*

internal object Solution {
    @JvmStatic
    fun main(args: Array<String>) {
        val input = FastReader()
        val tc = input.nextLong()
        for (i in 0 until tc) {
            val position = input.nextInt()
            val diceValue = input.nextInt()

            val callApi = SnakeNLadderApi()
            callApi.test(position, diceValue)
        }
    }

    internal class FastReader {
        var br: BufferedReader = BufferedReader(InputStreamReader(System.`in`))
        var st: StringTokenizer? = null

        operator fun next(): String {
            while (st == null || !st!!.hasMoreElements()) {
                try {
                    st = StringTokenizer(br.readLine())
                } catch (e: IOException) {
                    e.printStackTrace()
                }
            }
            return st!!.nextToken()
        }

        fun nextInt(): Int {
            return next().toInt()
        }

        fun nextLong(): Long {
            return next().toLong()
        }

        fun nextDouble(): Double {
            return next().toDouble()
        }

        fun nextLine(): String {
            var str = ""
            try {
                str = br.readLine()
            } catch (e: IOException) {
                e.printStackTrace()
            }
            return str
        }
    }
}
