package Server.aciton.impl;

import Server.action.IAction;
import Server.service.ITchLoginSevice;
import Server.service.impl.TchLoginServiceImpl;
import dto.ActionMessage;
import dto.HandleMessage;

public class TeacherLoginAction implements IAction {
private ITchLoginSevice TchLoginService = new TchLoginServiceImpl();

	public HandleMessage handle(ActionMessage am) {
		HandleMessage hm = new HandleMessage();
		boolean isLogin = TchLoginService.login(String.valueOf(am.getData().get("LoginNo")),String.valueOf(am.getData().get("LoginPw")));
		hm.getData().put("isLogin", isLogin);
/*		if(isLogin) {
			System.out.printf("��¼�ɹ�");
		}else{
			System.out.printf("��¼ʧ�ܣ����Ż�������11����");
		}*/
		return hm;
	}
}
