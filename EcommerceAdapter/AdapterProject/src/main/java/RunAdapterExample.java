public class RunAdapterExample {
    public static void main(String[] args) {
        Xpay xpay = new XpayImpl();
        xpay.setCreditCardNo("4789565874102365");
        xpay.setCustomerName("Max Warner");
        xpay.setCardExpMonth("09");
        xpay.setCardExpYear("25");
        xpay.setCardCVVNo((short) 235);
        xpay.setAmount(2565.23);
        testPayX(xpay);

        PayD payment = new DpayImpl(xpay);
        testPayD(payment);
    }

    private static void testPayX(Xpay payD) {
        System.out.println(payD.getCustomerName());
        System.out.println(payD.getCreditCardNo());
        System.out.println(payD.getCardCVVNo());
        System.out.println(payD.getCardExpMonth());
        System.out.println(payD.getAmount());
    }

    private static void testPayD(PayD payD) {
        System.out.println(payD.getCardOwnerName());
        System.out.println(payD.getCustCardNo());
        System.out.println(payD.getCVVNo());
        System.out.println(payD.getCardExpMonthDate());
        System.out.println(payD.getTotalAmount());
    }


}