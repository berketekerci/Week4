
public class CampaignsManager implements CampaignsService{

	@Override
	public void addCampaign(Campaigns campaigns) {
		System.out.println("Kampanya Eklendi.");
		
	}

	@Override
	public void editCampaign(Campaigns campaigns) {
		System.out.println("Kampanya D�zenlendi.");
		
	}

	@Override
	public void deleteCampaign(Campaigns campaigns) {
		System.out.println("Kampanya Silindi.");
		
	}
	
	
	
}
