# vnv – Verleihen, Dienstleistungen, verschenken
# Use-Case Specification: delete friend


## 1. Use-Case Name 
### 1.1 Brief Description
The use case allows the user to delete a friend. To operate this use case, the user first has to navigate to the list of friends. 
Afterwards he can click a button in the list of to delete the selected friend.
If the friend is deleted, he is not shown in the list anymore. 

## 2. Flow of Events
### 2.1 Basic Flow 
UML Diagram: 

![UML][]

### 2.2 Mock-Up
Mock-Up:

![Mock][]

### 2.3 .feature file

![feature][]


## 3. Special Requirements
### 3.1 Both users are friends
A friend can only be deleted if both users are in a relationship as friends in system.

## 4. Preconditions
### 4.1 Successful login 
The user has to be logged in to be able to delete a friend.

## 5. Postconditions
### 5.1 Save request
The system needs to delete the relationship in database. 
### 5.2 Notificate deleted friend  
The deleted user will achieve a notification about the deleted relationship.

## 6. Extension Points
n/a

<!-- picture links -->
[UML]: https://raw.githubusercontent.com/WMerk/VnVProject/master/doc/use%20cases/UML%20-%20delete%20friend.png "UML Diagram"
[Mock]: https://raw.githubusercontent.com/WMerk/VnVProject/master/doc/mockups/DeleteFriend/Mockup_DeleteFriend.png "Mock-Up"
[feature]: https://raw.githubusercontent.com/WMerk/vnvDoc/master/doc/feature/deleteFriend.PNG "Feature file"
