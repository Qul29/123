public class Robot {
    public int distance;
    public double height;
    public Robot (int distance, double height){
        this.distance = distance;
        this.height = height;
    }

    public void runTreadmill(Treadmill treadmill) {
        if (treadmill.getDistance() <= distance )
            System.out.println("Робот смог пробежать " + treadmill.getDistance() + " метров" );
        else System.out.println("Робот не смог пробежать");
    }

    public void jumpWall(Wall wall) {
        if (wall.getHeight() <= height)
            System.out.println("Робот смог перепрыгнуть стену высотой " + wall.getHeight() + " метра");
        else System.out.println("Робот не смог перепрыгнуть стену");
    }
}