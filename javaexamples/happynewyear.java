package javaexamples;

public class happynewyear {
    public static void main(String[] args) {
        int countdownSeconds = 10; // You can change this to 60 or 100 for longer countdown

        System.out.println("Countdown to Happy New Year!");

        try {
            for (int i = countdownSeconds; i >= 1; i-- ) {
                System.out.println(i + "...");
                Thread.sleep(1000); // 1000 milliseconds = 1 sec
            }
            System.out.println("🎉🎆 Happy New Year! 🎆🎉");
            }
        catch (InterruptedException e) {
            System.out.println("Countdown interrupted!");
        }
    }
}

