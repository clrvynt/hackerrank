
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CavityMap {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String grid[] = new String[n];
		for(int grid_i=0; grid_i < n; grid_i++){
			grid[grid_i] = in.next();
		}

		System.out.println(grid[0]);
		for ( int i = 1 ; i < n - 1 ; i++ ) {
			String aString = grid[i];
			StringBuilder s = new StringBuilder();
			s.append(aString.substring(0, 1));
			for ( int j = 1; j < aString.length() - 1 ; j++) {

				String curr = aString.substring(j, j+1);
				int depth = Integer.parseInt(curr);
				int leftDepth = Integer.parseInt(aString.substring(j-1, j));
				int rightDepth = Integer.parseInt(aString.substring(j+1, j+2));
				int topDepth = Integer.parseInt(grid[i-1].substring(j, j+1));
				int bottomDepth = Integer.parseInt(grid[i+1].substring(j, j+1));

				if ( depth > leftDepth && depth > rightDepth && depth > topDepth && depth > bottomDepth) {
					s.append("X");
				}
				else 
					s.append(curr);

			}
			s.append(aString.substring(aString.length() -1 , aString.length()));
			System.out.println(s.toString());
		}
		// If n == 1, we've already printed first line
				if ( n > 1) 
					System.out.println(grid[n-1]);
	}
}
