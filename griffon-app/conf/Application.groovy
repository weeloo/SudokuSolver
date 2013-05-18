application {
    title = 'SudokuSolver'
    startupGroups = ['sudokuSolver']

    // Should Griffon exit when no Griffon created frames are showing?
    autoShutdown = true

    // If you want some non-standard application class, apply it here
    //frameClass = 'javax.swing.JFrame'
}
mvcGroups {
    // MVC Group for "sudokuSolver"
    'sudokuSolver' {
        model      = 'sudokusolver.SudokuSolverModel'
        view       = 'sudokusolver.SudokuSolverView'
        controller = 'sudokusolver.SudokuSolverController'
    }

}
