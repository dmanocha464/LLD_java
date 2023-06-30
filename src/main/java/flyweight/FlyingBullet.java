package flyweight;

public class FlyingBullet {
    double x;
    double y;
    double z;
    double direction;
    double speed;
    //registry of different bullet can be used from which reference can be used fetched instead of creating
    // new Bullet each time
    Bullet bullet;
}
