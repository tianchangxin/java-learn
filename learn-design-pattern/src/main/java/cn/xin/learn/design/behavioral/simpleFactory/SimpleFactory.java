package cn.xin.learn.design.behavioral.simpleFactory;

/**
 * @author tiancx
 * @description: 简单工厂模式
 * @date 2024年06月30日
 */
public class SimpleFactory {
    /**
     * 根据传入的类获取对应的实例
     * @param clazz 类
     * @return 实例
     * @param <T> 泛型
     */
    public static <T> T getBean(Class<T> clazz) {
        try {
            return clazz.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            //todo 换成日志
            System.out.println("SimpleFactory getBean 实例化失败"+e.getMessage());
        }
        return null;
    }
}
