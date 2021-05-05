import java.util.Date;

public class Main {

	public static void main(String[] args) {
		CustomerService customerService = new CustomerManager(new CustomerCheckServiceAdapter());
		customerService.saveCustomer(new Customer(0, "AHMET", "TEKERCI", "00000000000", new Date(01 / 02 / 2000)));
		Customer ahmet = new Customer();
		ahmet.setId(1);
		ahmet.setFirstName("AHMET BERKE");
		ahmet.setLastName("TEKERCI");
		ahmet.setNationalIdentity("00000000000");
		ahmet.setBirthDate(new Date(01 / 02 / 2000));
		customerService.saveCustomer(ahmet);
		customerService.editCustomer(ahmet);
		
		
		
		CampaignsService campaignsService = new CampaignsManager();
		Campaigns campaign1 =new Campaigns();
		campaign1.setId(0);
		campaign1.setCampaignName("FPS");
		campaign1.setCampaignInfo("First Person oyunlarda %50 indirim");
		campaign1.setCampaignDiscount(50.00);
		campaignsService.addCampaign(campaign1);
		
		GamesService gamesService = new GamesManager();
		Games games1 = new Games();
		games1.setGame("CS:GOBACK");
		games1.setGameInfo("FPS savaþ oyunu");
		games1.setGamePrice(80.00);
		gamesService.add(games1);
		
		SaleManager saleManager =new SaleManager();
		saleManager.sale(ahmet, campaign1, games1);
		customerService.deleteCustomer(ahmet);
	}
}
