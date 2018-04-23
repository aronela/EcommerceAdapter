public class DpayImpl implements PayD {
    private String custCardNo;
    private String cardOwnerName;
    private String cardExpMonthDate;
    private Integer cVVNo;
    private Double totalAmount;
    private final Xpay payment;

    public String getCustCardNo() {
        return custCardNo;
    }

    public void setCustCardNo(String custCardNo) {
        this.custCardNo = custCardNo;
    }

    public String getCardOwnerName() {
        return cardOwnerName;
    }

    public void setCardOwnerName(String cardOwnerName) {
        this.cardOwnerName = cardOwnerName;
    }

    public String getCardExpMonthDate() {
        return cardExpMonthDate;
    }

    public Integer getCVVNo() {
        return cVVNo;
    }

    public void setCardExpMonthDate(String cardExpMonthDate) {
        this.cardExpMonthDate = cardExpMonthDate;
    }

    public void setCVVNo(Integer cVVNo) {
        this.cVVNo = cVVNo;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    DpayImpl(Xpay payment) {
        this.payment = payment;
        setProp();
    }

    private void setProp() {
        setCardOwnerName(this.payment.getCustomerName());
        setCustCardNo(this.payment.getCreditCardNo());
        setCVVNo((int) this.payment.getCardCVVNo());
        setCardExpMonthDate(this.payment.getCardExpMonth() + "-" + this.payment.getCardExpYear());
        setTotalAmount(this.payment.getAmount());
    }
}
