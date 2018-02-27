package clientwsperiodictable;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 *
 * @author Jfaber
 */
@Root
public class NewDataSet1 {
    
    @Element
    private Table1 Table;

    public Table1 getTable() {
        return Table;
    }

    public void setTable(Table1 Table) {
        this.Table = Table;
    }
}
