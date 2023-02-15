import kotlin.system.measureTimeMillis

fun main(args: Array<String> ) {

    try {
        val problem: IEulerProblem = Class.forName("Problem" + args[0] ).newInstance() as IEulerProblem
        val solvingDuration: Long = measureTimeMillis {
            System.out.println( "Problem: ${args[0]}, solution = ${ problem.solve( Integer.parseInt( args[1] ) ) }." )
        }
        System.out.println("Solving took $solvingDuration ms.")
    }
    catch ( e: ClassNotFoundException ) {
        System.out.println("No solution for problem ${args[0]} implemented.")
    }

}
