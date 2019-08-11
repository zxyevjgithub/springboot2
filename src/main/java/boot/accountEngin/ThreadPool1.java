package boot.accountEngin;

import boot.Service.AccountModel;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Configuration
@EnableAsync

public class ThreadPool1  {
       ExecutorService executorService  = Executors.newFixedThreadPool(10);

    @Bean
    public Executor AsyncdoAccount( ){
       // executorService.submit(    () -> {} );
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();

        return  executorService ;

    }




}
