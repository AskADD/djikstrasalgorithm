import java.util.ArrayList;

public class Djikstra{
    public static void main(String[] args) {
		
        StdOut.print("Enter an input file => ");
        String inputFile = StdIn.readLine();
        StdIn.setFile(inputFile);
        int n = StdIn.readInt();
        int[][] nodes = new int[n][n];
        int [][] weights = new int[n][n];
        int count = 0;
        for(int i =0; i<n; i++){
            count = 0;
            while(StdIn.readInt() != '\n'){
                nodes[i][count] = StdIn.readInt();
                StdOut.print(nodes[i][count]);
                count++;
            }
            
        }

    }

