public class Training29 {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{1,2,3,4,5,6,7,8}};

        for (int i = arr.length -1 ; i >= 0; i --){
            for (int j = arr[i].length - 1; j >= 0; j--){
                System.out.println(arr[i][j]);
            }
        }
    }
    }
