package controller.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity                     // Os atributos que queremos criar fica somente em Entity? 
                            // Tudo o que for de topico util no programa está so aqui? Como nome, idade.
@Table (name = "Usuarios")  // 1 Criar @Entity e importa o que for necessario.
public class UserDomain {   // 2 Criar @Table para o que? E importa.

	@Id 
	@Column (name = "id")  // 3 Dentro da classe ("UserDomain"), criamos o @Id 
	private Integer id;        // 4 Criar metodos da classe. @Column e identtificar cada 1.
	                       // Ps: Escreva os atributos antes de transformálos em metodos. 
	@Column (name = "name")
	private String name;
	
	@Column (name = "age") // Mudando name <- age, da um erro. Pq precisa ser somente name?
	private Integer age;       // Onde eu vejo (ou crio) as colunas? Id?
	
	@Column (name = "city")  // 5 Quando acabar, crie contrutor, e get/set.
	private String city;     // Ps: Botao direito + Source + Generate constructors using fields

	public UserDomain(Integer id, String name, Integer age, String city) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.city = city;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	public UserDomain() {}         //6 Criar um construtor vazio. Sempre necessario.
	
	
}
