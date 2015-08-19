package cn.chuangblog.headfirst.duck2;

/**
 * @author : created by chuangWu
 * @version : 0.01
 * @email : chuangwu127@gmail.com
 * @created time : 2015-08-19 23:02
 * @description : none
 * @for your attention : none
 * @revise : none
 */
public abstract class Duck {
    /**
     * 飞的行为
     */
    protected FlyBehavior flyBehavior;

    /**
     * 叫的行为
     */
    protected QuackBehavior quackBehavior;


    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }


    /**
     * 游泳
     */
    protected void swim() {
        //all ducks swim
    }

    /**
     * 描述
     */
    protected abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }
}
