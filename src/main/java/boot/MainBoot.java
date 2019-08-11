package boot;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.remoting.httpinvoker.HttpInvokerRequestExecutor;
import org.springframework.remoting.httpinvoker.HttpInvokerServiceExporter;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.handler.SimpleUrlHandlerMapping;

@SpringBootApplication
@EnableConfigurationProperties
@EnableTransactionManagement
public class MainBoot {

    public static void main(String[] args) {
       // SimpleUrlHandlerMappi//

       // HttpInvokerServiceExporter
       // HttpInvokerRequestExecutor
        SpringApplication.run( MainBoot.class,args  );
    }
}
