
public class GamesManager implements GamesService {

	@Override
	public void add(Games games) {
		System.out.println("Oyun Eklendi : " + games.getGame() + " Fiyat: " + games.getGamePrice() + "TL Oyun Bilgisi : "
				+ games.getGameInfo());

	}

	@Override
	public void delete(Games games) {
		System.out.println("Oyun Silindi : " + games.getGame() + "Fiyat: " + games.getGamePrice() + "Oyun Bilgisi : "
				+ games.getGameInfo());

	}

}
