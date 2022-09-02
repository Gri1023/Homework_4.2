public class Main {
    public static void main(String[] args) {
        int count = 0;
        int S = 0;
        int nums[] = {3,5,0,11,1};
        for (int i=0; i<=4;i++) {
            if  (nums[i] != 0) {
                S = S + nums[1];
                count = count + 1;
            }
        }

        if (count == 0)
            System.out.println (0);
        else
        System.out.println(S/count);
    }
}