package record;

import org.junit.jupiter.api.Test;
import player.IllegalPlayerNameException;
import player.Player;
import player.PlayerRecord;

import static org.assertj.core.api.Assertions.*;

public class RecordShould {

    @Test
    void be_immutable() {
        Player player = new Player("Ali", 50);
        PlayerRecord playerRecord = new PlayerRecord("Ali", 50);

        assertThat(player.getName()).isEqualTo(playerRecord.name());
        assertThat(player.getGoal()).isEqualTo(playerRecord.goal());

        PlayerRecord hasan = playerRecord.changeName("Hasan");

        assertThat(hasan).isNotEqualTo(playerRecord);
    }

    @Test
    void have_name() {
        assertThatExceptionOfType(IllegalPlayerNameException.class)
                .isThrownBy(() -> new PlayerRecord(null, 100));
    }
}
