       
       public class khanh {
            public static void main(String[] args) {
                System.out.println("Hello, World!");

                
            }
      private Double calculate(SIGN sign, Double arg1, Double arg2) {
            switch (sign) {
                case MULTIPLY:
                    return arg1 * arg2;

                case DIVIDE:
                    if (arg2 == 0) {
                        return 0d;
                    }
                    return arg1 / arg2;

                default:
                    break;
            }
        
                    return 0d;
      }
                    

        }
