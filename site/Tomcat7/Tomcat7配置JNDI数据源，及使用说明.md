# Tomcat7����JNDI����Դ����ʹ��˵��

1. �ο��뱾�ļ�ͬĿ¼�µ�`context.xml`�޸�Tomcat�����ļ�`conf\context.xml`(����<Resouce/>Ԫ��)
2. ��`com.sinosoft.utility.JdbcUrl`�ķ���`public JdbcUrl()`��ʹ�����´�����䡣(����ʱjdniNameǰ�����`java:comp/evn/`)
```
DBType = "COMMONSDBCP";
DBName = "java:comp/env/jdbc/sts_db";
```