package BasicQ20;

public class ToLowerCase709 {
    public static void main(String[] args) {
        ToLowerCase709 toLowerCase709 = new ToLowerCase709();
        System.out.println(toLowerCase709.toLowerCase("Hello"));
    }

    private String toLowerCase(String s) {
        char[] arr = s.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 'A' && arr[i] <= 'Z') {
                arr[i] = (char) (arr[i] + 32); // arr[i] += 32;
            }
        }

        return new String(arr);
    }
}
