public class task5 {
    public static void main(String[] args) {
        int[] nums = new int[12];
        for (int i = 0; i < nums.length; i++) {
            double a = Math.random() * 30 - 15 ;
            nums[i] = (int) a;
        }
        for (int items: nums
             ) {
            System.out.println(items);
        }
        System.out.println();
        int max = 0;
        int maxind = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]>max){
                max = nums[i];
                maxind = i;
            }
        }
        System.out.println(maxind);
    }
}
