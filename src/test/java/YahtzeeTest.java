import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class YahtzeeTest {

    @Test
    public void chanceShouldSumAll(){
        var yahtzeeThrow = new YahtzeeThrow(new Dice[] {
                new Dice(Value.NUMBER_1),
                new Dice(Value.NUMBER_4),
                new Dice(Value.NUMBER_4),
                new Dice(Value.NUMBER_5),
                new Dice(Value.NUMBER_3),
        });

        assertEquals(yahtzeeThrow.getSum(), 17);
    }

}
