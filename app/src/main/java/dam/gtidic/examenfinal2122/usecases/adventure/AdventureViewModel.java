package dam.gtidic.examenfinal2122.usecases.adventure;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import dam.gtidic.examenfinal2122.utils.PreferencesProvider;

public class AdventureViewModel extends ViewModel {


    private  MutableLiveData<Integer> vides;

    public AdventureViewModel(){

        this.vides = new MutableLiveData<>();

    }

    public MutableLiveData<Integer> getVides() {
        return vides;
    }

    public void setVides(MutableLiveData<Integer> vides) {
        this.vides = vides;
    }

    public void sumarvida() {

        Integer lifes= vides.setValue(PreferencesProvider.providePreferences().getInt("vides", vides +1 ));

    }
}

