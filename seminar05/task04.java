// 4*. На шахматной доске расставить 8 ферзей так, чтобы они не били друг друга.

import java.util.Map;
import java.util.TreeMap;

public class task04 {
    public static void main(String[] args) {
        Map<Integer, Integer> board = new TreeMap<>();
        int x; // поле по горизонтали
        int y; // поле по вертикали
        for (int l = 1; l < 9; l++) {
            //System.out.println("start");
            //System.out.println (l);
            //board.clear();
            board.put(1, l);
            for (x = 2; x < 9; x++) {
                for (y = 1; y < 9; y++) {
                    boolean flag = true;
                    for (int k = 1; k < x; k++) {
                        //System.out.println(board);
                        //System.out.printf("x: %d, y: %d, k: %d", x, y, k);
                        //System.out.printf("  b: %d", board.get(x - k));
                        if (board.get(x - k) == null) {
                            flag = false;
                            break;
                        }
                        if ((y == board.get(x - k)) || (y == (board.get(x - k) + k)) || (y == (board.get(x - k) - k))) {
                            //System.out.printf("i: %d, j: %d, k: %d", i, j, k);
                            flag = false;
                            break;
                        }
                    }
                    if (flag) {
                        board.put(x, y);
                        //System.out.println(board);
                        break;
                    }
                }
            }
            if (board.size() == 8) {
                System.out.println(board);
                return;
            }
        }
        System.out.println(board);
    }
}



