package cn.mcandoird.service;

import cn.mcandoird.pojo.Bill;

import java.io.IOException;

public interface EditService {
    /**
     * ͨ�� id �����˵�
     * @param id
     * @return
     */
    Bill getBillById(int id) throws IOException;

    /**
     * �޸�һ����¼
     * @return
     */
    boolean updateBill(Bill bill) throws IOException;
}
