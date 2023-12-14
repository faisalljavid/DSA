package LinearSearch;

public class MaxWealth {
    public static void main(String[] args) {

    }

    static int maximumWealth(int[][] accounts) {
        // person = row
        // account = col
        int ans = Integer.MIN_VALUE;
        for (int person = 0; person < accounts.length; person++) {
            // when you start a new col, take a new sum for that row
            int sum = 0;
            for (int accnt = 0; accnt < accounts[person].length; accnt++) {
                sum += accounts[person][accnt];
            }
            // now we have sum of accounts of person
            if(sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }
}
