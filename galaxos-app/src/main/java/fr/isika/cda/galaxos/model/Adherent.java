package fr.isika.cda.galaxos.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
// @Inheritance(strategy = InheritanceType.SINGLE_TABLE)
// @DiscriminatorColumn(name = "type")
public class Adherent implements Serializable {
	    private static final long serialVersionUID = 1L;

	    
	    @Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private Long id;
	    

//	    @Enumerated(value = EnumType.STRING)
//	    private Role role = Role.ROLE_USER;
	    
	    @OneToOne
		@JoinColumn(name = "fkAdherent")
		private ComptUser user;
	    
	    @OneToOne
		@JoinColumn(name = "fkProfil")
		private Profil profil;
	    
	    @OneToOne
		@JoinColumn(name = "fkMessagerie")
		private Messagerie messagerie;

	    


	    
	    public Adherent() {
		}
	    
		@Override
		public int hashCode() {
			return Objects.hash(id, user);
		}
		
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Adherent other = (Adherent) obj;
			return Objects.equals(id, other.id) && Objects.equals(user, other.user);
		}

			@Override
			public String toString() {
				StringBuilder builder = new StringBuilder();
				
				builder.append("Profil [id=");
				builder.append(id);
				
				builder.append(", user=");
				builder.append(user);
				
				builder.append(", profil=");
				builder.append(profil);
				
				builder.append(", messagerie=");
				builder.append(messagerie);
				
				builder.append("]");
				
				return builder.toString();
			}
		
		
	   

}
