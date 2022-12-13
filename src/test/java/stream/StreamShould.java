package stream;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.IntStream;

public class StreamShould {

    @Test
    void create_list_easier() {
        List<Integer> multiplyByTwo = IntStream.range(0, 5)
                .boxed()
                .map(num -> num * 2)
                .toList();

        Assertions.assertThat(multiplyByTwo).isEqualTo(List.of(0, 2, 4, 6, 8));
    }
}
