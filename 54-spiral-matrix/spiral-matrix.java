class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
        ArrayList<Integer> spiral = new ArrayList<>();
        int r = arr.length, c = arr[r-1].length;
        int topRow = 0, leftCol = 0, bottomRow = r-1, rightCol = c-1;
        int totalElements = 0;
        while (totalElements < r*c){

            // topRow - leftCOl to rightCol
            for (int j = leftCol; j <= rightCol && totalElements < r*c; j++) {
                // System.out.print (arr[topRow][j] +" ");
                spiral.add(arr[topRow][j]);
                totalElements++;
            }
            topRow++;

            // rightCol - topRow to bottomRow
            for (int i = topRow; i <= bottomRow && totalElements < r*c; i++) {
                // System.out.print (arr[i][rightCol] +" ");
                spiral.add(arr[i][rightCol]);
                totalElements++;
            }
            rightCol--;

            // bottomRow - rightCol to leftCol
            for (int j = rightCol; j >= leftCol && totalElements < r*c; j--) {
                // System.out.print (arr[bottomRow][j] +" ");
                spiral.add(arr[bottomRow][j]);
                totalElements++;
            }
            bottomRow--;

            // leftCOl - bottomRow to topRow
            for (int i = bottomRow; i >= topRow && totalElements < r*c; i--) {
                // System.out.print (arr[i][leftCol] +" ");
                spiral.add(arr[i][leftCol]);
                totalElements++;
            }
            leftCol++;
        }
        return spiral;
    }
}