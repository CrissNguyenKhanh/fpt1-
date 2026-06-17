       
       public class khanh {
            public static void main(String[] args) {
                System.out.println("Hello, World!");

                
            }
       enum SIGN {
            PLUS,
            MINUS,
            MULTIPLY,
            DIVIDE
}
         

        private Double calculate(SIGN sign, Double arg1, Double arg2) {
            switch (sign) {
                case PLUS:
                    return arg1 + arg2;

                case MINUS:
                    return arg1 - arg2;

                default:
                    break;
            }
            return 0d;
        }

        }