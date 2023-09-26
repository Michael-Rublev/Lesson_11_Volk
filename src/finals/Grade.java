package finals;

public class Grade {

    // неизменяемая константа, имя СОГЛАСНО_КОНВЕНЦИИ большими буквами через нижний дифис
    public static final int MAX_GRADE = 5;
    public static final int MIN_GRADE = 1;
    private final int value;

    public Grade(int value) {
        if (value > MAX_GRADE && value < MIN_GRADE) {
            System.out.println("Wrong Grade!");
            this.value = MAX_GRADE;
        } else {
            this.value = value;
        }
    }

    public int getValue() {
        return value;
    }


    public static void main(String[] args) {
        Grade five = new Grade(6);

    }
}
