package com.storm.wind.xpatch;

import com.storm.wind.xpatch.MainCommand;

import org.junit.Test;


/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void test() {
//        MainCommand.main(new String[]{"D:\\Desktop\\BuildTest\\xpatch\\sogou.apk",
//                "-oD:\\Desktop\\BuildTest\\xpatch\\sogou2.apk"});
        new MainCommand().doMain(new String[]{"D:\\Desktop\\BuildTest\\xpatch\\sogou.apk",
                "-oD:\\Desktop\\BuildTest\\xpatch\\sogou2.apk"});
        System.exit(0);
    }
}