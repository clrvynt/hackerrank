import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class GridSearch {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int R = in.nextInt();
            int C = in.nextInt();
            String G[] = new String[R];
            for(int G_i=0; G_i < R; G_i++){
                G[G_i] = in.next();
            }
            int r = in.nextInt();
            int c = in.nextInt();
            String P[] = new String[r];
            for(int P_i=0; P_i < r; P_i++){
                P[P_i] = in.next();
            }
            
            boolean matched = false;
            for ( int i = 0 ; i < G.length; i++ ) {
                for ( int idx = G[i].indexOf(P[0]);
                       idx >= 0;
                       idx = G[i].indexOf(P[0], idx + 1)) {
                    boolean matchedAll = true;
                    for ( int j = 1; j < P.length ; j++) {
                        if ( !G[i + j].substring(idx, idx + P[j].length()).equals(P[j])) {
                            matchedAll = false;
                            break;
                        }
                    }
                    if ( matchedAll) {
                        matched = true;
                        System.out.println("YES");
                        break;
                    }
                }
            }
            if ( !matched)
                System.out.println("NO");
        }
    }
    

}
