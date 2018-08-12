package jvm;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.InputStream;

/**
 * Created by Administrator on 2018/8/12.
 */
public class abc {

    @Test
    public void demo() throws Exception{
        InputStream is = new FileInputStream("E:\\test.class");
        byte[] b = new byte[is.available()];
        is.read(b);
        is.close();
        System.out.println(JavaClassExecuter.execute(b));
    }
}
