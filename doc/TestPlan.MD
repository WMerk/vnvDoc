# vnv – Verleihen, Dienstleistungen, verschenken
# Test plan

## 1.	Introduction
### 1.1	Purpose
The purpose of the Iteration Test Plan is to gather all of the information necessary to plan and control the test effort for a given iteration. 
It describes the approach to testing the software.
This Test Plan for vnv supports the following objectives:
-	Identifies the items that should be targeted by the tests.
-	Identifies the motivation for and ideas behind the test areas to be covered.
-	Outlines the testing approach that will be used.
-	Identifies the required resources and provides an estimate of the test efforts.

### 1.2	Scope
This document describes the used tests, as they are unittests and functionality testing.

### 1.3	Intended Audience
This document is meant for internal use primarily.

### 1.4	Document Terminology and Acronyms
- **SRS**	Software Requirements Specification
- **vnv**	verleihen, Dienstleistungen, verschenken
- **n/a**	not applicable
- **tbd**	to be determined
- **AAI**	Authentication and Authorization Infrastructure

### 1.5	 References
- [GitHub](https://github.com/WMerk/VnVProject)
- [Blog](https://vnvproject.wordpress.com/)
- [Overall Use case diagram](https://github.com/WMerk/VnVProject/blob/master/doc/use%20cases/SRS.png)
- [Software Requirements Specification](SRS.MD)
- [Software Architecture Document](SAD.MD)
- [Function points](https://github.com/WMerk/vnvDoc/blob/master/doc/FP.pdf)
- [UC Delete friend](UC_DeleteFriend.MD)
- [UC Accept friend requests](UC_AcceptFriendRequest.MD)
- [UC List received friend requests](UC_ListReceivedFriendRequests.MD)
- [UC List sent friend requests](UC_ListSentFriendRequests.MD)
- [UC Add friend](UC_AddFriend.MD)
- [UC ChangePassword](UC_ChangePassword.MD)
- [UC Create new request](UC_CreateNewRequest.MD)
- [UC Create new offer](UC_CreateNewOffer.MD)
- [UC List requests](UC_ListRequests.MD)
- [UC List offers](UC_ListOffers.MD)
- [UC Search for offers or requests](UC_SearchOffersRequests.MD)
- [UC Edit status of offer / request](UC_EditStatus.MD)
- [UC DeleteAccount](UC_DeleteAccount.MD)
- [UC EditProfile](UC_EditProfile.MD)
- [UC Login](UC_Login.MD)
- [UC Register](UC_Register.MD)
- [UC Register/Login with Google](UC_RegisterLoginGoogle.MD)

## 2.	Evaluation Mission and Test Motivation
### 2.1	Background
[Provide a brief description of the background surrounding why the test effort defined by this Test Plan will be undertaken. Include information such as the key problem being solved, the major benefits of the solution, the planned architecture of the solution, and a brief history of the project. Where this information is defined in other documents, you can include references to those other more detailed documents if appropriate. This section should only be about three to five paragraphs in length.]
### 2.2	Evaluation Mission
Our motivation in implementing tests came at an early stage to recognize the need for errors and to ensure the functionality and thus the outstanding quality of the software.
### 2.3	Test Motivators
Our testing is motivated by 
- quality risks 
- technical risks, 
- use cases 
- functional requirements

## 3.	Target Test Items
The listing below identifies those test items (software, hardware, and supporting product elements) that have been identified as targets for testing. This list represents what items will be tested. 

Items for Testing:
- java backend
- web frontend
- database operations

## 4.	Outline of Planned Tests
### 4.1	Outline of Test Inclusions
Unit testing the Java backend, functional testing of the Web frondend and Database Integrity Testing
### 4.2	Outline of Other Candidates for Potential Inclusion
Stress testing the application, unit testing the frontend or profile testing the java backend might be potential test cases but these are not in scope of our testing process yet.

## 5.	Test Approach
### 5.1	Testing Techniques and Types
#### 5.1.1	Data and Database Integrity Testing
|Technique Objective  	| Exercise target-of-test functionality, including navigation, data entry, processing, and retrieval to observe and log target behavior. |
|Technique 		|  Execute each use-case scenario’s individual use-case flows or functions and features, using valid and invalid data, to verify that: the expected results occur when valid data is used; the appropriate error or warning messages are displayed when invalid data is used; each business rule is properly applied. Selenium can simulate all user interactions like clicks, swipes and more. |
|Oracles 		|  user enter valid data, for example a valid username and a valid password   |
|Required Tools 	| Selenium + Cucumber	 |
|Success Criteria	|    successful senarios         |
|Special Considerations	|     -          |

#### 5.1.2	Function Testing


#### 5.1.3	Business Cycle Testing
n/a

#### 5.1.4	User Interface Testing
n/a

#### 5.1.5	Performance Profiling 
n/a

#### 5.1.6	Load Testing
n/a

#### 5.1.7	Stress Testing
n/a
 
#### 5.1.8	Volume Testing
n/a

#### 5.1.9	Security and Access Control Testing
Unittests also cover access control. A given use case might only be performed by a given logged in user.

#### 5.1.10	Failover and Recovery Testing
n/a

#### 5.1.11	Configuration Testing
n/a

#### 5.1.12	Installation Testing
n/a

## 6.	Entry and Exit Criteria
### 6.1	Test Plan
#### 6.1.1	Test Plan Entry Criteria
Building a new version of the software will execute the testprocess.
#### 6.1.2	Test Plan Exit Criteria
When all tests pass without throwing an exception .
### 6.2	Test Cycles
#### 6.2.1	Test Cycle Entry Criteria
[Specify the criteria to be used to determine whether the test effort for the next Test Cycle of this Test Plan can begin.]
#### 6.2.2	Test Cycle Exit Criteria
[Specify the criteria that will be used to determine whether the test effort for the current Test Cycle of this Test Plan is deemed sufficient.]
#### 6.2.3	Test Cycle Abnormal Termination
[Specify the criteria that will be used to determine whether testing should be prematurely suspended or ended for the current test cycle, or whether the intended build candidate to be tested must be altered.] 
## 7.	Deliverables
[In this section, list the various artifacts that will be created by the test effort that are useful deliverables to the various stakeholders of the test effort. Don’t list all work products; only list those that give direct, tangible benefit to a stakeholder and those by which you want the success of the test effort to be measured.]
### 7.1	Test Evaluation Summaries
[Provide a brief outline of both the form and content of the test evaluation summaries, and indicate how frequently they will be produced.]
### 7.2	Reporting on Test Coverage
[Provide a brief outline of both the form and content of the reports used to measure the extent of testing, and indicate how frequently they will be produced. Give an indication as to the method and tools used to record, measure, and report on the extent of testing.] 
### 7.3	Perceived Quality Reports
[Provide a brief outline of both the form and content of the reports used to measure the perceived quality of the product, and indicate how frequently they will be produced. Give an indication about to the method and tools used to record, measure, and report on the perceived product quality. You might include some analysis of Incidents and Change Request over Test Coverage.]
### 7.4	Incident Logs and Change Requests
[Provide a brief outline of both the method and tools used to record, track, and manage test incidents, associated change requests, and their status.]
### 7.5	Smoke Test Suite and Supporting Test Scripts
[Provide a brief outline of the test assets that will be delivered to allow ongoing regression testing of subsequent product builds to help detect regressions in the product quality.]  
### 7.6	Additional Work Products
[In this section, identify the work products that are optional deliverables or those that should not be used to measure or assess the successful execution of the Test Plan.]
#### 7.6.1	Detailed Test Results
[This denotes either a collection of Microsoft Excel spreadsheets listing the results determined for each test case, or the repository of both test logs and determined results maintained by a specialized test product.]
#### 7.6.2	Additional Automated Functional Test Scripts
[These will be either a collection of the source code files for automated test scripts, or the repository of both source code and compiled executables for test scripts maintained by the test automation product.]
#### 7.6.3	Test Guidelines
[Test Guidelines cover a broad set of categories, including Test-Idea catalogs, Good Practice Guidance, Test patterns, Fault and Failure Models, Automation Design Standards, and so forth.]
#### 7.6.4	Traceability Matrices
[Using a tool such as Rational RequisistePro or MS Excel, provide one or more matrices of traceability relationships between traced items.]
## 8.	Testing Workflow
At the moment tests are automatically run before deployment on the server. The application is build using maven. Building the application with maven install will run all feature tests and unittest and only build if the tests complete.

For the future this might be included in a continuous deployment circle.

## 9.	Environmental Needs
[This section presents the non-human resources required for the Test Plan.]
### 9.1	Base System Hardware
The following table sets forth the system resources for the test effort presented in this Test Plan.
[The specific elements of the test system may not be fully understood in early iterations, so expect this section to be completed over time. We recommend that the system simulates the production environment, scaling down the concurrent access and database size, and so forth, if and where appropriate.]
[Note:  Add or delete items as appropriate.]

System Resources
Resource	Quantity	Name and Type
Database Server		
—Network or Subnet		TBD
—Server Name		TBD
—Database Name		TBD
Client Test PCs		
—Include special configuration requirements		TBD
Test Repository		
—Network or Subnet		TBD
—Server Name		TBD
Test Development PCs		TBD
### 9.2	Base Software Elements in the Test Environment
The following base software elements are required in the test environment for this Test Plan.
[Note:  Add or delete items as appropriate.]
Software Element Name	Version	Type and Other Notes
NT Workstation		Operating System
Windows 2000		Operating System
Internet Explorer		Internet Browser
Netscape Navigator		Internet Browser
MS Outlook		eMail Client software
Network Associates McAfee Virus Checker		Virus Detection and Recovery Software

### 9.3	Productivity and Support Tools
The following tools will be employed to support the test process for this Test Plan.
[Note:  Add or delete items as appropriate.]
Tool Category or Type	Tool Brand Name	Vendor or In-house	Version
Test Management			
Defect Tracking			
ASQ Tool for functional testing			
ASQ Tool for performance testing			
Test Coverage Monitor or Profiler			
Project Management			
DBMS tools			

### 9.4	Test Environment Configurations
The following Test Environment Configurations needs to be provided and supported for this project.
Configuration Name	Description	Implemented in Physical Configuration
Average user configuration		
Minimal configuration supported		
Visually and mobility challenged		
International Double Byte OS		
Network installation (not client)		

## 10.	Responsibilities, Staffing, and Training Needs
### 10.1	People and Roles
This table shows the staffing assumptions for the test effort.
[Note:  Add or delete items as appropriate.]

Human Resources
Role	Minimum Resources Recommended
(number of full-time roles allocated)	Specific Responsibilities or Comments
Test Manager		Provides management oversight. 
Responsibilities include:
•	planning and logistics
•	agree mission 
•	identify motivators
•	acquire appropriate resources
•	present management reporting
•	advocate the interests of test
•	evaluate effectiveness of test effort
Test Analyst
		Identifies and defines the specific tests to be conducted.
Responsibilities include:
•	identify test ideas
•	define test details
•	determine test results
•	document change requests
•	evaluate product quality
Test Designer
		Defines the technical approach to the implementation of the test effort.
Responsibilities include:
•	define test approach
•	define test automation architecture
•	verify test techniques
•	define testability elements
•	structure test implementation
Tester		Implements and executes the tests.
Responsibilities include:
•	implement tests and test suites
•	execute test suites
•	log results
•	analyze and recover from test failures
•	document incidents
Test System Administrator		Ensures test environment and assets are managed and maintained.
Responsibilities include:
•	administer test management system
•	install and support access to, and recovery of, test environment configurations and test labs
Database Administrator, Database Manager		Ensures test data (database) environment and assets are managed and maintained.
Responsibilities include:
•	support the administration of test data and test beds (database).
Designer		Identifies and defines the operations, attributes, and associations of the test classes.
Responsibilities include:
•	defines the test classes required to support testability requirements as defined by the test team
Implementer		Implements and unit tests the test classes and test packages.
Responsibilities include:
•	creates the test components required to support testability requirements as defined by the designer

### 10.2	Staffing and Training Needs
n/a
## 11.	Iteration Milestones
[Identify the key schedule milestones that set the context for the Testing effort. Avoid repeating too much detail that is documented elsewhere in plans that address the entire project.]

Milestone	Planned      Start Date	Actual         Start Date	Planned        End Date	Actual           End Date
Iteration Plan agreed				
Iteration starts				
Requirements baselined				
Architecture baselined				
User Interface baselined				
First Build delivered to test				
First Build accepted into test				
First Build test cycle finishes				
[Build Two will not be tested]				
Third Build delivered to test				
Third Build accepted into test				
Third Build test cycle finishes				
Fourth Build delivered to test				
Fourth Build accepted into test				
Iteration Assessment review				
Iteration ends				

## 12.	Risks, Dependencies, Assumptions, and Constraints
[List any risks that may affect the successful execution of this Test Plan, and identify mitigation and contingency strategies for each risk. Also indicate a relative ranking for both the likelihood of occurrence and the impact if the risk is realized.] 
Risk	Mitigation Strategy	Contingency (Risk is realized)
Prerequisite entry criteria is not met.	<Tester> will define the prerequisites that must be met before Load Testing can start.

<Customer> will endeavor to meet prerequisites indicated by <Tester>.	•	Meet outstanding prerequisites
•	Consider Load Test Failure
Test data proves to be inadequate.	<Customer> will ensure a full set of suitable and protected test data is available.

<Tester> will indicate what is required and will verify the suitability of test data.	•	Redefine test data
•	Review Test Plan and modify
•	components (that is, scripts)
•	Consider Load Test Failure
Database requires refresh.	<System Admin> will endeavor to ensure the Database is regularly refreshed as required by <Tester>.	•	Restore data and restart
•	Clear Database

[List any dependencies identified during the development of this Test Plan that may affect its successful execution if those dependencies are not honored. Typically these dependencies relate to activities on the critical path that are prerequisites or post-requisites to one or more preceding (or subsequent) activities You should consider responsibilities you are relying on other teams or staff members external to the test effort completing, timing and dependencies of other planned tasks, the reliance on certain work products being produced.] 
Dependency between	Potential Impact of Dependency	Owners
		
		
		

[List any assumptions made during the development of this Test Plan that may affect its successful execution if those assumptions are proven incorrect. Assumptions might relate to work you assume other teams are doing, expectations that certain aspects of the product or environment are stable, and so forth]. 
Assumption to be proven	Impact of Assumption being incorrect	Owners
		
		
		

[List any constraints placed on the test effort that have had a negative effect on the way in which this Test Plan has been approached.]
Constraint on	Impact Constraint has on test effort	Owners
		
		
		

## 13.	Management Process and Procedures
[Outline what processes and procedures are to be used when issues arise with the Test Plan and its enactment.]
### 13.1	Measuring and Assessing the Extent of Testing
[Outline the measurement and assessment process to be used to track the extent of testing.]
### 13.2	Assessing the Deliverables of this Test Plan
[Outline the assessment process for reviewing and accepting the deliverables of this Test Plan]

### 13.3	Problem Reporting, Escalation, and Issue Resolution
[Define how process problems will be reported and escalated, and the process to be followed to achieve resolution.]
### 13.4	Managing Test Cycles
[Outline the management control process for a test cycle.]
### 13.5	Traceability Strategies
[Consider appropriate traceability strategies for:
•	Coverage of Testing against Specifications — enables measurement the extent of testing
•	Motivations for Testing — enables assessment of relevance of tests to help determine whether to maintain or retire tests
•	Software Design Elements — enables tracking of subsequent design changes that would necessitate rerunning tests or retiring them
•	Resulting Change Requests — enables the tests that discovered the need for the change to be identified and re-run to verify the change request has been completed successfully]
### 13.6	Approval and Signoff
[Outline the approval process and list the job titles (and names of current incumbents) that initially must approve the plan, and sign off on the plans satisfactory execution.]
