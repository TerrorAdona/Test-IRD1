public class SocieteSansFiliale extends Societe {
	public boolean ajouteFiliale(Societe filiale) {
		return false;
	}

	public double calculeCoetEntretien() {
		return nbrVehicules*coetUnitVehicule;
	}
}
