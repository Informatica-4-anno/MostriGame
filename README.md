# Mostri Game
Si supponga di avere delle carte da gioco. Ogni carta rappresenta un Personaggio che può essere di
tipo o Umano o Mostro. \
Un Personaggio di tipo Umano ha una forza fisica iniziale pari al numero 10 e può combattere, un
Personaggio di tipo Mostro, invece, ha una forza fisica iniziale pari a 15 e può azzannare.\
I Personaggi del gioco sono Eroe, Vampiro e Licantropo.
* Eroe è solo della categoria Umano,
* Vampiro è solo della categoria Mostro,
* Licantropo è di tipo Mostro nelle notti di luna piena, altrimenti di tipo Umano.

In particolare, la forza fisica dei personaggi diminuisce di un valore pari a:
* 3 per l’Eroe ad ogni combattimento
* 2 per il Vampiro ad ogni azzanno
* 2 per il Licantropo nelle notti di luna piena, 3 nelle altre.

Si dovranno definire tutte le classi e le interfacce necessarie per realizzare il gioco.

Si dovrà inoltre definire una classe principale che:
* istanzia tre oggetti: uno di tipo Eroe, uno di tipo Licantropo e uno di tipo Vampiro.
* Fa combattere tre volte l’Eroe
* Fa combattere una volta il Vampiro
* Fa combattere il Licantropo due volte.

Stampa al termine la forza fisica rimasta a ciascun personaggio.

### Suggerimento
usare:
* le interfacce per modellare i comportamenti
* le classi per modellare le entità concrete
  
Creare un diagramma UML delle classi che rappresenti la seguente descrizione:\
**Interfaccia Umano:** Definisce il comportamento comune ai personaggi umani. Metodo astratto
combatti().\
**Interfaccia Mostro:** Definisce il comportamento comune ai personaggi mostruosi. Metodo astratto
azzanna().\
**Classe astratta Personaggio:** Attributo comune: forza (gestisce la forza fisica del personaggio).\
      Metodi: getForza() e setForza() per leggere e aggiornare la forza.\
**Classi derivate:**
* Eroe: Implementa l'interfaccia Umano e il metodo combatti(). Riduce la forza di 3 punti per
ogni combattimento.
* Vampiro: Implementa l'interfaccia Mostro e il metodo azzanna(). Riduce la forza di 2 punti
per ogni azzanno.
* Licantropo: Implementa entrambe le interfacce (Umano e Mostro) con comportamenti
condizionati:

  Di notte:
    * Riduce la forza di 2 punti (come mostro).\
  Altrimenti:
    * Riduce la forza di 3 punti (come umano).

Metodo aggiuntivo isLunaPiena() per determinare il tipo di comportamento.\
**Classe principale:** La classe principale creerà gli oggetti e chiamerà i metodi richiesti, come descritto
