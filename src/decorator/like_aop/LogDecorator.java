package decorator.like_aop;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LogDecorator extends Decorator {
    public LogDecorator(GoodsSaleEbi ebi) {
        super(ebi);
    }

    @Override
    public boolean sale(String user, String customer, SaleMode saleMode) {
        boolean f = ebi.sale(user, customer, saleMode);
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        System.out.println("日志记录：" + user + "于" + df.format(new Date()) +
                "时保存了一条销售记录，客户是" + customer + "购买记录是" + saleMode);
        return f;
    }
}
