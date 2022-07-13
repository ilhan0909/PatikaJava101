public class Main {
    public static void main(String[] args) {

        for (int i=1;i<100;i++){

            int dividerCount = 0;

            for(int k=1;k<=i;k++) {

                if (i % k == 0) {

                    dividerCount++;
                }
            }
            if(dividerCount==2){

               System.out.print(i+" ");
            }

        }

    }
}
