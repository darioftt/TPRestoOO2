package datos;

public class SubRubro {
	private int idSubRubro;
	private String subRubro;
	
	public SubRubro() {}

	public SubRubro(int idSubRubro, String subRubro) {
		super();
		this.idSubRubro = idSubRubro;
		this.subRubro = subRubro;
	}

	public int getIdSubRubro() {
		return idSubRubro;
	}

	public void setIdSubRubro(int idSubRubro) {
		this.idSubRubro = idSubRubro;
	}

	public String getSubRubro() {
		return subRubro;
	}

	public void setSubRubro(String subRubro) {
		this.subRubro = subRubro;
	}

	@Override
	public String toString() {
		return "SubRubro [idSubRubro=" + idSubRubro + ", subRubro=" + subRubro + "]";
	}
	
}
