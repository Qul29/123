public class Human {
    public int distance;
    public double height;
    public Human (int distance, double height){
        this.distance = distance;
        this.height = height;
    }

    public void runTreadmill(Treadmill treadmill) {
        if (treadmill.getDistance() <= distance )
            System.out.println("Человек смог пробежать " + treadmill.getDistance() + " метров" );
        else System.out.println("Человек не смог пробежать");
    }

    public void jumpWall(Wall wall) {
        if (wall.getHeight() <= height)
            System.out.println("Человек смог перепрыгнуть стену высотой " + wall.getHeight() + " метра");
        else System.out.println("Человек не смог перепрыгнуть стену");
    }
}
