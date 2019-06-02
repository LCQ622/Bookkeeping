package cn.mcandoird.Util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Util {

    /**
     * �÷������ڻ�ȡ SqlSession
     * @return
     */
    public   static SqlSession getSqlSession(){
        SqlSessionFactory factory= null;
        try {
            factory = new SqlSessionFactoryBuilder().build( Resources.getResourceAsStream("mybatis.xml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        SqlSession session=factory.openSession();
        return session;
    }


    /**
     * �÷������ڹر�SqlSession
     * @param session
     */
    public static  void clossSqlsession(SqlSession session){
        if (session!=null){
            session.close();
        }
    }


    /**
     * �÷������ڽ��ַ���������ת����Date
     * @param str
     * @param format
     * @return
     */
    public static Date  getDatebyStr(String str,String format){
        SimpleDateFormat f=new SimpleDateFormat(format);
        Date date= null;
        try {
            date = f.parse(str);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return date;
    }


    /**
     * �÷������ڽ�Dateת����String
     * @param date
     * @param format ��ʽ
     * @return �ַ���
     */
    public  static  String getStrByDate(Date date ,String format){
        SimpleDateFormat f=new SimpleDateFormat(format);
       return f.format(date);
    }

}
