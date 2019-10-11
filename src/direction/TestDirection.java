package direction;

import java.util.Scanner;

public class TestDirection {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);// new Scanner不能放在循环中，
                                                // 否则会非常消耗资源。
        while (true) {
            String command = input.nextLine();
            if (command.equals("exit")) break; // 退出程序
            Direction dir = Direction.parseDirection(command);
            if (dir == null) System.out.println("Illegal command!");
            else System.out.println(dir.getCnName());
        }
    }
}
