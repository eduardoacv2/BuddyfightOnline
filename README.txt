README:

This is a work in progress. The following are the current requirements of the project and may be updated as it progresses.

Future Card Buddyfight Simulator Checklist and Schedule
Tentative Program Name:
Document created: September 15, 2014
Phase I: Game Abstraction – Estimated time to completion: 1 month
1)	Game components
a.	Deck functions and object.
i.	Test case for shuffler. 
b.	Drop zone functions and object.
c.	Gauge functions and object.
d.	Hand functions and object.
e.	Card Zone functions and objects.
f.	Life Counter functions and object.
g.	RPS functions and object.
h.	Test cases for functions and debugging.
2)	Game Board
a.	Create abstract game board out of components. 
b.	Create functions for certain zone interactions.
c.	Test case for game board interactions.
3)	Deck Builder
a.	Create functions to build deck.
i.	System verifies for minimum of 52 cards.
ii.	System verifies for pre-designated flag card.
iii.	System asks for pre-designated buddy card.
iv.	System checks for max. of 4 copies of card.
b.	Deck saving and loading.
i.	Saves with a non-repeatable name.
ii.	System saves one active deck.
iii.	Test case for system.
4)	Sideboard
a.	Sideboard object and function.
Phase II: Displays and Windows (Interface for abstract elements) 
– Estimated time to completion: 1 month
1)	Main Menu
a.	Open up program window. (main program)
b.	Create direction functions.
c.	Display functions in window:
i.	Proportions must be fixed.
ii.	Gives access to the following windows:
1.	Deck builder.
2.	Host Game.
3.	Join Game.
4.	Spectate Game.*
iii.	Create listeners for function input (buttons).
d.	Test functionality.
2)	Deck Builder
a.	Displays the functions of DeckBuilder class.
b.	Displays the contents of DeckBuilder class.
c.	Create listeners for function input (buttons).
d.	Test functionality.
3)	Host Game
a.	Display shows active deck.
b.	Display allows you to change active deck.
c.	Display asks you for port no.
d.	Program waits for challenger (network).
4)	Join Game
a.	Display shows active deck.
b.	Display allows you to change active deck.
c.	Display asks you for IP address and port.
d.	Program attempts to connect to host (network).
5)	Spectate Game*
a.	Display asks you for IP address and port.
b.	Program attempts to connect to host (network).
6)	Test
a.	Opens up two GameBoard objects for one to test decks. Will prompt for a saved deck to open in the second board.
7)	Game Board
a.	Ensure each component is visualized in the board.
b.	Animations for shuffling and transactions.*
c.	Listeners for each transaction function in board.
d.	Open small pop-up window for RPS function.
i.	Displays three alternatives for each player.
ii.	Highlight chosen option when both are done.
iii.	Game board listens for exit.
e.	Open up new pop-up window for deck.
i.	Interrupt all listeners outside this window.
1.	Make board listen for exit function.
ii.	Listener for all deck transaction functions.
iii.	Make certain zones listen for input for certain functions. 
1.	Overlay with input listener over exit prompt.
iv.	Use shuffle function on closing deck window.
f.	Open up small pop–up window for soul stack.
i.	Interrupt all listeners outside this window.
1.	Make board listen for exit function.
ii.	Listener for all Card Zone (soul) transactions.
g.	Open up new pop-up window for drop zone.
i.	Make board listen for exit function.
ii.	Make certain zones listen for input for certain functions. 
1.	Overlay with input listener over exit prompt.
h.	Make sure all zones listen for display prompt on mouse hover.
i.	Open up prompt before game, asking to sideboard.
i.	If option no is chosen, proceed to game.
ii.	If option yes is chose, open window to sideboard.
Phase III: Network (Hosting and client software)
– Estimated time to completion: 1.5 months
1)	Client-host connectivity.
2)	Ensure player’s card zones can only be altered by their player.
3)	Ensure opponent board updates after a change in player’s board.
4)	Chat section.*
5)	Ensure entire board updates on change for spectator.*

* These requirements are desirable, and if implemented, they will most likely be done after the essential requirements are completed.
- Requirements in green are already completed.

Completed:
	Phase 1: Shuffler is tested and working.
Current: 
	Phase 1: Every function in abstraction.
Immediately followed by:
	Phase 1: Test case for functions to complete Phase 1 and proceed to Phase 2.


Phase 1 – Abstract Board (ETTC- 1 month)
-	Started: September 13, 2014
-	Ended: 
-	Estimated End: October 12, 2014
-	Difference in days: 
Phase 2 – Interfaces (ETTC- 1 month)
-	Started: 
-	Predicted Start: October 13, 2014
-	Estimated End: November 12, 2014
-	Estimated End by to actual start: 
-	Ended: 
-	Difference to initial predicted end:
-	Difference to new predicted end:
Phase 3 – Network and Connectivity (ETTC-1.5 months)
-	Started: 
-	Predicted Start: November 13, 2014
-	Estimated End: December 28, 2014
-	Estimated End by actual start: 
-	Ended: 
-	Difference to initial predicted end:
-	Difference to new predicted end:
