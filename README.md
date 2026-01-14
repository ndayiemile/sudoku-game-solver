# Sudoku Game Solver

This project provides a Java-based Sudoku game solver. It can read Sudoku boards from files, solve them, and display the solutions.

## Features
- Read Sudoku boards from text files
- Command-line interface for solving and displaying boards

## Files
- `Sudoku.java` - Main logic for solving Sudoku puzzles
- `SingleSudoku.java` - Handles individual Sudoku board operations
- `BoardClone.java` - Utility for cloning board states
- `*.board` - Example Sudoku board files (easy, medium, evil, test)

## Usage
1. Compile the Java files:
   ```sh
   javac *.java
   ```
2. Run the solver (example):
   ```sh
   java Sudoku easy.board
   ```
   Replace `easy.board` with any board file you want to solve.

## Board File Format
Each `.board` file should contain a 9x9 grid of numbers (0 for empty cells).

**Acknowledgement**: This project was developed as an in-class assignment.
