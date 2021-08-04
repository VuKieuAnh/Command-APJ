public class Client {
    public static void main(String[] args) {
        Account kieuAnh = new Account("Kieu Anh");
        Command open = new OpenAccount();
        Command close = new CloseAccount();
        AppBanking appBanking = new AppBanking(open, close);
        appBanking.clickOpenAccount();
        appBanking.clickCloseAccount();
    }
}
