package BasicQ20;

public class AddDigits258 {
    public static void main(String[] args) {
        AddDigits258 addDigits258 = new AddDigits258();
        System.out.println(addDigits258.addDigits(38));
    }

    public int addDigits(int num) {
        return num == 0 ? 0 : 1 + (num - 1) % 9;
    }
}
