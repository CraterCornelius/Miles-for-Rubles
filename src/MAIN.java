public class MAIN {
    public static void main(String[] args) {

        int AmmountSpent = 15;
        int required = 20;
        int gain = AmmountSpent / required;

        if (gain >= 1) {
            System.out.println( " Ваш бонус за потраченные " + AmmountSpent + " рублей составляет " + gain + " миль ");
        } else {
            System.out.println( " Бонусов за поездку нет ");
        }
    }
}
