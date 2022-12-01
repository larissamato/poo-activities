public class Pc {

	private Teclado teclado;
	private WebCam webcam;
	
	public Pc(Teclado teclado) {
		if(teclado == null){
			throw new NullPointerException("Teclado não pode estar vazio.");
		}
		this.teclado = teclado;
	}
	public Pc(Teclado teclado, WebCam webcam) {
		if(teclado == null){
			throw new NullPointerException("Teclado não pode estar vazio.");
		}
		this.teclado = teclado;
		this.webcam = webcam;
	}
	
	public boolean trocar_teclado(Teclado teclado) {
		if(teclado == null) { return false; }
		this.teclado = teclado;
		return true;
	}
	
	public void remover_webcam() {
		this.webcam = null;
	}
	public boolean add_webcam(WebCam webcam) {
		if(webcam == null || this.webcam != null ){ return false; }
		this.webcam = webcam;
		return true;
	}
	public boolean trocar_webcam(WebCam webcam) {
		if(webcam == null) { return false; }
		this.webcam = webcam;
		return true;
	}
	
	public String toString() {
		String message = "[ Teclado: " + this.teclado.toString();
		if(this.webcam != null) {
			message += "; WebCam: " + this.webcam.toString();
		}
		message += " ]";
		return message;
	}
	
}
