package ozyozyo.com.testproject.animal.realm;

import io.realm.RealmObject;
import io.realm.annotations.Ignore;
import io.realm.annotations.PrimaryKey;

public class Dog extends RealmObject {

	@PrimaryKey
	private String id;
	private String name;

	private int dogTypeOrdinal;

	@Ignore
	private boolean isHaveBreakfast;

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getDogTypeOrdinal() {
		return dogTypeOrdinal;
	}

	public boolean isHaveBreakfast() {
		return isHaveBreakfast;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDogTypeOrdinal(int dogTypeOrdinal) {
		this.dogTypeOrdinal = dogTypeOrdinal;
	}

	public void setIsHaveBreakfast(boolean isHaveBreakfast) {
		this.isHaveBreakfast = isHaveBreakfast;
	}
}
