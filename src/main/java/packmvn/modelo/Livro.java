package packmvn.modelo;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Livro {

	private int id;
	private String nome, descricao, editora;
	private Autor autor;
	private Image image;
	private ImageIcon imageIcon;
	private String imageURL;

	public Livro(String nome, String descricao, String editora, Autor autor, String imgURL) {
		this.nome = nome;
		this.descricao = descricao;
		this.editora = editora;
		this.autor = autor;
		this.imageURL = imgURL;
	}
	
	public Livro(String nome, String descricao, String editora, Autor autor, ImageIcon imgURL) {
		this.nome = nome;
		this.descricao = descricao;
		this.editora = editora;
		this.autor = autor;
		this.image = imgURL.getImage();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public Image getImage() {
		return image;
	}

	public void setImage(Image image) {
		this.image = image;
	}

	public ImageIcon getImageIcon() {
		return imageIcon;
	}

	public void setImageIcon(ImageIcon imageIcon) {
		this.imageIcon = imageIcon;
	}

	public String getImageURL() {
		return imageURL;
	}

	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}
	
	

}
