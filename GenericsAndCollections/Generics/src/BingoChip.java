public class BingoChip<T, V> {
    T columnLetter;
    V number;

    public BingoChip(T columnLetter, V number) {
        this.columnLetter = columnLetter;
        this.number = number;
    }

    @Override
    public String toString() {
        return ("Chip:" + columnLetter + "-" + number);
    }
}