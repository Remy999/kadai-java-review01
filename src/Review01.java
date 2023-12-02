public class Review01 {

        public static double Taxrate=0.1;
        public static double tax(double price) {
            return price*Taxrate;
        }

        public static void main(String[]args) {
           double Price = 1000;

           double Taxprice = tax(Price);

           double Totalprice = Price + Taxprice;

           System.out.println(Price + "円の商品の税込価格は" + Totalprice + "円（消費税は" + Taxprice + "円）です。");
    }
}