package com.example.hrmsProject.entities.concretes;




	import javax.persistence.Column;


	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.Inheritance;
	import javax.persistence.InheritanceType;
	import javax.persistence.Table;
	import lombok.AllArgsConstructor;
	import lombok.Data;
	import lombok.EqualsAndHashCode;
	import lombok.NoArgsConstructor;

	@Data
	@Entity
	@AllArgsConstructor
	@NoArgsConstructor
	@EqualsAndHashCode(callSuper = false)
	@Table(name = "users")
	@Inheritance (strategy = InheritanceType.JOINED)
	public abstract class User 
	{
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "id")
		private int id;
		
		
		@Column(name = "email_address")
		private String email;
		
		@Column(name = "password")
		private String password;
		
		public User() {
			super();
		}

		public User(int id, String email, String password) {
			super();
			this.id = id;
			this.email = email;
			this.password = password;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

	}


