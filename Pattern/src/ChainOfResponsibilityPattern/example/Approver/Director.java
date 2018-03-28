package ChainOfResponsibilityPattern.example.Approver;

import ChainOfResponsibilityPattern.example.Request.PurchaseRequest;

/**
 * 主任类：具体处理类
 */
public class Director extends Approver{

    public Director(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if (request.getAmount() < 50000) {
            System.out.println("主任" + this.name + "审批采购单：" + request.getNumber() + "，金额：" + request.getAmount() + "元，采购目的：" + request.getPurpose() + "。"); //处理请求
        }
        else {
            //successor这个是下一任
            this.successor.processRequest(request); //转发请求
        }
    }
}
