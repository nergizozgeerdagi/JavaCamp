package kodlamaio.hrmsproject.entities.dtos;

import java.util.Date;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class JobExperienceForAddDto 
{

	  @NotNull
	  @NotBlank
      private String officeName;

	  @NotNull
	  @NotBlank
      private String position;
      
	  @NotNull
      private Date startDate;

      private Date endDate;
      
}