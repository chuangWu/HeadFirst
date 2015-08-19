package cn.chuangblog.headfirst.duck;

/**
 * @author : created by chuangWu
 * @version : 0.01
 * @email : chuangwu127@gmail.com
 * @created time : 2015-08-19 22:30
 * @description : none
 * @for your attention : none
 * @revise : none
 */
public class RubberDuck extends Duck {
    @Override
    protected void display() {
        //look likes rubberduck
    }

    @Override
    protected void fly() {
        // rubberduck can't fly
    }


    @Override
    protected void quack() {
        //squeak
    }

}
