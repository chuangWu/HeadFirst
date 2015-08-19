package cn.chuangblog.headfirst.duck1;

/**
 * @author : created by chuangWu
 * @version : 0.01
 * @email : chuangwu127@gmail.com
 * @created time : 2015-08-19 22:42
 * @description : none
 * @for your attention : none
 * @revise : none
 */
public class RedheadDuck extends Duck implements Flyable,Quackable{
    @Override
    protected void display() {
        //look likes redheadduck
    }

    @Override
    public void fly() {
        //redheadduck fly
    }

    @Override
    public void quack() {
        //redheadduck quack
    }
}
