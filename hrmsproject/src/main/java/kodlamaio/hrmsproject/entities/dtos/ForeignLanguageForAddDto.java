package kodlamaio.hrmsproject.entities.dtos;

import javax.validation.constraints.Max;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import kodlamaio.hrmsproject.entities.concretes.ForeignLanguage;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class ForeignLanguageForAddDto 
{
	
	    @NotNull
		private ForeignLanguage foreignLanguage;
		@NotNull
		@Min(1)
		@Max(5)
		private int ratio;
		
}