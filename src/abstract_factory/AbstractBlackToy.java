package abstract_factory;

/**
 * Created by Dante on 2016/11/10.
 */
public abstract class AbstractBlackToy implements Toy{
    public void getColor() {
        System.out.println("我是小黑人~");
    }

    public void talk() {
        System.out.println("小黑人方言太重，平常人听不懂！");
    }
}
