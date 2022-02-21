public class obstacle {
    public static void main(String[] args) {
        int Stage = 0;

        Cat cat1 = new Cat(700, 5);
        Human human1 = new Human(2000, 2);
        Robot robot1 = new Robot(10000, 15);

        Treadmill treadmill = new Treadmill(300);
        Wall wall = new Wall(2);

        playMarathon(cat1, human1, robot1 , treadmill, wall);
    }

    public static void playMarathon(Cat cat1, Human human1, Robot robot1, Treadmill treadmill, Wall wall) {
        int Stage;
        do {
            for ( Stage = 1; Stage <=3 ; Stage++) {
                treadmill.setDistance(treadmill.getDistance()*Stage);
                wall.setHeight(wall.getHeight()*Stage);

                for (int j = 0; j < 1; j++) {
                    if (robot1.distance < treadmill.getDistance()) { continue; }
                    robot1.runTreadmill(treadmill);

                    if (human1.distance < treadmill.getDistance()) { continue; }
                    human1.runTreadmill(treadmill);

                    if (cat1.distance < treadmill.getDistance()) { continue; }
                    cat1.runTreadmill(treadmill);
                }

                for (int j = 0; j < 1; j++) {
                    if (robot1.height < wall.getHeight()) { continue; }
                    robot1.jumpWall(wall);

                    if (cat1.height < wall.getHeight()) { continue; }
                    cat1.jumpWall(wall);

                    if (human1.height < wall.getHeight()) { continue; }
                    human1.jumpWall(wall);

                }
                System.out.println("\n" + Stage + " этап окончен" + "\n");
            }
        } while (Stage == 3);
    }
}