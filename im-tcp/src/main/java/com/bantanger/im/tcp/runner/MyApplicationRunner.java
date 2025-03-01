package com.bantanger.im.tcp.runner;

import com.bantanger.im.tcp.Starter;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * @author: chensongmin
 * @create: 2023-09-18 22:12
 */
@Component
public class MyApplicationRunner implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
        if (args.containsOption("customOption")) {
            // 在这里运行你的自定义代码
            Starter.start(args.getOptionValues("customOption").get(0));
        }
    }

}
