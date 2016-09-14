
public class Client {

	public static void main(String[] args) {
		BossSubject boss = new BossSubject();
		
		StockObserver observer = new StockObserver("XiaoMing", boss);
		StockObserver oberver2 = new StockObserver("HanMeiMei",boss);
		
		boss.registerObserver(observer);
		boss.registerObserver(oberver2);
		
		boss.setAction("Boss is back!");
		boss.notifyObservers();
	}
}
