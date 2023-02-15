import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream
import kotlin.test.assertEquals

class Problem2Tests {
    @ParameterizedTest(name = "given \"{0}\", when running the problem solution, then it should return {1}")
    @MethodSource("problem1Arguments")
    fun `given input when solving it should produce the supplied expectation`(
        input: Int,
        expected: Int
    ) {
        val actual: Int = Problem2().solve( input )

        assertEquals(expected, actual)
    }

    private companion object {
        @JvmStatic
        private fun problem1Arguments() = Stream.of(
            Arguments.of( 10, 10 ),
            Arguments.of( 20, 10 ),
            Arguments.of( 40, 44 )
        )
    }
}
