package devyaniPatil.ArrayExample;
/*Test 4 
Program 2 : Return count of visible trees. [15 - 20 mins, max - 30 mins]

input : {3,7,5}
output : 2

input : {3,5,11,9,10,13}
output : 4*/


class VisibleTrees {

    int countVisibleTrees(int[] heights) {
        int count = 1; 

        int maxHeight = heights[0];

        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > maxHeight) {
                count++;
                maxHeight = heights[i];
            }
        }

        return count;
    }

    public static void main(String[] args) {
        VisibleTrees visibleTrees = new VisibleTrees();
        int[] input ={3,5,11,9,10,13};
        System.out.println( visibleTrees.countVisibleTrees(input));
    }
}
