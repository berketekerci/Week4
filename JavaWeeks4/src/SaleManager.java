
public class SaleManager {
	void sale(Customer customer, Campaigns campaigns, Games games) {
		System.out.println(customer.getFirstName() + " isimli kullan�c� %" + campaigns.campaignDiscount + " indirimle "
				+ games.getGame() + " adl� oyunu " + (games.getGamePrice()
						- (games.getGamePrice() * campaigns.getCampaignDiscount() / 100) + "TL'ye sat�n ald�."));
	}
}
