package Server.dao;

import Entity.Teacher;

public interface ITeacherDao {
	public Teacher queryByTeacherNo(String teacherNo);
	public String QueryTeaLoginPwd(String teacherNo); //������ʦ��Ų�ѯ����
	public String queryByTeaName(String teacherName);
}
