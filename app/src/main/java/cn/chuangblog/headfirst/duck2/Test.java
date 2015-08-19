package cn.chuangblog.headfirst.duck2;

/**
 * @author : created by chuangWu
 * @version : 0.01
 * @email : chuangwu127@gmail.com
 * @created time : 2015-08-19 23:26
 * @description : none
 * @for your attention : none
 * @revise : none
 */
public class Test {
    public static void main(String[] args) {

        Duck mallardDuck = new MallardDuck();
        mallardDuck.setFlyBehavior(new FlyRocketPowered());
        mallardDuck.performFly();
        mallardDuck.performQuack();


        Duck modelDuck = new ModelDuck();
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.performFly();
        modelDuck.performQuack();
    }
}
