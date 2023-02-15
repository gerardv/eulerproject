class Problem1 : IEulerProblem {
    override fun solve( parameter: Int ): Int {
        var result = 0

        for ( i in 0 until parameter )
            if (i % 3 == 0 || i % 5 == 0) result += i

        return result
    }

}
