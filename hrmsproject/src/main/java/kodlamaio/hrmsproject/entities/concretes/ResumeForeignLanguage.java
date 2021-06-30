package kodlamaio.hrmsproject.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="resume_foreign_languages")

public class ResumeForeignLanguage 
{

	@Id
	@Column(name="resume_foreign_language_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

    @ManyToOne
    @JoinColumn(name="resume_id")
    private Resume resume;
    
    @ManyToOne
    @JoinColumn(name="foreign_language_id")
    private ForeignLanguage foreignLanguage;
    
    
	@Column(name = "ratio")
	private int ratio;


	public ResumeForeignLanguage(Resume resume, ForeignLanguage foreignLanguage, int ratio)
	{
		super();
		this.resume = resume;
		this.foreignLanguage = foreignLanguage;
		this.ratio = ratio;
	}
	
}