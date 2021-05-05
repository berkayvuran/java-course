package gameBackendHomework;

public class Main {

	public static void main(String[] args) {
		
		Gamer gamer = new Gamer();	
		gamer.setId(1);
		gamer.setFirstName("Berkay");
		gamer.setLastName("Vuran");
		gamer.setDateOfBirth("11.06.1995");
		gamer.setNationalityId("TCKN");
		
		Game game = new Game();
		game.setId(1);
		game.setName("Super Mario");
		game.setDetail("Çocukluðumuzun oyunu");
		game.setPrice(150);
		
		Campaigns campaign = new Campaigns();
		campaign.setId(1);
		campaign.setName("Ýlk kampanya");
		campaign.setDetails("Çalýþtýrýlan oyunda %50 indirim saðlar");
		
		GamerManager gamerManager = new GamerManager();
		gamerManager.add();
		
		GameManager gameManager = new GameManager();
		gameManager.add();
		
		GameSellManager gameSellManager = new GameSellManager();
		gameSellManager.seller(gamer);
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.work(campaign);
	}

}
