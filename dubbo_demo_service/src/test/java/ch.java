import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

/**
 * Created by Administrator on 2018/8/12.
 */
public class ch extends persion{
    public void sys() throws Throwable {
        try {
            MethodType mt=MethodType.methodType(void.class);
            MethodHandle mh= MethodHandles.lookup().findSpecial(humen.class,"sys",mt,getClass());
            mh.invoke(this);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
