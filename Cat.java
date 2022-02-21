public class Cat {
    public int distance;
    public double height;
    public Cat (int distance, double height){
        this.distance = distance;
        this.height = height;
    }

    public void runTreadmill(Treadmill treadmill) {
        if (treadmill.getDistance() <= distance )
            System.out.println("Кот смог пробежать " + treadmill.getDistance() + " метров" );
        else System.out.println("Кот не смог пробежать");
    }

    public void jumpWall(Wall wall) {
        if (wall.getHeight() <= height)
            System.out.println("Кот смог перепрыгнуть стену высотой " + wall.getHeight() + " метра");
        else System.out.println("Кот не смог перепрыгнуть стену");
    }
}