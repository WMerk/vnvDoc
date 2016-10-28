#vnv – Verleihen, Dienstleistungen, verschenken
#Use-Case Specification: Add friend


## 1. Use-Case Name 
### 1.1 Brief Description
The use case allows the user to add a new friend. To operate this use case, the user first has to search for his new friend. 
Afterwards he can click a button on the list of his search result to add the selected person as a new friend.
If the request is accepted, they are able to interact with each other.

## 2. Flow of Events
### 2.1 Basic Flow 
UML Diagram: 
![UML][]

Mock-Up:
tbd


## 3. Special Requirements
### 3.1 Both users are registered
A new friend can only be added if both users are registered to the system. If not, a registered user can invite his friend to become a user of vnv.

## 4. Preconditions
### 4.1 Successful login 
The user has to be logged in to be able to add a friend.
### 4.2 Successful search
To add a new friend, a search for his name or mail address has to be done. Afterwards, the system will show the search result in a list view.

## 5. Postconditions
### 5.1 Save request
The system needs to save the friend request in the database. 
### 5.1 Notificate requested friend 
The requested user will achieve a notification about the new friend request. He then has the options to accept or refuse the request.
### 5.1 Update status
When the requested user has accepted the request, both users will appear in the friends list of each other. After that they are able to see the requests and offers of their new friend.
If the request is refused, it will be removed from the database.

## 6. Extension Points
n/a

<!-- picture links -->
[UML]: 
