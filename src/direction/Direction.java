package direction;

public enum Direction {
    UP(1, "向上"), DOWN(2, "向下"), LEFT(3, "向左"), RIGHT(4, "向右");
    private final int id; // 仅仅是为了做示范添加的
    private final String cnName;

    Direction(int id, String cnName){
        this.id = id;
        this.cnName =cnName;
    }

    public static Direction parseDirection(String direction) {
        switch (direction) {
            case "w":
                return UP;
            case "s":
                return DOWN;
            case "a":
                return LEFT;
            case "d":
                return RIGHT;
        }
        return null;
    }

    public String getCnName() {
        return cnName;
    }
}