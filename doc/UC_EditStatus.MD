# vnv – Verleihen, Dienstleistungen, verschenken
# Use-Case Specification: Edit Status


## 1. Use-Case Name 
### 1.1 Brief Description
The use case allows the user to edit the status of his offers and requests. To operate this use case, the user first has to log in to vnv website. 
Possible status values for a "Verleihen" offer might be: "Verfügbar", "Verliehen", "Zurückgegeben".
All the status values are defined by implementation.

## 2. Flow of Events
### 2.1 Basic Flow 
UML Diagram: 

![UML][]

### 2.2 Mock-Up
Mock-Up:

![Mock][]

## 3. Special Requirements
### 3.1 User is registered
The user has to be registered in vnv.

## 4. Preconditions
### 4.1 vnv website 
The user has to be logged in the vnv website.

## 5. Postconditions
### 5.1 Update offer / request
The system needs to save the update of the status of the offer / request in the database. 
### 5.2 Display changes
After successfully updating the status, the user is able to see the change.

## 6. Extension Points
n/a

<!-- picture links -->
[UML]: https://raw.githubusercontent.com/WMerk/VnVProject/master/doc/use%20cases/UML%20-%20edit%20status.png "UML Diagram"
[Mock]: https://raw.githubusercontent.com/WMerk/VnVProject/master/doc/mockups/EditStatus/Mockup_EditStatus.png "Mock-Up"
