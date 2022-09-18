public class recurssion {
        public static void main(String[] args) {
        int x = sum(3);
        System.out.println(x);
    }
    private static int sum(int i) {
        if(i>0){
            return i + sum(i-1);
        }
        else
        return 0;
    }
    }

