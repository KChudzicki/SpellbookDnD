# Chudzicki Krzysztof
 ## SpellbookDnD
Księga Czarów DnD to interaktywna aplikacja webowa stworzona specjalnie dla graczy gry fabularnej Dungeons and Dragons. Aplikacja umożliwia łatwe przeglądanie czarów dostępnychdla 
poszczególnych klas postaci.Po wejściu na stronę główną aplikacji, użytkownik jest witany interfejsem, który umożliwia wybór klasy postaci. Wybór ten determinuje, jakie czary zostaną wyświetlone na
kolejnej stronie. Aplikacja obsługuje szeroki wybór klas, takich jak czarodziej, kapłan, czarownik, paladyn, druid, bard itp.Po wybraniu klasy postaci, użytkownik jest przenoszony do strony z listą czarów dostępnych
dla danej klasy. Czary są uporządkowane zgodnie z ich poziomem, co ułatwia szybkie odnalezienie potrzebnego czaru w zależności od aktualnego poziomu postaci. Każdy czar jest opisany, zawierając informacje takie jak 
jego nazwa, opis, efekty, zasięg, czas rzucania, komponenty oraz wymagany poziom postaci, aby móc go używać. 
Technologie użyte w projekcie:
Java 17,
Maven,
Spring Boot,
Thymeleaf,
MSQL,



Uruchmianie aplikacji

1. Sklonowac repozytorum  do InteliJ. 
2. Przed uruchomieniem aplikacji nalezy uzupełnic dane połączenia z bazą danych  /src/main/resources/application.properties. nalezy uzupełnic nastepujące pola: db.name gdzie należy podac nazwe bazy danych, db.user gdzie należy podać swoją nazwe uzytkownika oraz db.pass gdzie należy podac swoje hasło.
3. Po wypełnieniu danych do połączenia, należy uruchomic aplkiacje "MySpellBookApplication".

Tworzenie tabel 

1.plik z kodem sql znajduje sie w folderze /src/main/resources/
2 tabele mozna utworzyc w aplikaci intelij po polaczeniu z baza danych, jak i mozna skopiowac kod oraz użyć do tego aplkacji np. microsoft sql server 

Poruszanie się po aplikacji 

1. Uruchomić w przeglądarce "//localhost:(numer portu na ktrórym została uruchomiona aplikacjia)".
2. Na stronie domowej należy wybrać klase postaci, poprzez klikniecie na obraz wybranej przz siebie klasy.
3. Wyszukanie czaru w tabeli.
4. Aby powrócić do strony domowej, należy kliknąc logo dungeons and dragons.

The DnD Spellbook is an interactive web application created specifically for players of the Dungeons and Dragons role-playing game. With this application, players are able to easily view and manage the spells available for each character class. Upon entering the application's home page, users are greeted with an interface that allows them to select a character class. This choice determines which spells are displayed on the next page. App supports a wide range of classes, such as wizard, priest, sorcerer, paladin, druid, bard, etc.After selecting a character class, the user is taken to a page with a list of spells available for that particular class. Spells are arranged according to their level, making them easier to find, depending on the current level of the character. Each spell is described, containing information including its name, description, effects, range, casting time, components and the required character level to use it. Technologies used to create the project are:
Java 17,
Maven,
Spring Boot,
Thymeleaf,
SQL Server.
