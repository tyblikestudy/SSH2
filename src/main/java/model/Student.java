package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_student")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private Integer age;
	private String idCard;
	private String persionDescrip;
	
	public String getIdCard() {
		return idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public String getPersionDescrip() {
		return persionDescrip;
	}

	public void setPersionDescrip(String persionDescrip) {
		this.persionDescrip = persionDescrip;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", idCard=" + idCard + ", persionDescrip="
				+ persionDescrip + "]";
	}

	public Student(String name, Integer age, String idCard, String persionDescrip) {
		super();
		this.name = name;
		this.age = age;
		this.idCard = idCard;
		this.persionDescrip = persionDescrip;
	}

	public Student(Long id, String name, Integer age, String idCard, String persionDescrip) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.idCard = idCard;
		this.persionDescrip = persionDescrip;
	}

	public Student(Long id) {
		super();
		this.id = id;
	}

	public Student() {
		super();
	}

	
}
