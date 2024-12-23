package com.app.empbe4.model.jointable;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmIgnore;
import lombok.Data;
import javax.persistence.*;

import com.app.empbe4.model.Manager;
import com.app.empbe4.model.Pet;
import com.app.empbe4.model.PetCareCenter;
import com.app.empbe4.model.PetOwner;
import com.app.empbe4.model.Document;
import com.app.empbe4.model.PetService;
import com.app.empbe4.enums.PetServiceType;
import com.app.empbe4.converter.PetServiceTypeConverter;

@Entity(name = "PetCareCenterImages")
@Table(schema = "\"empbe4_654\"", name = "\"PetCareCenterImages\"")
@Data
public class PetCareCenterImages{

 	@Id
    @Column(name = "\"Id\"")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column(name = "\"PcId\"")
	private Integer pcId;

    
    @Column(name = "\"DocId\"")
    private Integer docId;
 
}