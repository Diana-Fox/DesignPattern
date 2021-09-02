package iterator.turn_page;

import java.util.Collection;

//翻页接口
public interface AggregationIterator {
    boolean hasNext();

    //向后翻页
    Collection next(int num);


    boolean hasPrevious();

    //向前翻页
    Collection previous(int num);
}
