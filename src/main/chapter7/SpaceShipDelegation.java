package main.chapter7;

/**
 * 代理类
 *
 * @author
 * @create 2019-04-08 下午9:15
 **/
public class SpaceShipDelegation {
    private SpaceShipController spaceShipController = new SpaceShipController();

    public void up(int velocity) {
        spaceShipController.up(velocity);
    }

    public void down(int velocity) {
        spaceShipController.down(velocity);
    }

    public void right(int velocity) {
        spaceShipController.right(velocity);
    }

    public void left(int velocity) {
        spaceShipController.left(velocity);
    }
}
