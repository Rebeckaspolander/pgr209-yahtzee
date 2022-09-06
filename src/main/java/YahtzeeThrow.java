public class YahtzeeThrow {
    private final Dice[] dice;

    public YahtzeeThrow(Dice[] dice) {
        this.dice = dice;
    }

    public int getSum() {

        int sum = 0;

        Value maxValue = Value.NUMBER_1;
        for (Dice die : dice) {
            sum += die.getValue().toIntegerValue();
        }
        return sum;
    }
}
