package my.learn.spring.basic.springin5steps.xml;

public class XmlPersonDAO {
    XmlJdbcConnection xmlJdbcConnection;

    public XmlJdbcConnection getXmlJdbcConnection() {
        return xmlJdbcConnection;
    }

    public void setXmlJdbcConnection(XmlJdbcConnection jdbcConnection) {
        this.xmlJdbcConnection = jdbcConnection;
    }
}
