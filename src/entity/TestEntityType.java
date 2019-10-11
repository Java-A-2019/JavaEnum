package entity;

public class TestEntityType {
    public static void main(String[] args) {
        EntityType type = EntityType.GREEN_SLIME;
        switch (type) {
            case LAND:
                System.out.println("LAND");
                break;
            case WALL:
                System.out.println("WALL");
                break;
            case GREEN_SLIME:
                System.out.println("GREEN_SLIME");
                break;
            default:
                System.out.println("Illegal");
        }
    }
}