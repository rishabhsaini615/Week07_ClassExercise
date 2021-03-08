package RishabhSaini_C0784318_ClassExercise;

public class RishabhSaini_C0784318_ClassExercise {
    public static void main(String[] args) {
        int[] arr = {28, 19, 11, 26, 7, 4, 22, 23, 20, 77};
        System.out.print("Array in actual order: ");
        for (int r : arr) {
            System.out.print(r + "  ");
        }

        System.out.print("\n\nArray in reverse order: ");
        for (int r = arr.length - 1 ; r >= 0 ; r-- )  {
            System.out.print(arr[r] + "  ");
        }

        System.out.print("\n\nArray in ascending order: ");
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = 0 ; j < i ; j++){
                if(arr[i] < arr[j]){
                    int a = arr[i];
                    arr[i] = arr[j];
                    arr[j] = a;
                }
            }
        }
        for (int r : arr) {
            System.out.print(r + "  ");
        }

        System.out.print("\n\nArray in descending order: ");
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = 0 ; j < i ; j++){
                if(arr[i] > arr[j]){
                    int a = arr[i];
                    arr[i] = arr[j];
                    arr[j] = a;
                }
            }
        }
        for (int r : arr) {
            System.out.print(r + "  ");
        }

        System.out.print("\n\nDisplaying only odd elements: ");
        for(int r: arr){
            if(r % 2 != 0){
                System.out.print(r +"  ");
            }
        }

        System.out.print("\n\nDisplaying only even elements: ");
        for(int r: arr){
            if(r % 2 == 0){
                System.out.print(r +"  ");
            }
        }

        System.out.print("\n\nSum of all elements: ");
        int total = 0;
        for(int r: arr){
            total += r;
        }
        System.out.println(total);
    }
}

