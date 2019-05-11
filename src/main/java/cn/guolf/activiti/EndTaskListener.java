package cn.guolf.activiti;

import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.ExecutionListener;

public class EndTaskListener implements ExecutionListener {


  public void notify(DelegateExecution delegateExecution) throws Exception {
    System.out.println("MyEndTask");
    System.out.println(delegateExecution.toString());
  }
}
