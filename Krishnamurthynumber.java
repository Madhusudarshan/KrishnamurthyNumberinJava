class isKrishnamurthynumber{
    static String isKrishnamurthy(int N) {
        // code here
        int m = N;
        int fact = 1;
        int sum = 0;
        while (N > 0) {
            int rem = N % 10;
            for (int i = rem; i >= 2; i--) {
                fact = fact * i;
            }
            sum = sum + fact;
            N /= 10;
            fact = 1;
        }
        if (m == sum) {
            return "YES";
        }
        return "NO";
    }
};
