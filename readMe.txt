The algorithm is run through java driver >> output.txt
Edit input1.txt with:
first number is number of nodes in the map
Each row corresponds to a parent node and the parent node' children
The first column corresponds to the parent column
Second column will always refer to the number child nodes
After the first rows are filled, a second array should be prepared in a similar manner, 
Except instead of the parent node, child node pair, the distance between the two nodes should
be inputed

For example if we have [1 2 3 5] as one row, this means that node 1 has 2 children, 3 and 5
The corresponding row [1 2 5 12], link 1-3 has a weight of 5 and 1-5 has a weight of 12
