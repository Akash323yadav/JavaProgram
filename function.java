public class function
{
    public static int binomial(int n, int r) {
            {
//                BigInteger ans1 = BigIntegerMath.factorial();
                int fact_n = factorial(n);
                int fact_r = factorial(r);
                int fact_nmr = factorial(n - r);

                 int binomial = fact_n / (fact_r * fact_nmr);
                return binomial;


            }

            public static void main(String[] arg)
        {
                System.out.println(binomial(4, 5));
            }
        }

    private static int factorial(int n)
    }


}
