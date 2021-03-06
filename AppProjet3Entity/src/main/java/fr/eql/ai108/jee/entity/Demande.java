package fr.eql.ai108.jee.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table (name = "demande")
public class Demande implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name = "id")
	private Integer id;

	private LocalDate dateAction;
	private String voieAction;
	private LocalDate dateSoumission;
	private LocalDate dateAnnulation;
	private LocalDate dateCloture;
	private Integer noteEvaluation;

	@ManyToOne
	@JoinColumn(referencedColumnName = "id")
	private Ville ville;
	
	@ManyToOne
	@JoinColumn(referencedColumnName = "id")
	private Activite activite;
	
	@ManyToOne
	@JoinColumn(referencedColumnName = "id")
	private Heure heureDebut;
	
	@ManyToOne
	@JoinColumn(referencedColumnName = "id")
	private Minute minuteDebut;

	@ManyToOne
	@JoinColumn(referencedColumnName = "id")
	private Heure heureFin;
	
	@ManyToOne
	@JoinColumn(referencedColumnName = "id")
	private Minute minuteFin;

	@ManyToOne
	@JoinColumn(referencedColumnName = "id")
	private MotifAnnulation motifAnnul;
	
	@ManyToOne
	@JoinColumn(referencedColumnName = "id")
	private TypeFinalisation finaleDemande;
	
	@ManyToOne
	@JoinColumn(referencedColumnName = "id")
	private ProbDemande probDemande;
		
	@ManyToOne
	@JoinColumn(referencedColumnName = "id")
	private User user;
	
    @OneToMany (mappedBy = "demande", cascade = CascadeType.PERSIST)
    private Set<ReponseAction> reponseAction;
	
	
	
	public Demande() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Demande(Integer id, LocalDate dateAction, String voieAction, LocalDate dateSoumission, LocalDate dateAnnulation,
			LocalDate dateCloture, Integer noteEvaluation) {
		super();
		this.id = id;
		this.dateAction = dateAction;
		this.voieAction = voieAction;
		this.dateSoumission = dateSoumission;
		this.dateAnnulation = dateAnnulation;
		this.dateCloture = dateCloture;
		this.noteEvaluation = noteEvaluation;
	}

	@Override
	public String toString() {
		return "Demande [id=" + id + ", dateAction=" + dateAction + ", voieAction=" + voieAction
				+ ", dateSoumission=" + dateSoumission + ", dateAnnulation=" + dateAnnulation + ", dateCloture="
				+ dateCloture + ", noteEvaluation=" + noteEvaluation + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Ville getVille() {
		return ville;
	}

	public void setVille(Ville ville) {
		this.ville = ville;
	}

	public LocalDate getDateAction() {
		return dateAction;
	}

	public void setDateAction(LocalDate dateAction) {
		this.dateAction = dateAction;
	}

	public String getVoieAction() {
		return voieAction;
	}

	public void setVoieAction(String voieAction) {
		this.voieAction = voieAction;
	}

	public LocalDate getDateSoumission() {
		return dateSoumission;
	}

	public void setDateSoumission(LocalDate dateSoumission) {
		this.dateSoumission = dateSoumission;
	}

	public LocalDate getDateAnnulation() {
		return dateAnnulation;
	}

	public void setDateAnnulation(LocalDate dateAnnulation) {
		this.dateAnnulation = dateAnnulation;
	}

	public LocalDate getDateCloture() {
		return dateCloture;
	}

	public void setDateCloture(LocalDate dateCloture) {
		this.dateCloture = dateCloture;
	}

	public Integer getNoteEvaluation() {
		return noteEvaluation;
	}

	public void setNoteEvaluation(Integer noteEvaluation) {
		this.noteEvaluation = noteEvaluation;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Activite getActivite() {
		return activite;
	}

	public void setActivite(Activite activite) {
		this.activite = activite;
	}

	public Heure getHeureDebut() {
		return heureDebut;
	}

	public void setHeureDebut(Heure heureDebut) {
		this.heureDebut = heureDebut;
	}

	public Minute getMinuteDebut() {
		return minuteDebut;
	}

	public void setMinuteDebut(Minute minuteDebut) {
		this.minuteDebut = minuteDebut;
	}

	public Heure getHeureFin() {
		return heureFin;
	}

	public void setHeureFin(Heure heureFin) {
		this.heureFin = heureFin;
	}

	public Minute getMinuteFin() {
		return minuteFin;
	}

	public void setMinuteFin(Minute minuteFin) {
		this.minuteFin = minuteFin;
	}

	public MotifAnnulation getMotifAnnul() {
		return motifAnnul;
	}

	public void setMotifAnnul(MotifAnnulation motifAnnul) {
		this.motifAnnul = motifAnnul;
	}

	public TypeFinalisation getFinaleDemande() {
		return finaleDemande;
	}

	public void setFinaleDemande(TypeFinalisation finaleDemande) {
		this.finaleDemande = finaleDemande;
	}

	public ProbDemande getProbDemande() {
		return probDemande;
	}

	public void setProbDemande(ProbDemande probDemande) {
		this.probDemande = probDemande;
	}

	public Set<ReponseAction> getReponseAction() {
		return reponseAction;
	}

	public void setReponseAction(Set<ReponseAction> reponseAction) {
		this.reponseAction = reponseAction;
	}



}