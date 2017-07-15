package cn.meijunjie.mybatis.bean;

public class Employee {

		private int id;
		private String last_name;
		private String email;
		private String gender;
		
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getlast_name() {
			return last_name;
		}
		public void setlast_name(String last_name) {
			this.last_name = last_name;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		@Override
		public String toString() {
			return "Employee [id=" + id + ", last_name=" + last_name + ", email=" + email + ", gender=" + gender + "]";
		}
		
		
		
}
