package player;

// Immutable
public record PlayerRecord(String name, int goal) {

    public PlayerRecord {
        if (name == null)
            throw new IllegalPlayerNameException();
    }

    public PlayerRecord changeName(String newName) {
        return new PlayerRecord(newName, goal);
    }
}
