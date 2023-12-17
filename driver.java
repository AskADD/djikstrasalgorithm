import java.util.ArrayList;
import java.lang.Math;

public class driver{
    public static void main(String[] args) {
        
        //StdOut.print("Enter an input file => ");
        String inputFile = "input1.txt";//StdIn.readLine();
        StdIn.setFile(inputFile);
        int n = StdIn.readInt();
        System.out.println(n);
        int[][] nodes = new int[n][n];
        int [][] weights = new int[n][n];
        int shortestDistance[] = new int[n];
        int parentNode[] = new int[n];
        for(int i = 0; i<shortestDistance.length;i++){
                shortestDistance[i] = 1000000000;
        }
        shortestDistance[0] = 0;
        int count = 0;
        int lines = n;
        for(int i =0; i<lines; i++){
            count = 0;
//            System.out.println(i);
            nodes[i][count] = StdIn.readInt();
            StdOut.print(nodes[i][count] + " ");
            n = StdIn.readInt();
            count = 0;
            while(count<n){
                
                nodes[i][count+1] = StdIn.readInt();
                StdOut.print(nodes[i][count] + " ");
             //  System.out.println("H: " + a);
                count++;
            }
            StdOut.print("\n");

            
        }


        for(int i =0; i<lines; i++){
            count = 0;
//            System.out.println(i);
            weights[i][count] = StdIn.readInt();
            StdOut.print(weights[i][count] + " ");
            n = StdIn.readInt();
            count = 0;
            while(count<n){
                
                weights[i][count+1] = StdIn.readInt();
                StdOut.print(weights[i][count] + " ");
             //  System.out.println("H: " + a);
                count++;
            }
            StdOut.print("\n");

            
        }

        System.out.println("--------");
        for(int i = 0; i<10; i++){
            for(int l = 0; l<10; l++){
            System.out.print(nodes[i][l] + " ");}
            System.out.println();
        }
        for(int i = 0; i<10; i++){
            for(int l = 0; l<10; l++){
            System.out.print(weights[i][l] + " ");}
            System.out.println();
        }

        //Djikstra's Algorithm
        int currentNode = nodes[0][0]; 
        n = 0; 
        int i = 0;      
        while(i<shortestDistance.length){
            n = 0;
            currentNode = nodes[i][n+1];
            while(currentNode != 0){
                
                
                System.out.print(currentNode + "::");
                if((shortestDistance[i] + weights[i][n+1])<shortestDistance[currentNode-1]){
                    shortestDistance[currentNode-1] = shortestDistance[i] + weights[i][n+1];
                    parentNode[currentNode-1] = (i+1);
                     if((currentNode-1)<i){
                        System.out.println("ISSUE1: " + (i+1));
                        i = currentNode-2;
                        System.out.println("ISSUE:" + (i+2));
                        break;
                    }
                }
                
                n = n+1;
                System.out.println(currentNode + " : " + shortestDistance[currentNode-1]);
                currentNode = nodes[i][n+1];
            }

            ///PRINT ITERATION
            System.out.println("Iteration: Parent Node: " + (i+1) );
            for(int x = 0; x<shortestDistance.length; x++){
                System.out.print(shortestDistance[x] + " ");

            }
            System.out.println("");

            i++;
        }
            for(int x = 0; x<parentNode.length; x++){
                System.out.print(parentNode[x] +" ");
            }
            System.out.println("Next line showes the shortest path");
            System.out.println(" Shortest Path  Cost:" + shortestDistance[parentNode.length-1]);
            int index = parentNode.length-1;
            System.out.print((index+1) + " ");
            System.out.print(parentNode[index] + " ");
            while(parentNode[index-1] != 0){
                System.out.print(parentNode[index-1] +" ");
                index = parentNode[index-1];
            }
            
        }
}


