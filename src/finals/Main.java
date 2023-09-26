package finals;

public class Main {
    public static void main(String[] args) {
        Nest nest = new Nest();
        nest.setTargetTemp(20);
        nest.checkAndAdjust(18);
        nest.checkAndAdjust(22);
        nest.checkAndAdjust(20);

        Wigwam w = new Wigwam();
        w.checkAndAdjust(15);
        w.checkAndAdjust(17);
        w.checkAndAdjust(18);
        w.checkAndAdjust(19);
        w.checkAndAdjust(20);
        w.checkAndAdjust(25);
        w.checkAndAdjust(28);
    }
}
