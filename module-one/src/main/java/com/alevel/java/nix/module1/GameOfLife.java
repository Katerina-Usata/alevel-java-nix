package com.alevel.java.nix.module1;

public class GameOfLife
{
	public static int rows = 5;
	public static int columns = 5;

	public static void main(String[] args)
	{
		int[][] grid = {{0, 1, 0, 0, 1},
						{1, 0, 1, 0, 0},
						{1, 1, 1, 1, 1},
						{0, 1, 0, 1, 0},
						{1, 0, 1, 0, 1}
		};
		show(grid);
	}

	static void show(int[][] grid)
	{
		System.out.println("Original Generation");
		for (int i = 0; i < rows; i++)
		{
			for (int j = 0; j < columns; j++)
			{
				if (grid[i][j] == 0)
					System.out.print(".");
				else
					System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		nextGeneration(grid, rows, columns);
	}

	static void nextGeneration(int grid[][], int rows, int columns)
	{
		int[][] future = new int[rows][columns];

		for (int i = 1; i < rows - 1; i++)
		{
			for (int j = 1; j < columns - 1; j++)
			{
				int aliveNeighbours = 0;
				for (int k = -1; k <= 1; k++)
					for (int s = -1; s <= 1; s++)
						aliveNeighbours += grid[i + k][j + s];
						aliveNeighbours -= grid[i][j];
				if ((grid[i][j] == 1) && (aliveNeighbours < 2))
					future[i][j] = 0;
				else if ((grid[i][j] == 1) && (aliveNeighbours > 3))
					future[i][j] = 0;
				else if ((grid[i][j] == 0) && (aliveNeighbours == 3))
					future[i][j] = 1;
				else
					future[i][j] = grid[i][j];
			}
		}

		System.out.println("Next Generation");
		for (int i = 0; i < rows; i++)
		{
			for (int j = 0; j < columns; j++)
			{
				if (future[i][j] == 0)
					System.out.print(".");
				else
					System.out.print("*");
			}
			System.out.println();
		}
	}
}


