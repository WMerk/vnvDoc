![vnv][]
# Use-Case Specification: Create new request


## 1. Use-Case Name 
### 1.1 Brief Description
The use case allows the user to create a new request. He can name it, choose a category and a short description. After submitting all friends connected to the user have the possibility to see the new request and then response ot it. 


## 2. Flow of Events
### 2.1 Basic Flow 
#### 2.1.1 Verleihen
![UML1][]

#### 2.1.2 Verschenken
![UML2][]

#### 2.1.3 Dienstleistungen
![UML3][]

### 2.2 Mock-Ups
#### 2.2.1 Verleihen
![Mock1][]

#### 2.2.2 Verschenken
![Mock2][]

#### 2.2.3 Dienstleistungen
![Mock3][]

## 3. Special Requirements
### 3.1 Existing Social Network
Without having any friends vnv will have no added value. Only friends are able to see and consume your entries.
## 4. Preconditions
### 4.1 Successful login 
The user has to be logged in to be able to create a request.


## 5. Postconditions
### 5.1 Save offer
The database must save the new request. The new request must be reachable for the other registered vnv users, therefore the new request must be added to an available list of entries. 
## 6. Extension Points
n/a

<!-- picture links -->
[UML1]: https://raw.githubusercontent.com/WMerk/VnVProject/master/doc/use%20cases/UML%20-%20create%20new%20request%20(verleihen).png "UML Diagram"
[UML2]: https://raw.githubusercontent.com/WMerk/VnVProject/master/doc/use%20cases/UML%20-%20create%20new%20request%20(verschenken).png "UML Diagram"
[UML3]: https://raw.githubusercontent.com/WMerk/VnVProject/master/doc/use%20cases/UML%20-%20create%20new%20request%20(dienstleistungen).png "UML Diagram"
[Mock1]: https://raw.githubusercontent.com/WMerk/VnVProject/master/doc/mockups/CreateNewRequest/Mockup_Verleihen.png "Mock-Up"
[Mock2]: https://raw.githubusercontent.com/WMerk/VnVProject/master/doc/mockups/CreateNewRequest/Mockup_Verschenken.png "Mock-Up"
[Mock3]: https://raw.githubusercontent.com/WMerk/VnVProject/master/doc/mockups/CreateNewRequest/Mockup_Dienstleistung.png "Mock-Up"
[vnv]: https://raw.githubusercontent.com/WMerk/vnvDoc/master/logo/logo_wide_big.png "vnv logo"