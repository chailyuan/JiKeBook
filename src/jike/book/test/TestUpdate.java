package jike.book.test;

import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import jike.book.map.InterfaceJiKeUserMap;
import jike.book.pojo.JiKeUser;

public class TestUpdate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String resource = "jike/book/map/MyBatisConfig.xml";
		Reader reader = null;
		SqlSession session;
		
		try {
			reader = Resources.getResourceAsReader(resource);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		SqlSessionFactory sqlMapper = new SqlSessionFactoryBuilder()
				.build(reader);
		session = sqlMapper.openSession();
		
		try {
			
			
//			JiKeUser jku=new JiKeUser();
//			jku.setUserName("jike001");
//			jku.setPassword("123456");
//			session.insert("insertUser",jku);
//			session.commit();
			
			
//			JiKeUser jku_Update=new JiKeUser();
//			jku_Update.setUserName("jike003");
//			jku_Update.setPassword("666666");
//			jku_Update.setId(1);
//			session.update("updateUser", jku_Update);
//			session.commit();
			
			
			
			
			//
//			InterfaceJiKeUserMap ijum = session.getMapper(InterfaceJiKeUserMap.class);
//			ijum.deleteUser(1);
//			session.commit();
			
			
			HashMap<String, String> hm = new HashMap();
			hm.put("userName", "jike003");
			hm.put("password", "666666");
			
			JiKeUser jiKeUser= new JiKeUser();
			jiKeUser.setPassword("666666");
			jiKeUser.setUserName("jike003");
			
			JiKeUser tmp = session.selectOne("login2Select", jiKeUser);
			if (tmp!=null) {
				System.out.println("登陆成功");
			}else {
				System.out.println("用户名或密码错误");
			}
			
			
//			List<JiKeUser> ap=session.selectList("selectUsers");
//			for(JiKeUser temp:ap){
//				System.out.println("鐢ㄦ埛鍚� = "+temp.getUserName());
//			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			session.close();
		}
	}

}
