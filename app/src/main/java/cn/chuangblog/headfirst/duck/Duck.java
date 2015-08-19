package cn.chuangblog.headfirst.duck;

/**
 * @author : created by chuangWu
 * @version : 0.01
 * @email : chuangwu127@gmail.com
 * @created time : 2015-08-19 22:18
 * @description : Duck
 * @for your attention : none
 * @revise : none
 */
public abstract class Duck {


    /**
     * 叫
     */
    protected void quack(){
        // duck quack
    }

    /**
     * 游泳
     */

    protected void swim(){
        //all ducks swim
    }

    /**
     *描述
     */
    protected abstract void display();

    /**
     * 飞
     */
    protected void fly(){
        // duck fly
    }
}
