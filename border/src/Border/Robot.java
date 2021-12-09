package Border;

public class Robot implements Identifiable {

	private String id;
	private String model;

	public Robot(String model, String id) {
		super();
		this.id = id;
		this.model = model;
	}

	public String getModel() {
		return model;
	}

	@Override
	public String getId() {
		// TODO Auto-generated method stub
		return id;
	}

}
