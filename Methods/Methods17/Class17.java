package Methods17;

public class Class17 {

    // Método bolinhas
    public static int boxes(int balls, int size) {
        int boxes = 0;
        if (size == 1) {
            if (balls == 500) return 1;
            boxes = balls / 500 + 1;
        } else if (size == 2) {
            if (balls == 250) return 1;
            boxes = balls / 250 + 1;
        } else {
            if (balls == 100) return 1;
            boxes = balls / 100 + 1;
        }
        return boxes;
    }
}
