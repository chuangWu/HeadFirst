package cn.chuangblog.headfirst.duck2;

/**
 * @author : created by chuangWu
 * @version : 0.01
 * @email : chuangwu127@gmail.com
 * @created time : 2015-08-19 23:05
 * @description : none
 * @for your attention : none
 * @revise : none
 */
public class MallardDuck extends Duck {

    public MallardDuck(){
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }
    @Override
    protected void display() {
        // look likes a mallard duck
    }
}
