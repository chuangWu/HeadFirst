package cn.chuangblog.headfirst.duck1;

/**
 * @author : created by chuangWu
 * @version : 0.01
 * @email : chuangwu127@gmail.com
 * @created time : 2015-08-19 22:40
 * @description : none
 * @for your attention : none
 * @revise : none
 */
public class MallardDuck extends Duck implements Flyable ,Quackable{
    @Override
    protected void display() {
        // look likes a mallard duck
    }

    @Override
    public void fly() {
        //mallardduck fly
    }


    @Override
    public void quack() {
        //mallardduck quack
    }
}
