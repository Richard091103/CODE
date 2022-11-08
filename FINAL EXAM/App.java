import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);  

        // Print the words in their given pattern.

        char[][] array = {
                            // 1    2    3    4    5    6    7    8    9    10
                            { 'R', 'E', 'I', 'M', 'A', 'E', 'R', 'S', 'G', 'T' }, // 1
                            { 'E', 'V', 'D', 'B', 'D', 'V', 'I', 'A', 'B', 'I' }, // 2
                            { 'E', 'L', 'R', 'O', 'F', 'S', 'A', 'W', 'U', 'K' }, // 3
                            { 'B', 'G', 'C', 'E', 'I', 'L', 'C', 'J', 'H', 'T' }, // 4
                            { 'S', 'S', 'K', 'G', 'D', 'Z', 'H', 'S', 'T', 'O' }, // 5
                            { 'V', 'M', 'J', 'A', 'V', 'H', 'Z', 'S', 'I', 'K' }, // 6
                            { 'C', 'H', 'I', 'L', 'L', 'T', 'O', 'P', 'G', 'M' }, // 7
                            { 'Y', 'S', 'P', 'I', 'T', 'A', 'P', 'R', 'W', 'D' }, // 8
                            { 'G', 'B', 'D', 'S', 'T', 'K', 'P', 'W', 'S', 'O' }, // 9
                            { 'G', 'T', 'L', 'H', 'Q', 'X', 'Q', 'L', 'O', 'E' }, // 10
                        };

        // =============================================================
        // ALAK - (10 points)
        System.out.println(" ");
        System.out.println("1. ALAK ");
        
        for (int row = 0; row < 10; row++) {
            System.out.println("");
            for (int column = 0; column < 10; column++) {
                if (row == 4 && (column == 2 || column == 2)) {
                    System.out.print(array[row][column]);
                }
                else if (row == 5 && (column == 3 || column == 3)) {
                    System.out.print(array[row][column]);
                }
                else if (row == 6 && (column == 4 || column == 4)) {
                    System.out.print(array[row][column]);
                }
                else if (row == 7 && (column == 5 || column == 5)) {
                    System.out.print(array[row][column]);
                }
                else{
                    System.out.print(" ");
                }
            }
        }

        // =============================================================
        // GITHUB - (10 points)
        System.out.println(" ");
        System.out.println("2. GITHUB ");
        
        for (int row = 0; row < 10; row++) {
            System.out.println("");
            for (int column = 0; column < 10; column++) {
                if (row == 1 && (column == 8 || column == 8)) {
                    System.out.print(array[row][column]);
                }
                else if (row == 2 && (column == 8 || column == 8)) {
                    System.out.print(array[row][column]);
                }
                else if (row == 3 && (column == 8 || column == 8)) {
                    System.out.print(array[row][column]);
                }
                else if (row == 4 && (column == 8 || column == 8)) {
                    System.out.print(array[row][column]);
                }
                else if (row == 5 && (column == 8 || column == 8)) {
                    System.out.print(array[row][column]);
                }
                else if (row == 6 && (column == 8 || column == 8)) {
                    System.out.print(array[row][column]);
                }
                else{
                    System.out.print(" ");
                }
            }
        }

        // =============================================================
        // SISIG - (10 points)
        System.out.println(" ");
        System.out.println("3. SISIG ");
        
        for (int row = 0; row < 10; row++) {
            System.out.println("");
            for (int column = 0; column < 10; column++) {
                if (row == 0 && (column == 7 || column == 7)) {
                    System.out.print(array[row][column]);
                }
                else if (row == 1 && (column == 6 || column == 6)) {
                    System.out.print(array[row][column]);
                }
                else if (row == 2 && (column == 5 || column == 5)) {
                    System.out.print(array[row][column]);
                }
                else if (row == 3 && (column == 4 || column == 4)) {
                    System.out.print(array[row][column]);
                }
                else if (row == 4 && (column == 3 || column == 3)) {
                    System.out.print(array[row][column]);
                }
                else{
                    System.out.print(" ");
                }
            }
        }

        // =============================================================
        // VSCODE - (10 points)
        System.out.println(" ");
        System.out.println("4. VSCODE ");
        
        for (int row = 0; row < 10; row++) {
            System.out.println("");
            for (int column = 0; column < 10; column++) {
                if (row == 0 && (column == 5 || column == 5)) {
                    System.out.print(array[row][column]);
                }
                else if (row == 1 && (column == 4 || column == 4)) {
                    System.out.print(array[row][column]);
                }
                else if (row == 2 && (column == 3 || column == 3)) {
                    System.out.print(array[row][column]);
                }
                else if (row == 3 && (column == 2 || column == 2)) {
                    System.out.print(array[row][column]);
                }
                else if (row == 4 && (column == 1 || column == 1)) {
                    System.out.print(array[row][column]);
                }
                else if (row == 5 && (column == 0 || column == 0)) {
                    System.out.print(array[row][column]);
                }
                else{
                    System.out.print(" ");
                }
            }
        }

        // =============================================================
        // BEER - (10 points)
        System.out.println(" ");
        System.out.println("5. BEER ");
        
        for (int row = 0; row < 10; row++) {
            System.out.println("");
            for (int column = 0; column < 10; column++) {
                if (row == 0 && (column == 0 || column == 0)) {
                    System.out.print(array[row][column]);
                }
                else if (row == 1 && (column == 0 || column == 0)) {
                    System.out.print(array[row][column]);
                }
                else if (row == 2 && (column == 0 || column == 0)) {
                    System.out.print(array[row][column]);
                }
                else if (row == 3 && (column == 0 || column == 0)) {
                    System.out.print(array[row][column]);
                }
                else{
                    System.out.print(" ");
                }
            }
        }

        // =============================================================
        // JAVA - (10 points)
        System.out.println(" ");
        System.out.println("6. JAVA ");
        
        for (int row = 0; row < 10; row++) {
            System.out.println("");
            for (int column = 0; column < 10; column++) {
                if (row == 0 && (column == 4 || column == 4)) {
                    System.out.print(array[row][column]);
                }
                else if (row == 1 && (column == 5 || column == 5)) {
                    System.out.print(array[row][column]);
                }
                else if (row == 2 && (column == 6 || column == 6)) {
                    System.out.print(array[row][column]);
                }
                else if (row == 3 && (column == 7 || column == 7)) {
                    System.out.print(array[row][column]);
                }
                else{
                    System.out.print(" ");
                }
            }
        }

        // =============================================================
        // TIKTOK - (10 points)
        System.out.println(" ");
        System.out.println("7. TIKTOK ");
        
        for (int row = 0; row < 10; row++) {
            System.out.println("");
            for (int column = 0; column < 10; column++) {
                if (row == 0 && (column == 9 || column == 9)) {
                    System.out.print(array[row][column]);
                }
                else if (row == 1 && (column == 9 || column == 9)) {
                    System.out.print(array[row][column]);
                }
                else if (row == 2 && (column == 9 || column == 9)) {
                    System.out.print(array[row][column]);
                }
                else if (row == 3 && (column == 9 || column == 9)) {
                    System.out.print(array[row][column]);
                }
                else if (row == 4 && (column == 9 || column == 9)) {
                    System.out.print(array[row][column]);
                }
                else if (row == 5 && (column == 9 || column == 9)) {
                    System.out.print(array[row][column]);
                }
                else{
                    System.out.print(" ");
                }
            }
        }

        // =============================================================
        // CHILLTOP - (10 points)
        System.out.println(" ");
        System.out.println("8. CHILLTOP ");
        
        for (int row = 0; row < 10; row++) {
            System.out.println("");
            for (int column = 0; column < 10; column++) {
                if (row == 6 && (column == 0 || column == 0)) {
                    System.out.print(array[row][column]);
                }
                else if (row == 6 && (column == 1 || column == 1)) {
                    System.out.print(array[row][column]);
                }
                else if (row == 6 && (column == 2 || column == 2)) {
                    System.out.print(array[row][column]);
                }
                else if (row == 6 && (column == 3 || column == 3)) {
                    System.out.print(array[row][column]);
                }
                else if (row == 6 && (column == 4 || column == 4)) {
                    System.out.print(array[row][column]);
                }
                else if (row == 6 && (column == 5 || column == 5)) {
                    System.out.print(array[row][column]);
                }
                else if (row == 6 && (column == 6 || column == 6)) {
                    System.out.print(array[row][column]);
                }
                else if (row == 6 && (column == 7 || column == 7)) {
                    System.out.print(array[row][column]);
                }
                else{
                    System.out.print(" ");
                }
            }
        }

        // =============================================================
        // REDHORSE - (10 points)
        System.out.println(" ");
        System.out.println("9. REDHORSE ");
        
        for (int row = 0; row < 10; row++) {
            System.out.println("");
            for (int column = 0; column < 10; column++) {
                if (row == 2 && (column == 2 || column == 2)) {
                    System.out.print(array[row][column]);
                }
                else if (row == 3 && (column == 3 || column == 3)) {
                    System.out.print(array[row][column]);
                }
                else if (row == 4 && (column == 4 || column == 4)) {
                    System.out.print(array[row][column]);
                }
                else if (row == 5 && (column == 5 || column == 5)) {
                    System.out.print(array[row][column]);
                }
                else if (row == 6 && (column == 6 || column == 6)) {
                    System.out.print(array[row][column]);
                }
                else if (row == 7 && (column == 7 || column == 7)) {
                    System.out.print(array[row][column]);
                }
                else if (row == 8 && (column == 8 || column == 8)) {
                    System.out.print(array[row][column]);
                }
                else if (row == 9 && (column == 9 || column == 9)) {
                    System.out.print(array[row][column]);
                }
                else{
                    System.out.print(" ");
                }
            }
        }

        // =============================================================
        // TIPSY - (10 points)
        System.out.println(" ");
        System.out.println("10. TIPSY ");
        
        for (int row = 0; row < 10; row++) {
            System.out.println("");
            for (int column = 0; column < 10; column++) {
                if (row == 7 && (column == 0 || column == 0)) {
                    System.out.print(array[row][column]);
                }
                else if (row == 7 && (column == 1 || column == 1)) {
                    System.out.print(array[row][column]);
                }
                else if (row == 7 && (column == 2 || column == 2)) {
                    System.out.print(array[row][column]);
                }
                else if (row == 7 && (column == 3 || column == 3)) {
                    System.out.print(array[row][column]);
                }
                else if (row == 7 && (column == 4 || column == 4)) {
                    System.out.print(array[row][column]);
                }
                else{
                    System.out.print(" ");
                }
            }
        }
        

        // =============================================================

        // BONUS
        // SLY starts to learn programming. The first task is drawing a fox! However, that turns out to be too hard for a beginner, so she decides to draw a snake instead.

        // A snake is a pattern on a n by m table. Denote c-th cell of r-th row as (r, c). The tail of the snake is located at (1, 1), then it's body extends to (1, m), then goes down 2 rows to (3, m), then goes left to (3, 1) and so on.

        // Your task is to draw this snake for Fox Ciel: the empty cells should be represented as dot characters ('.') and the snake cells should be filled with number signs ('#').

        // Consider sample tests in order to understand the snake pattern.
        
        
        // Input
        // The only line contains two integers: n and m (3 ≤ n, m ≤ 50).

        // n is an odd number.

        // Output
        // Output n lines. Each line should contain a string consisting of m characters. Do not output spaces.
        
        // Example
        // Input: 3 3
        
        // ###
        // ..#
        // ###
        // #..
        // ###
        
        
        // Input: 9 9
                    
        // #########
        // ........#
        // #########
        // #........
        // #########
        // ........#
        // #########
        // #........
        // #########
        
        System.out.println(" ");
        System.out.println("BONUS QUESTION");
        
        int n, m;
        
        System.out.print("Enter first number: ");
        n = scan.nextInt();
        System.out.print("Enter second number: ");
        m = scan.nextInt();

    	int flag = 0;
    	for (int i = 0; i < n; i++)
    	{
		if (i % 2 == 0)
		{
			for (int j = 0; j < m; j++)
			{
				System.out.print("#");
			}
			System.out.println();
		}
		else
		{
			if (flag % 2 == 0)
			{
				for (int j = 0; j < m; j++)
				{
					if (j == m - 1) { 
					    System.out.print("#"); 
					    break; 
					}
					else { 
					    System.out.print("."); 
					}
				}
				System.out.println();;
				flag++;
			}
			else
			{
				for (int j = 0; j < m; j++)
				{
					if (j == 0) { 
					    System.out.print("#"); 
	                    continue; 
					}
		            else 
		            System.out.print(".");
				}
				System.out.println();
				flag++;
			}
		}
	}

    }
}
