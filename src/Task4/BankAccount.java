package Task4;

public class BankAccount {
    private int bankCount;

    public BankAccount(int bankCount) {
        this.bankCount = bankCount;
    }


   public int getBankCount() {
        return bankCount;
    }

    public void depositingMoney(int cash) throws MaxBalanceExceededException{
        if(cash+bankCount>1000){
            throw new MaxBalanceExceededException("Превышение максимальное допустимого значения баланса");
        }
        bankCount = bankCount+cash;
    }

    public void cashWithdrawal(int cash) throws InsufficientFundsException{
        if(bankCount<cash){
            throw new InsufficientFundsException("Недостаточно средств для снятия со счета");
        }
        bankCount = bankCount-cash;
    }


}
