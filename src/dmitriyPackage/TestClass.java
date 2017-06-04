public class TestClass {
    public static void main(String[] args) {
        public static double massive {
            double[] massive = {10, 20, 30, 40, 50, 0.25, 3.56, 4.21, -3.98, 5.34}
        }
        public static int array {
            int [] array = {50,73,58,96,-32,-47,62}
        }
        public static int sum(int array) {
            for (int i = 0; i < array; i++) {
                System.out.println( int array[i]+" ");
            }
            int total = 0;
            for (int i = 0; i < array; i++) {
            total + = array[i];
        }
        System.out.println("Сумма чисел массива: " + total);
        }
        public static double double sum(double massive[]){
            for (int i = 0; i < massive; i++) {
                System.out.println(double massive[i] + " ");
            }
            double total = 0;
            for (int i = 0; i < massive; i++) {
                total += massive[i];
            }
            System.out.println("Сумма чисел массива: " + total);
        }
        public static int max(int array[]){
        int max = array[0];
        for (int i = 1; i < array; i++) {
            if (array[i] > max) max = array[i];
        }
        System.out.println("Наибольший элемент: " + max);
        }
        public static double max(double massive[]){
            double max = massive[0];
            for (int i = 1; i < massive; i++) {
                if (massive[i] > max) max = massive[i];
            }
            System.out.println("Наибольший элемент: " + max);
        }
         public static int min(int array[]){
             int min = array[0];
             // Перебираем все элементы массива.
             for (int i = 1; i < array.length; i++) {
                 // Сравниваем значение переменной min со значениями элемента массива.
                 // Если значение элемента массива меньше значения переменной min,
                 // то новое значение переменной min будет равно значению этого элемента.
                 if (array[i] < min) {
                     min = array[i];
                 }
             }
             // Выводим на экран наименьший элемент массива myArray.
             System.out.println("Минимальное значение в массиве array: " + min);
         }
    public static double min(double massive[]){
        double min = massive[0];
        // Перебираем все элементы массива.
        for (int i = 1; i < massive.length; i++) {
            // Сравниваем значение переменной min со значениями элемента массива.
            // Если значение элемента массива меньше значения переменной min,
            // то новое значение переменной min будет равно значению этого элемента.
            if (massive[i] < min) {
                min = massive[i];
            }
        }
        // Выводим на экран наименьший элемент массива massive.
        System.out.println("Минимальное значение в массиве massive: " + min);
    }
    public static int maxPositive(int array){
        int max = 0;
        for(int number : array)
            if(number>0 && max<number)
                max = number;
        System.out.println(max);
    }
    public static double maxPositive(double massive){
        double max = 0;
        for(double number : massive)
            if(number>0 && max<number)
                max = number;
        System.out.println(max);
    }
    public static int Multiplection(int array){

    }
    public static  double Multiplection(double massive){

    }
    public static int modulus(int array){

    }
    public static double modulus(double massive){

    }
    public static int secondLargest(int array){

    }
    public static double secondLargest(double massive){

    }
}

    }

