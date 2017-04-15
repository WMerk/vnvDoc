# vnv – Verleihen, Dienstleistungen, verschenken
# Use-Case Specification: List received friend requests


## 1. Use-Case Name 
### 1.1 Brief Description
The use case allows the user accept it's received friend requests. To operate this use case, the user has to be logged in and list his requests (see [UC List received friend requests] (UC_ListReceivedFriendRequests.MD)). 
Afterwards he can click a button and accept the received requests.

## 2. Flow of Events
### 2.1 Basic Flow 
UML Diagram: 

![UML][]

### 2.2 Mock-Up
Mock-Up:

![Mock][]


## 3. Special Requirements
### 3.1 Both users are registered
Both users have to be registered in vnv.

## 4. Preconditions
### 4.1 Successful login 
The user has to be logged in to be able to add a friend. It also has to list his received friend requests first. This use case is descripted [here] (UC_ListReceivedFriendRequests.MD).

## 5. Postconditions
### 5.1 Save Acceptance
The system has to save the acceptance. Therefore the "friend request" relationship has to be changed into a "friends" relationship.
### 5.2 Notify friend
The user who sent the request might be notified about this acceptance.

## 6. Extension Points
n/a

<!-- picture links -->
[UML]: https://raw.githubusercontent.com/WMerk/VnVProject/master/doc/use%20cases/UML%20-%20AcceptFriendRequests.png "UML Diagram"
[Mock]: https://raw.githubusercontent.com/WMerk/VnVProject/master/doc/mockups/AcceptFriendRequests/Mockup_AcceptFriendRequests.png "Mock-Up"
