Dette repositoriet inneholder Hello World-prosjektet som er del av installasjons-oppgaven første uken i INF101 Vår 2020 ved UiB.

# Oppsett av Java og Eclipse integrert utviklingsmiljø (IDE)

_Dette dokumentet beskriver hvordan du installerer programvaren du trenger for INF101 - vår 2020._

Målet med denne guiden er å installere

- [Java](#installere-java)
- [Eclipse](#Eclipse)
- [git](#git)

**Du er ferdig når du har opprettet og kjørt HelloWorld.java fra et terminalvindu og [Hello World prosjektet](https://github.com/annaei/INF101V20) i Eclipse, og JUnit testene i Eclipse er grønne (passerer)**.

## 1) Installere Java

Vi bruker [Java](<https://en.wikipedia.org/wiki/Java_(programming_language)>) 13 i kurset. Sjekk om du har Java installert ved å gå til et terminalvindu og skrive `java -version`. Dersom du har Java installert vil du få vite hvilken versjon. Dersom du får `command not found` eller tilsvarende, eller en lavere versjon enn Java 13 (f.eks. 8 eller 9) må du installere nyeste versjonen.

```
> java -version
command not found: java
```

[Klikk her for å laste ned og installere Java 13](https://www.oracle.com/technetwork/java/javase/downloads/jdk13-downloads-5672538.html). Aksepter lisensen, og velg riktig installasjonsfil for ditt operativsystem. Spør gruppeleder om hjelp dersom du sitter fast.

Når du er ferdig med installasjonen kan du kjøre `java -version` kommandoen igjen, og sjekke at versjonen er riktig.

```
> java -version
openjdk 13.X.Y
```

✅ Når `java -version` kommandoen gir en versjon over 13 kan du gå videre.

### Troubleshooting

- Dersom terminalvinduet ikke forstår kommandoen (command not found eller lignende) etter Java er installert, kan du prøve å starte et nytt terminalvindu og se om det fungerer der.
- Dersom den fortsatt ikke forstår kommandoen (command not found), kan det være at Java ikke har blitt lagt riktig til i det som heter Path-variabelen. I så fall ligger Java fysisk på maskinen, men terminalen vet ikke hvor. Dette problemet er vanligst på Windows maskiner: Finn ut hvor på maskinen Java har blitt installert (ofte `C:\Programfiler\Java\jdk1.13.0.1`). Sjekk at det ligger en mappe som heter `bin` i mappen. Høyreklikk Min Datamaskin -> Egenskaper -> Avanserte innstillinger -> Fanen Avansert -> Miljøvariabler -> under systemvariabler scroller du til linjen som heter Path og trykker på den -> Rediger -> Ny (linje) -> Lim inn filbanen til bin-mappen du nettopp fant -> Ok -> Ok. (Husk å åpne et nytt temrinalvindu etter du er ferdig).
- Det er ikke så farlig med hvilke tall du har for X og Y, eller om du bruker en annen distribusjon enn openjdk.

## Kjøre Java

### 2.1) Kjøre HelloWorld.java i et terminalvindu

Når du har installert Java kan du kjøre et javaprogram fra terminalen.

Lag en ny fil på en valgfri lokasjon, med et valgfritt _tekstredigeringsverktøy_ (f.eks. Notepad++, Text Edit, Atom eller Visual Studio Code), og navngi filen "HelloWorld.java". (Filnavnet skal **ikke** ende med .txt).

Inni filen kan du lime inn det følgende Java-programmet:

```java
public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("Hello World!");
	}
}

```

Fra terminalen kjører du HelloWorld.java ved å bruke kommandoen

```
> java HelloWorld.java
Hello World!
```

For å kjøre java-filen din fra terminalvinduet må du enten navigere dit den er, eller bruke fullstendig adresse. Det enkleste er ofte å navigere til riktig sted først. Hvis du prøver å kjøre den uten å være på riktig sted vil du få en feilmelding:

```
> java HelloWorld.java
Error: Could not find or load main class HelloWorld.java
Caused by: java.lang.ClassNotFoundException: HelloWorld.java
```

### Troubleshoothing

TextEdit vil ofte lage nye filer i RTF-format (tilsvarende som Word-filer). Når du skriver kode ønsker du å bruke _rene tekstfiler_. Gå til innstillinger i TextEdit og velg ren tekstfil, og opprett så en ny fil som du bruker herfra.

### 2.2) Kommandoer for terminal-navigering

I terminal-vinduet navigerer du ved hjelp av kommandoen `cd` etterfulgt av navnet på mappen du vil gå _inn i_, eller `..` dersom du vil gå _ut_ av mappen du er i.

`cd INF101` vil forsøke å navigere deg _inn i_ en mappe INF101 som ligger i mappen du er i. Hvis INF101 ikke finnes i mappen du er i, vil du typisk få feilmeldingen `cd: no such file or directory: INF101`.

`cd ..` vil forsøke å navigere deg _opp_ et nivå, ut av mappen du er.

`ls` for Mac/Linux og `dir` for Windows er en kommando for å liste opp alle filer og mapper i mappen du er i. Dette er nyttig for å se hvilke mapper og filer som finnes der.

✅ Når du får til å skrive ut `Hello World!` fra terminalen kan du gå videre.

#### Troubleshooting

NB: Disse to kommandoene vil ikke ødelegge, slette eller endre noe på PCen din. De er derfor trygge å eksperimentere med. Hvis du roter deg vekk i terminalen din kan du alltid bare lukke den og åpne en ny.

## 3) Eclipse

Vi bruker [Eclipse](<https://en.wikipedia.org/wiki/Eclipse_(software)>) IDE versjon 2019-12 til utvikling i dette kurset. Dersom du har Eclipse installert allerede må du sjekke hvilken versjon du har; tidligere versjoner vil ikke

[Klikk her for å laste ned og installere Eclipse IDE 2019-12](https://www.eclipse.org/downloads/packages/release/2019-12/r/eclipse-ide-java-developers). Velg ditt operativsystem under Download Links og kjør den nedlastede installasjons-filen. Windows-brukere som ikke er vant til å installere fra en .zip-fil kan trykke på fanen "Eclipse Installer" oppe til venstre og laste ned installeringsprogrammet til Eclipse i stedet.

**Du må installere Eclipse for Java Developers, ikke Java EE Developers, C/C++, etc.**

Velg riktig mappe for Java 13-installasjonen din før du trykker på INSTALL. Hvis du ikke ser Java 13 i nedtrekksmenyen kan du finne riktig mappe ved å gå til terminalen din og skrive kommandoen `which java` i Linux/Unix/Mac OS X eller `where java` i Windows.

Når du er ferdig å installere Eclipse kan du åpne den og velge et passende navn for ditt [workspace](https://www.eclipse.org/forums/index.php/t/447044/).

Når Eclipse allerede er åpen finner du versjons-informasjon i menyen under Eclipse -> About Eclipse for Mac og Help -> About Eclipse for Windows.

✅ Når du har åpnet Eclipse med versjon 2019-12 kan du gå videre.

### Troubleshooting

- IDE (Integrated Development Environment) betegner en teksteditor som er spesielt laget for å utvikle programmer, og inneholder funksjonalitet for å kjøre og teste koden. Eksempler på Java-IDEer er Eclipse, IntelliJ og Netbeans.
- Du kan ha flere Eclipse-versjoner på maskinen uten at de påvirker hverandre.
- Når du åpner Eclipse vil den spørre deg om å velge "[workspace](https://www.eclipse.org/forums/index.php/t/447044/)". Et workspace er en mappe der Eclipse ser etter tidligere åpna prosjekter og instillinger, og er uavhengig av Java. Du vil ikke trenge å levere inn ditt workspace eller Eclipse-instillinger.
- Dersom du ønsker å bruke [IntelliJ](https://www.jetbrains.com/idea/download) eller et annet IDE/editor program er det greit for oss. Oppgavene er Maven-baserte og vil fungere i de fleste IDEer. Vi kan imidlertid ikke love deg at gruppeledere eller foreleser kan hjelpe deg med ditt favoritt-IDE.

## 4) git

Vi bruker [git](https://en.wikipedia.org/wiki/Git) for å levere ut oppgavekode i dette kurset. Vi anbefaler at du bruker det når du koder selv for å sikre deg at du ikke mister det du har gjort. git er meget populært i næringslivet, og er et verktøy du får mye igjen for å lære deg skikkelig. Du vil heldigvis få mange anledninger til det i INF101.

Sjekk om du har git installert ved å skrive `git` i et terminalvindu. Dersom du har git installert vil du få `usage: git` og en oversikt over mulige argumenter. Dersom du får `command not found` eller tilsvarende må du installere git.

```
> git
command not found: git
```

[Klikk her for å laste ned og installere git](https://git-scm.com/downloads). Velg ditt operativsystem og kjør den nedlastede filen.

Når du er ferdig med installasjonen kan du kjøre `git` kommandoen igjen, og sjekke at du får oversikt over git kommandoer.

```
> git
usage: git [--version] [--help] [-C <path>] [-c name=value]
           [--exec-path[=<path>]] [--html-path] [--man-path] [--info-path]
           [-p | --paginate | --no-pager] [--no-replace-objects] [--bare]
           [--git-dir=<path>] [--work-tree=<path>] [--namespace=<name>]
           <command> [<args>]
```

✅ Når kommandoen `git` gir deg utskriften vist over kan du gå videre.

### Troubleshooting

## 5) Importere er prosjekt inn i Eclipse

### 5.1) Klone Hello World prosjekt fra GitHub repo

Du skal nå bruke git i terminalvinduet til å laste ned - eller klone - Java-prosjektet [Hello World project](https://github.com/annaei/INF101V20) fra Anna's Github. Et Java-prosjekt er ikke noe mer magisk enn en mappe med blant annet Java-filene og en POM-fil som beskriver prosjektet. Github er en av mange git-servere som gjør det enkelt for flere å samarbeide på et kodeprosjekt ved å bruke git (INF101 sin GitLab er en annen slik server som vi skal bruke mye i løpet av semesteret).

Når du kloner et prosjekt så hentes mappen med alle filene ned til din maskin. Klone-URLen er nesten den samme som til nettsiden (du finner også denne linken ved å trykke på den grønne "Clone"-knappen på Github-siden):

https://github.com/annaei/INF101V20.git

Naviger deg til en mappe du vil laste ned prosjektet til i et terminalvindu, og klon ved å bruke kommandoen

`> git clone https://github.com/annaei/INF101V20.git`

Når kloningen er ferdig må du sjekke at Java-prosjektet ligger i den mappen du befinner deg i. Bruk `ls` / `dir` og sjekk at det ligger en ny mappe "INF101V20" der. Bruk kommandoen `cd INF101V20/HelloWorld` for å navigere deg inn i prosjekt-mappen. Bruk kommandoen `ls` / `dir` igjen for å sjekke at filen `pom.xml` ligger i mappen.

#### Troubleshooting

- Når du kloner fra et git-repositorie så lastes filene ned over nettet. Du må derfor ha en aktiv internett-tilkobling.
- Filene vil lagres i mappen du befinner deg i når du skriver kommandoen.
- Google is your friend: for å finne ut av eventuelle rare feil er det lurt å copy-paste dem til Google og se hva slags løsninger andre foreslår.

### 5.2) Importere Hello World-prosjektet i Eclipse

Et IDE kan hjelpe oss å automatisk sette språk-versjoner og test-versjoner til det prosjektet trenger. Vi bruker filen `pom.xml` til å beskrive hvilken Java-versjon og JUnit-versjon Eclipse skal bruke for prosjektet vårt. For å få Eclipse til å lese instillingene fra pom-filen, må vi importere prosjektet som et _Maven-prosjekt_.

Finn menyen **Import** -> **Existing Maven Projects**.

_Root Directory_ skal peke til den mappen som `pom.xml` ligger i. Du kan sjekke hvilken mappe det var i terminalvinduet du brukte i 5.1. Når du finner riktig mappe i Eclipse sin import _wizard_ vil **/pom.xml** vises under **Projects:** og du kan huke av sjekkboksen for at du vil importere det og trykke **Next**.

Klikk deg gjennom menyen til prosjektet dukker opp i Eclipse i Project Explorer-vinduet. Dersom du ikke ser vinduet (eller med et uhell har krysset det vekk) kan du vise vinduet ved å trykke på Window -> Show View -> Package Explorer.

I package explorer kan du se hvilken Javaversion Eclipse linket til prosjektet. Der skal det vises Java 13. Spør en venn, Google, foreleser eller gruppeleder hvis det står en annen versjon enn 13, eller hvis filen din har røde kryss.

✅ Når prosjektet er importert som et Maven-prosjekt og vises i Package Explorer uten røde kryss eller feilmeldinger kan du gå videre.

### 5.3) Kjør Hello World-prosjektet i Eclipse

På samme måte som vi kjørte et Java-program i terminalen i 2.1, skal vi nå kjøre det klonede Java-programmet i Eclipse. Høyreklikk prosjektet i Package Explorer-vinduet. Trykk på **Run as** -> **Java application**. Finn _Consol_ i Eclipse: der skal det nå stå "Hello World!".

✅ Når du har fått "Hello World!" i konsollen i Eclipse kan du gå videre.

### 5.4) Kjør JUnit tester for Hello World-prosjektet i Eclipse

Det siste vi skal gjøre er å kjøre tester for prosjektet vårt. Vi bruker testrammeverket [JUnit](https://www.vogella.com/tutorials/JUnit/article.html), versjon 5. Du trenger ikke installere JUnit manuelt; pom-filen forteller Eclipse hvilken versjon prosjektet skal bruke.

Kjør testene ved å høyreklikke på prosjektet i Package Explorer-vinduet. Trykk på **Run as** -> **JUnit test**. Du vil få opp et JUnit View der de to testene vises som røde hvis de feiler er grønne hvis de passerer.

Sjekk at testene blir grønne (godkjent) i JUnit-vinduet.

_Valgfritt: Dobbelttrykk på en av testene for å åpne filen som testene ligger i (HelloWorldTest.java). Se om du klarer å omtrentlig forstå hva de to testene gjør._

✅ Når de to JUnit-testene kjører og er grønne er du ferdig med installasjonen!

#### Troubleshooting

Se om du finner ut av det sammen med en medelev eller Google. Eventuelt spør på gruppe.
