#vnv – Verleihen, Dienstleistungen, verschenken
#Use-Case Specification: Create new offer


## 1. Use-Case Name 
### 1.1 Brief Description
The use case allows the user to create a new offer. He can name it, choose a category and add a picture and a short description. After submitting all friends connected to the user have the possibility to see, commit or consume the new offer. 


## 2. Flow of Events
### 2.1 Basic Flow 
UML Diagram: 
![UML][]

Mock-Up:
tbd


## 3. Special Requirements
### 3.1 Existing Social Network
Without having any friends vnv will have no added value. Only friends are able to see and consume your entries.
## 4. Preconditions
### 4.1 Successful login 
The user has to be logged in to be able to create an offer.


## 5. Postconditions
### 5.1 Save offer
The database must save the new offer. The new offer must be reachable for the other registered vnv users, therefore the new offer must be added to an available list of entries. 
## 6. Extension Points
n/a

<!-- picture links -->
[UML]: https://raw.githubusercontent.com/WMerk/VnVProject/master/doc/use%20cases/UML%20-%20create%20new%20offer%20(verleihen).png "UML Diagram"
