# Rapidclipse Demo: Using localization within a Project

This demo project shows the handling of multiple languages within the UI. See following detailed informations:
1. How to localize normal UI elements like XdevButtons, XdevTextFields, XdevLabels
2. How to localize XdevTableHeader or how to use localization in entities
3. How to localize dynamic messages and notifications
4. How to keep localization after click on browser refresh
5. The most common naming strategies and patterns
6. The most common resource file structure

### Get the Projekt running 
1. Clone the GIT Reporsitory or use the import function of RapiClipse
2. File -> Import -> RapidClipse -> Demo Projects -> "rapidclipse-demo-localizedUI"
2. Maybe do some Maven updates to remove project errors 
3. Start the Project

### Important files

###### 'MainView'
At the MainView you will see serveral UI Elements like Buttons, Textfields and also a MenuBar. Just select one of these elements and you will see that some attributs like 'Caption' or 'Text' is filles with content that looks like the following
```sh
{$btnLanguageGerman} or {$menuData.text}
```
or in the Code, there are some lines like the following
```sh
this.btnLanguageGerman.setCaption(StringResourceUtils.optLocalizeString("{$btnLanguageGerman.caption}", this));
```
This pattern is the basic indicator for the RapidClipse framework to get the real value from a resource file.

##### Resource files 'Customer_de.properties' or 'MainView_de.properities'
Some important informations about the ressource files:

1. The resource files have to has the same name like the supported UI File e.g. MainView -> MainView_de.properties
2. The second part of the resource file name is the language indicator '_de' for German or '_en' -> English.
3. The resource file has to be in the same folder / package like the supported UI File

The contend of the resource files is quite simple:

```sh
btnSave.caption = Speichern
txtName.caption = Vorname
lbldescription.value = Beschreibung
```
Left side = **name** of the variable, right side = **value** of the variable

Naming strategies for resource files:

| Example Name | Range |
| ------ | ------ |
| MainView_de.properies | A resource file exclusive for the specified file in this case the 'MainView'. |
| CustomerUI_de.properies | If 'CustomerUI' is a JavaPackage then the resource file is related to the whole Package and all files in it. In this case the resourcefile should be part of the parent folder of the related one. |
| rapidclipse-demo-localizedUI_de.properies | If 'rapidclipse-demo-localizedUI' is the projectname the resourcefile is related to the whole project. In this case the resource file should be in the resource folder. |

### How to use localization without any UI element e.g. Notifications
see 'MainView'
```sh
StringResourceUtils.optLocalizeString("{$btnMessage.message}", this)
```

### How to change language for the current session
see 'MainView'
```sh
//Changes the language for the current session
UI.getCurrent().setLocale(Locale.ENGLISH);
//Save the current language to the current session
UI.getCurrent().getSession().setAttribute(Locale.class, Locale.ENGLISH);
//Navigates to the itself. Best way to refresh the UI
Navigation.to("").navigate();
```

### How set the language for the whole application for every user
```sh
//Changes the language for the whole application
Locale.setDefault(Locale.ENGLISH);
```
