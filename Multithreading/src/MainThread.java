public class MainThread {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
            Thread.sleep(1000);
        }
        for (char c = 'A'; c <= 'E'; c++) {
            System.out.print(c + " ");
            Thread.sleep(2000);
        }
    }
}