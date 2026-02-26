class secondLargest {
    public static void main(String[] args) {
        int arr[] = {1000, 200, 43, 5, 6};

        int largest = arr[0];
        int secondLargest = arr[1];

        // Make sure largest and secondLargest are correct initially
        if (secondLargest > largest) {
            int temp = largest;
            largest = secondLargest;
            secondLargest = temp;
        }

        for (int i = 2; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }

        System.out.println("Second Largest: " + secondLargest);
    }
}
