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

		public abstract Object getEMail();

		public abstract Object getPassword();

	}



