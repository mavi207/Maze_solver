# Maze_solver

This project implements a maze solver using a depth-first search algorithm. It aims to find a path from the starting point to the destination in a maze represented as a 2D array.

How it Works:
The DepthFirst class contains a static method searchPath that performs the depth-first search to find a path from the starting point to the destination in the maze. The method uses recursion to explore neighboring positions and finds the path to the destination.

The NewClass class extends JFrame and represents the graphical user interface for the maze solver. It creates a 2D array maze representing the maze with walls (1), open paths (0), and the destination (9). The path list stores the x and y coordinates of the path from the start to the destination.

When you run the program, it will open a graphical window displaying the maze and the path to the destination.

How to Run:
Clone this repository to your local machine.
Ensure you have Java Development Kit (JDK) installed.
Open the project in your favorite Java IDE.
Compile and run the NewClass.java file.
The graphical window will show the maze, and the path from the start to the destination will be highlighted in blue.

Maze Representation:
The maze is represented as a 2D array where:
1 represents walls, which are not passable.
0 represents open paths.
9 represents the destination point.



![Screenshot 2023-08-07 181140](https://github.com/mavi207/Maze_solver/assets/136497987/94130991-83a4-49d9-9502-d0377d430c08)

