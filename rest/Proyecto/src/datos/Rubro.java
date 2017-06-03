package datos;

import java.util.ArrayList;
import java.util.List;

public class Rubro {
	private int idRubro;
	private String rubro;
	private List<SubRubro> lstSubRubro = new ArrayList<SubRubro>();
	
	public Rubro() {}

	public Rubro(int idRubro, String rubro, List<SubRubro> lstSubRubro) {
		super();
		this.idRubro = idRubro;
		this.rubro = rubro;
		this.lstSubRubro = lstSubRubro;
	}

	public int getIdRubro() {
		return idRubro;
	}

	public void setIdRubro(int idRubro) {
		this.idRubro = idRubro;
	}

	public String getRubro() {
		return rubro;
	}

	public void setRubro(String rubro) {
		this.rubro = rubro;
	}

	public List<SubRubro> getLstSubRubro() {
		return lstSubRubro;
	}

	public void setLstSubRubro(List<SubRubro> lstSubRubro) {
		this.lstSubRubro = lstSubRubro;
	}

	@Override
	public String toString() {
		return "Rubro [idRubro=" + idRubro + ", rubro=" + rubro + ", lstSubRubro=" + lstSubRubro.toString() + "]";
	}
	
}
