
public class SaleManager {
	void sale(Customer customer, Campaigns campaigns, Games games) {
		System.out.println(customer.getFirstName() + " isimli kullanýcý %" + campaigns.campaignDiscount + " indirimle "
				+ games.getGame() + " adlý oyunu " + (games.getGamePrice()
						- (games.getGamePrice() * campaigns.getCampaignDiscount() / 100) + "TL'ye satýn aldý."));
	}
}
