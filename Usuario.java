package ProyectoIdes;

public  class Usuario {
	
	public static int Id_Usu;
	private String nom_usu,ape_usu,cor_usu,con_usu;
	public Usuario(int Id_Usu,String nom_usu,String ape_usu,String cor_usu, String con_usu) {
		this.Id_Usu=Id_Usu;
		this.nom_usu=nom_usu;
		this.ape_usu=ape_usu;
		this.cor_usu=cor_usu;
		this.con_usu=con_usu;
		
	}
	public int getId_Usu() {
		return Id_Usu;
	}
	public void setId_Usu(int id_Usu) {
		Id_Usu = id_Usu;
	}
	public String getNom_usu() {
		return nom_usu;
	}
	public void setNom_usu(String nom_usu) {
		this.nom_usu = nom_usu;
	}
	public String getApe_usu() {
		return ape_usu;
	}
	public void setApe_usu(String ape_usu) {
		this.ape_usu = ape_usu;
	}
	public String getCor_usu() {
		return cor_usu;
	}
	public void setCor_usu(String cor_usu) {
		this.cor_usu = cor_usu;
	}
	public String getCon_usu() {
		return con_usu;
	}
	public void setCon_usu(String con_usu) {
		this.con_usu = con_usu;
	}

}
