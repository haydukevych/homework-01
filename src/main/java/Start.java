public class Start {
    public static void main(String[] args) {
        byte a = 1;
        short b = 2;
        int c = 3;
        long d = 4;
        float e = 5.0f;
        double f = 6.0;
        String str = "Hello";
        char ch = 'A';
        boolean g = true;

        System.out.println("		     MIN  		 		MAX");
        System.out.println();
        System.out.println("Byte    	" + Byte.MIN_VALUE + " 				" + Byte.MAX_VALUE);
        System.out.println("Short   	" + Short.MIN_VALUE + " 				" + Short.MAX_VALUE);
        System.out.println("Integer  	" + Integer.MIN_VALUE + " 			" + Integer.MAX_VALUE);
        System.out.println("Long  		" + Long.MIN_VALUE + " 		" + Long.MAX_VALUE);
        System.out.println();


        int array[] = {5, 7, 15, 2, 12, 24, 6, 17, 13, 19};
        int max = array[0], min = array[0];

        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println("MAX value = " + max);
        System.out.println("MIN value = " + min);
    }

}

