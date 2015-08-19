package cn.chuangblog.headfirst.animal;

/**
 * @author : created by chuangWu
 * @version : 0.01
 * @email : chuangwu127@gmail.com
 * @created time : 2015-08-19 22:48
 * @description : none
 * @for your attention : 可以是接口，也可以是抽象类
 * @revise : none
 */
public class Dog extends Animal {
    @Override
    protected void makeSound() {
        brak();
    }

    protected void brak() {
        //brak sound
    }
}
