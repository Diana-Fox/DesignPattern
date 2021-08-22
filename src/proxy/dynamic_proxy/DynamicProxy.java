package proxy.dynamic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 一个动态代理对象，必须实现InvocationHandler接口
 */
public class DynamicProxy implements InvocationHandler {
    //要被代理的对象
    private OrderApi order = null;

    /**
     * 获取绑定好代理和具体目标对象后的目标对象的接口
     * 动态代理实现只代理接口
     *
     * @param order
     * @return
     */
    public OrderApi getProxyInterface(Order order) {
        this.order = order;
        //创建接口代理对象固定的写法
        OrderApi orderApi = (OrderApi) Proxy.newProxyInstance(order.getClass().getClassLoader(),
                order.getClass().getInterfaces(), this);
        return orderApi;
    }

    /**
     * 具体执行的方法
     *
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("查看一下调用方法的名称===="+method.getName());
        //set方法，检查一下权限
        if (method.getName().startsWith("set")) {
            if (order.getOrderUser() != null &&
                    order.getOrderUser().equals(args[1])) {
                //调用代理对象的方法
                return method.invoke(order, args);
            } else {
                System.out.println("对不起" + args[1] + ",您无权限修改本订单数据");
            }
        } else {
            //不是set方法
            //调用对象，然后执行
            return method.invoke(order, args);
        }

        return null;
    }
}
