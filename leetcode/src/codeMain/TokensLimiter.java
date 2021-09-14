package codeMain;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class TokensLimiter {

    private ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(5);

    // 最后一次令牌发放时间
    public long timeStamp = System.currentTimeMillis();
    // 桶的容量5
    public int capacity = 5;
    // 令牌生成速度2/s
    public int rate = 2;
    // 当前令牌数量
    public int tokens;

    public void acquire() {
        scheduledExecutorService.scheduleWithFixedDelay(() -> {
            long now = System.currentTimeMillis();
            // 当前令牌数
            tokens = Math.min(capacity, (int) (tokens + (now - timeStamp) * rate / 1000));
            //每隔0.5秒发送随机数量的请求
            int permits = (int) (Math.random() * 9) + 1;
            System.out.println("请求令牌数：" + permits + "，当前令牌数：" + tokens);
            timeStamp = now;
            if (tokens < permits) {
                // 若不到令牌,则拒绝
                System.out.println("限流了");
            } else {
                // 还有令牌，领取令牌
                tokens -= permits;
                System.out.println("剩余令牌=" + tokens);
            }
        }, 1000, 500, TimeUnit.MILLISECONDS);
    }
    public static void main(String[] args) {
        TokensLimiter tokensLimiter = new TokensLimiter();
        tokensLimiter.acquire();
    }

}