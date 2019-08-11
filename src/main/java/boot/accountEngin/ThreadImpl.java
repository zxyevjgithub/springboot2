package boot.accountEngin;

import boot.Service.AccountModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class ThreadImpl {


    private static final Logger logger = LoggerFactory.getLogger(ThreadImpl.class);

    @Async("AsyncdoAccount")  // 提供一个线程池
    public void exxcute(AccountModel accountModel) throws  Exception {
        System.out.println("do execute begin " + Thread.currentThread().getName() );


        String call = accountModel.call();
        System.out.println("do execute end  " + Thread.currentThread().getName());
    }
}
