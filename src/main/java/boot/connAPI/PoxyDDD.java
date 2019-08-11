package boot.connAPI;

import boot.staticTR.T0121210;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class PoxyDDD implements InvocationHandler {

    private  Object target ;

    public PoxyDDD(Object target) {
        this.target = target;
    }




    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object invoke = method.invoke(args);
        return invoke;
    }


    public static void main(String[] args) throws NoSuchMethodException {
        Class<?> proxyClass = Proxy.getProxyClass(T0121210.class.getClassLoader(), T0121210.class);
        Constructor constructor = proxyClass.getConstructor(PoxyDDD.class);





    }




}
