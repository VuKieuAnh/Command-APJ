public class AppBanking {
    private Command openAccount;
    private Command closeAccount;

    public AppBanking(Command openAccount, Command closeAccount) {
        this.openAccount = openAccount;
        this.closeAccount = closeAccount;
    }

    public void clickOpenAccount(){
        openAccount.execute();
    }
    public void clickCloseAccount(){
        closeAccount.execute();
    }
}
