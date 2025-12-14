import com.yangq.pojo.Books;
import com.yangq.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.Calendar;
import java.util.Date;

public class MyTest {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookService = (BookService) context.getBean("BookServiceImpl");
        for (Books books : bookService.queryAllBook()) {
            System.out.println(books);
        }
    }
    @Test
    public void addBook(){
        Calendar calendar = Calendar.getInstance();
        calendar.set(2020,3,20,5,30,0);
        Date date = calendar.getTime();

    }
}
