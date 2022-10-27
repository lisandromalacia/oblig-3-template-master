# Obligatorisk oppgave 3 i Algoritmer og Datastrukturer

Denne oppgaven er en innlevering i Algoritmer og Datastrukturer. 
Oppgaven er levert av følgende student:
* Soban Ali , s362045 , s362045@oslomet.no


# Oppgavebeskrivelse

I oppgave 1 så gikk jeg frem ved å følge oppgave 5.2.3 a) i kompendiet, jeg startet med å lage Objects.requireNonNull. Er ikke veldig mye mer jeg kan si enn at jeg fulgte eksemple definerte P og Q, og så lagde hjelpevariabel. Så lagde jeg en while løkke som fortsetter til p er ute av treet. Så lagde jeg ny node, og lagde if statements hvor p blir rotnode. Antall økes og statement returneres sant ved vellyket innlegging. 

I oppgave 2 så brukte jeg oppgave 2 i avsnitt 5.2.6 sitt løsningsforslag i kompendiet som inspirasjon. Hvis verdien ikke er i treet skal den returnere 0, så jeg startet med å skrive den if-setningen. Etter det skrev jeg hjelpevariabel og brukte p. Så måtte jeg ha en int som skulle være 0, og kalte den for teller. (Den blir returnert senere). Etter det skrev jeg while løkke for når p ikke er lik null skal vi finne hvor mange forekomster av verdi i treet.

I oppgave 3 slet jeg mest. Her var det litt vanskelig å finne eksempler som kunne hjelpe meg ettersom det var ikke så mye oppgaver relatert med postorden, men jeg fant en kildekode som hadde førstePostorden oppgaven. Ref: https://www.cs.hioa.no/~ulfu/appolonius/kildekode/BinTre.html
Her gjorde jeg ganske likt som oppgaven og skrev while løkke med if setninger for p.venstre ikke er lik = null, p.høyre ikke er lik null, ellers skal den returneres. I nestepostorden slet jeg litt, fordi det kom opp en feilmelding 3c) eller 3d) at det var noe feil med tostring() eller legginn() så jeg prøvde fikse på det, men det viste seg at det ikke var noe feil med de legginn(), men heller med if-setningene mine, så jeg dro på campus og fikk hjelp på øving og fikk det ordnet.

I oppgave 4 fulgte jeg samme lenke som i oppgave 3) og oppgave 5.1.7 g) var også til hjelp. I postorden skrev jeg først en hjelpevariabel, så whileløkke for når førstepostorden ikke er lik null, og fulgte egentlig hva oppgaven spør om. I  postordenrecursive så hvis p er lik null skal dette statement returneres, også skrev jeg kode for å utføre oppgaven.

