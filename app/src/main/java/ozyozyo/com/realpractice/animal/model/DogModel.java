package ozyozyo.com.testproject.animal.model;

import android.content.Context;

import java.util.UUID;

import io.realm.Realm;
import io.realm.RealmResults;
import ozyozyo.com.testproject.animal.entity.DogType;
import ozyozyo.com.testproject.animal.realm.Dog;

public class DogModel {
	public static void addDog(Context context) {
		Realm realm = Realm.getInstance(context);
		realm.executeTransaction(new Realm.Transaction() {
			@Override
			public void execute(Realm realm) {
				Dog dog = realm.createObject(Dog.class);
				dog.setId(UUID.randomUUID().toString());
				dog.setName("yuukun");
				dog.setDogTypeOrdinal(DogType.TOY_POODLE.ordinal());
				dog.setIsHaveBreakfast(false);
			}
		});
	}

	public static RealmResults<Dog> fetchAll(Context context) {
		Realm realm = Realm.getInstance(context);
		return realm.where(Dog.class).findAll();
	}

	public static RealmResults<Dog> fetchByName(Context context, String name) {
		Realm realm = Realm.getInstance(context);
		return realm.where(Dog.class).equalTo("name", name).findAll();
	}
}
