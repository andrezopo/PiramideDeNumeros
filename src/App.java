public class App {
    public static void main(String[] args) throws Exception {

        for (int i = 1; i <= 16; i++){
            for (int j = 0; j< i; j++){
                if (i < 10){
                    System.out.print(i + " ");
                }else {
                    System.out.print(i);
                }
                
            }
            System.out.println("");
        }
    }
}
