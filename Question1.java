public class Question1 {

    public static void main(String[] args) {

        int missingNumber = 3;

        System.out.println("O número que está faltando é: " + findMissingNumber(initializeArray(missingNumber)));
    }

    public static Integer[] initializeArray(int missingNumber){
        Integer array[] = new Integer[100];

        for(Integer i = 0; i <100; i++) {
            if (i + 1 != missingNumber)
                array[i] = i + 1;
        }
        return array;
    }

    public static int findMissingNumber(Integer[] array){
        for(int i = 0; i < 100; i++){
            if(array[i] == null){
                return i + 1;
            }
        }
        return -1;
    }
}
