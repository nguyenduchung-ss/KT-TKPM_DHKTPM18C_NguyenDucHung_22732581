package singleton;

public class GameDatabase {
    private static GameDatabase instance;
    private String connectionUrl;
    private int playerCount = 0;

    private GameDatabase() {
        this.connectionUrl = "jdbc:mysql://localhost:3306/game_db";
        System.out.println("[Singleton] GameDatabase khoi tao — ket noi: " + connectionUrl);
    }

    public static synchronized GameDatabase getInstance() {
        if (instance == null) {
            instance = new GameDatabase();
        }
        return instance;
    }

    public void savePlayer(String name) {
        playerCount++;
        System.out.println("[DB] Luu player #" + playerCount + ": " + name);
    }

    public String getConnectionUrl() {
        return connectionUrl;
    }
}
