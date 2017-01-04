package myers.test;

import myers.model.user;
//import myers.inter.userMapper;
import myers.service.UserServiceI;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MybatisTest {

    private static UserServiceI userService;
    
    /**
     * 这个before方法在所有的测试方法之前执行，并且只执行一次
     * 所有做Junit单元测试时一些初始化工作可以在这个方法里面进行
     * 比如在before方法里面初始化ApplicationContext和userService
     */
//    @Before
//    public void before(){
//        //使用"spring.xml"和"spring-mybatis.xml"这两个配置文件创建Spring上下文
//        ApplicationContext ac = new ClassPathXmlApplicationContext(new String[]{"spring.xml","spring-mybatis.xml"});
//        //从Spring容器中根据bean的id取出我们要使用的userService对象
//        userService = (UserServiceI) ac.getBean("userService");
//    }
    
    public void GetUser(int id){
        user user = new user();
        user = userService.getUserById(id);
        System.out.println(user.getUsername());
        System.out.println(user.getUserage());
    }
    
    public void AddUser(int id, String name, int age){
    	user u = new user();
    	u.setId(id);
    	u.setUserage(age);
    	u.setUsername(name);
    	userService.addUser(u);
    }
    
    public static void main(String[] args) {
    	//使用"spring.xml"和"spring-mybatis.xml"这两个配置文件创建Spring上下文
    	ApplicationContext ac = new ClassPathXmlApplicationContext(new String[]{"myers/spring.xml","myers/spring-mybatis.xml"});
    	//从Spring容器中根据bean的id取出我们要使用的userService对象
    	userService = (UserServiceI) ac.getBean("userService");
    	
    	MybatisTest mbt = new MybatisTest();
    	mbt.GetUser(2);
//    	mbt.AddUser(4, "sndfilsbli", 22);
		
	}
    
}