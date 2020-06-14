import java.util.ArrayList;

/**
 * @Author sml
 * @Date 2020/6/4 9:48 下午
 * @Description
 **/


class Father {
    static {
        System.out.println("Father静态代码块");
    }

    {
        System.out.println("father普通代码块");
    }
    public Father() {
        System.out.println("father构造方法");
    }
}

class Son extends Father{
    static {
        System.out.println("son静态代码块");
    }
    {
        System.out.println("son普通代码块");
    }
    public Son() {
        System.out.println("son构造方法");
    }

    public static void main(String[] args) {
        System.out.println(Object.class.isAssignableFrom(String.class));
    }
}
