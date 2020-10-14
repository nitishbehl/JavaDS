

//https:leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/
public class excludingSalary {
    public static double average(int[] salary) {
        double min = salary[1];
        double max = 0.000;
        for (int i = 0; i < salary.length; i++) {
            if (salary[i] < min) {
                min = salary[i];
            } else if (salary[i] > max) {
                max = salary[i];
            }
        }
        double sum = 0.000;
        for (int i = 0; i < salary.length; i++) {
            sum = sum + salary[i];
        }
        double average = (sum - max - min) / (salary.length - 2); // 4000 +3000+ 2000 +1000 -4000 -1000 /2 =2500
        return average;
    }

    public static void main(String[] args) {
        int[] salary = {48000, 59000, 99000, 13000, 78000, 45000, 31000, 17000, 39000, 37000, 93000, 77000, 33000, 28000, 4000, 54000, 67000, 6000, 1000, 11000};
        System.out.println(average(salary));

    }
}
