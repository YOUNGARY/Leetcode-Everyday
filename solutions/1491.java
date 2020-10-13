class Solution {
    public double average(int[] salary) {
        int maxSalary = salary[0], minSalary = salary[0];
        int sum = 0;
        for (int i = 0; i < salary.length; i++) {
            sum += salary[i];
            if (salary[i] > maxSalary) {
                maxSalary = salary[i];
            }
            if (salary[i] < minSalary) {
                minSalary = salary[i];
            }
        }
        return (double) (sum - maxSalary - minSalary) / (salary.length - 2);
    }
}