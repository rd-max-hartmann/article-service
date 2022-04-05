# Bewerberaufgabe Artikel Service

## Aufgabe ##
Für unsere Partner wollen wir eine API für Artikel bereitstellen, mir der man Artikel erstellen, suchen und löschen kann. Die API soll mit einer Spring Boot Anwendung umgesetzt werden. 

Im Repo diesem Repo ist eine "Basis Spring Boot App", die erweitert werden muss. Die Idee ist, die Daten einfach in einer Json-Datei abzulegen. Die Datei "article-db.json.template" enthält eine Beispieldatei der DB. Es existiert nur eine "Controller-Klasse" und zwei Test-Klassen (Unit und Integration-Test), in der Java-Doc Kommentare zur Hilfe enthalten sind.

### Akzeptanzkriterien:
* Artikel können erstellt werden
* Artikel können gelöscht werden
* Artikel können mit dem Namen gesucht werden

### Nicht-funktionale Anforderung:
* Die Anwendung enthält Tests
* Es existiert ein einfaches Fehler Handling
  * z.B. wie wird mit nicht existierenden Artikeln umgegangen? 
* Die Anwendung wird mit Maven gebaut
* Die Anwendung sollte einen Health-Check enthalten
* für die Anwendung wird ein Docker Image erstellt (optional)

Ansonsten bist Du in der Umsetzung der App frei! Erstelle gerne weitere Klassen und füge Libraries hinzu, wenn du das für sinnvoll hälst.

Viel Spaß
