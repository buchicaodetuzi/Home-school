package Server.dao;

import java.util.List;

import Entity.Student;

public interface IStudentDao {
	public Student QueryStu(String studentNo);  //��ȡ�ҳ�����
	public String QueryClassNoByStuNo(String studentNo);//ͨ��studentNo���Ұ༶���
	public List queryByStudentNo(String studentNo);
}
