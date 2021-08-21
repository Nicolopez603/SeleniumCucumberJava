package pages;

import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class ListPage extends BasePage{

    private String searchField = "//body/form[1]/input[1]";
    private String searchResults = "name";

    public ListPage(){
        super (driver);
    }

    public void navigateToListPage(){
        navigateTo("https://andreidbr.github.io/JS30/06AjaxTypeAhead/index.html");
    }

    public void enterSearchCriteria(String state) throws InterruptedException{
        Thread.sleep(600); //this is a special case, not is a good practice an thread.sleep in the code
        write(searchField, state);
    }

    public List<String> getAllSearchResults(){
        List<WebElement> list = bringMeAllElements(searchResults);
        List<String> stringsFromList = new ArrayList<String>();
        for (WebElement e:list){
            stringsFromList.add(e.getText());
        }
        return stringsFromList;
    }

}
