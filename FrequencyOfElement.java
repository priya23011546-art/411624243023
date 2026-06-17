public class FrequencyOfElement{
    public static void main(String[] args) {
        int arr[] = {5, 2, 9, 1, 5, 6};
        int frequency[] = new int[arr.length];
        boolean visited[] = new boolean[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (visited[i]) {
                continue;
            }
            frequency[i] = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    frequency[i]++;
                    visited[j] = true;
                }
            }
        }

        System.out.println("Element | Frequency");
        for (int i = 0; i < arr.length; i++) {
            if (!visited[i]) {
                System.out.println(arr[i] + "       | " + frequency[i]);
            }
        }
    }
    
}
