package com.example.test;

import com.example.test.vo.User;
import lombok.extern.slf4j.Slf4j;
import org.openjdk.jol.info.ClassLayout;

/**
 * @desc: 锁升级机制
 *
 * @author htxiong
 * @date 2023/2/19 16:02
 */

@Slf4j
public class LockUpgrade {
    public static void main(String[] args) throws InterruptedException {
        User user = new User();
        log.info("无状态001:{}", ClassLayout.parseInstance(user).toPrintable());

/*        User[] users = new User[10];
        log.info("数组无状态002:{}", ClassLayout.parseInstance(users).toPrintable());*/

        /**
         * jvm默认延时4s自动开启偏向锁，可通过-XX:BiasedLockingStartupDelay=0取消延时;
         * 如果不要偏向锁，可通过-XX:-UseBiasedLocking = false来设置
         */
        Thread.sleep(5000l);
        User user2 = new User();
        log.info("无状态101:{}", ClassLayout.parseInstance(user2).toPrintable());

    }
}
