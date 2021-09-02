package iterator.random_page;

import java.util.Collection;

public interface AggregationIterator {
    boolean hasNext();
    boolean hasPrevious();
    Collection getPage(int pageNum,int pageSize);

}
