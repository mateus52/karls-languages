import java.util.ArrayList;
import java.util.List;

public class LanguageList {
    private final List<String> languages = new ArrayList<>();

    public boolean isEmpty() {
        if(languages.isEmpty())
            return true;
        return false;
    }

    public void addLanguage(String language) {
        languages.add(language);
    }

	public void removeLanguage(String language) {
		languages.remove(language);
	}

	public String firstLanguage() {
		String language = languages.get(0);
		return language;
	}

	public int count() {
		int itens = languages.size();
		return itens;
	}

	public boolean containsLanguage(String language) {
		if (languages.contains(language))
			return true;
		return false;
	}

    public boolean isExciting() {
       if(languages.contains("Java") || languages.contains("Kotlin")) 
           return true;
        return false;
}
}
