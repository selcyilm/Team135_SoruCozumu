package Bekir;

import java.util.Scanner;

public class CalculateDailyRate {
        /*49-----
Fazla mesaiyi hesaplayan bir program yazınız.
Yazacağınız program toplam kazancı return etsin.

Kullanıcıdan saatlik çalışma ücretini, hangi
saatler arasında çalıştığını ve
fazla mesaiye kalırsa kazancını kaç ile
katlayacağını alalım.

Daha sonra şu şekilde bir program yazınız :

Örnek :
saatlik çalışma ücreti : 40.0
hangi saat başladı : 9.0
hangi saat bitti : 20.0
mesaiyi kaçla katlayacağız : 1.8

ucretHesapla(9.0,20.0,40.0,1.8);

9 ile 17 arasında toplam çalışma 8 saat
olduğu için 8 x 40 = 320
17 ile 20 arasında toplam çalışma 3 saat
olduğu için 3 x 40 x 1.8 =  216

toplam = 536.0
*/

    static double hourlyRate;
    static  double startTime;
    static double endTime;
    static double overTimePay;
    static double payForDailyWork;
    static double normalTime;
    static  double overTime;
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);


            System.out.println("Calculate  the daily rate:");
            System.out.println("Please enter your pay information:");
            System.out.print("Hourly rate: ");
            hourlyRate = scanner.nextDouble();
            System.out.print("Start time: ");
            startTime = scanner.nextDouble();
            System.out.print("End time: ");
            endTime = scanner.nextDouble();
            System.out.print("Over time pay: ");
            overTimePay = scanner.nextDouble();

            payForDailyWork = dailyRate(startTime, endTime, hourlyRate, overTimePay);
            normalTime = normalTime(startTime,endTime);
            overTime = overTime(startTime, endTime);

            System.out.printf("Pay for normal time ( 9 - 17 o'clock) %.2f hours x %.2f = %.2f \n", normalTime, hourlyRate, normalTime * hourlyRate);
            System.out.printf("Pay for over Time (before 9 o'clock or after 17 o'clock) %.2f hours x %.2f x %.2f = %.2f\n", overTime, hourlyRate,overTimePay, overTime(startTime, endTime) * hourlyRate *overTimePay);
            System.out.printf("Pay for daily work ( Start time - End time) : %.2f", payForDailyWork);

        }

        static double normalTime(double startTime, double endTime){
            double normalTime = endTime - startTime - overTime(startTime, endTime);// (20-9) - overtime
            return normalTime;


        }
        static double overTime(double startTime, double endTime){
            double overTime1 = 0.0; // before 9 o'clock
            double overTime2 = 0.0; // after 17 o'clock
            if(startTime < 9){
                overTime1 = 9-startTime;
            }
            if (endTime > 17){
                overTime2 = endTime - 17;
            }
            double overTime = overTime1 + overTime2;
            return  overTime;

        }

        static double dailyRate(double startTime, double endTime, double hourlyRate, double overTimePay){
            double payForNormalTime = normalTime(startTime, endTime) * hourlyRate;
            double payForOvertime = overTime(startTime, endTime) * hourlyRate * overTimePay;
            double dailyRate = payForNormalTime + payForOvertime;
            return dailyRate;

        }
}
