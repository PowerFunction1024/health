import org.junit.Test;
import org.springframework.scheduling.support.SimpleTriggerContext;

import javax.lang.model.element.NestingKind;

public class java {
    /**
     * 测试断点的条件设置 a
     */
    @Test
    public void fun01(){
        /**
         * 九九乘法表
         */
        for (int i = 1; i <=9; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(j+"*"+i+"="+(i*j)+" ");

            };
            System.out.println( );

        }


    }

    /**
     * 断点智能步入的展示
     * @param name
     * @return
     */

    public boolean method(String name){

        System.out.println(name);
        return true;

    }

    @Test
    public void fun02(){
        String name="小  红";

        if (method(name.concat("小 明"))){

            name.substring(0);

        }


    }


    /**
     * 计算器的展示
     *  可以计算值
     *  可以得到方法的返回值
     * 可以设计变量
     */

    @Test
    public void fun03(){
        String name="小  红";

        if (method(name.concat("小 明").concat("小 文"))){

            name.substring(1);

        }


    }



    public int add(int a,int b){


        return a+b;
    }



    @Test
    public void fun04(){
        int a=12;
        if (add(10,20 )* 4 > a ){

            System.out.println("hello world");

        }


    }
///////////////////////////////////////////////////////////////////////////////////////

    /**
     * 多线程的调试
     */

    @Test
    public void fun05(){
        new Thread(()->{

            System.out.println("我是线程一");

        },"线程一").start();

        new Thread(()->{

            System.out.println("我是线程二");

        },"线程二").start();

        System.out.println("hello--main线程");
        System.out.println("world--main线程");

    }




























    @Test
    public void fun06(){

        String i=null;

        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);
        System.out.println(i.length());
        System.out.println(5);
        System.out.println(6);
        System.out.println(7);




}


}


