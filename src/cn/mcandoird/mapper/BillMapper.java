package cn.mcandoird.mapper;

import cn.mcandoird.pojo.Bill;

import java.util.Date;
import java.util.List;
import java.util.Map;

public interface BillMapper {
    Bill getMax();

    Bill getBillById(int id);

    List<Bill> getAll();

    List<Bill> getBillByDate(Date date);


    List<Bill> getPage(Map<String, Integer> map);

    int getCount();

    /**
     * ����idɾ���˵�
     *
     * @param id
     * @return
     */
    int delBillById(int id);


    /**
     * �޸��˵�
     * @param bill
     * @return
     */
    int updateBill(Bill bill);



    double sum(Date date) ;

    /**
     * ��ȡ���еĴ��ڵ��·�
     * @return
     */
    String [] findAllMonth();


    /**
     * ���ָ���·ݵ�ָ��֧����ʽ�� ����
     * ���磺
     *  map.put("date",new Date());
     *  map.put("pay_mode","΢��");
     * @param map
     * @return ����
     */
    int getCountByPay_modeAndDate(Map<String,Object>map);

    /**
     * ��ȡ��ǰ�·����е�֧����ʽ
     * @return
     */
    String []getAllPay_mode(Date date);

    /**
     * ͨ��֧����ʽ�����ڻ�ȡ���ѽ��
     * ���磺
     * map.put("date",new Date());
     * map.put("pay_mode","΢��");
     * @param map
     * @return
     */
    double getSumByPay_modeAndDate(Map<String,Object>map);


}


