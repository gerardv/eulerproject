class Problem2 : IEulerProblem {
    override fun solve( parameter: Int ): Int {
        var result = 0
        var fibonacciElement = 1
        var previousFibonacciElement = 1

        while ( fibonacciElement < parameter ) {
            if ( fibonacciElement % 2 == 0 ) result += fibonacciElement
            val currentFibonacciElement = fibonacciElement
            fibonacciElement = fibonacciElement + previousFibonacciElement
            previousFibonacciElement = currentFibonacciElement
        }

        return result
    }
}
