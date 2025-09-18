# banking-system
Java - Banking System (Real Interview Question)
- 先由 account 與 accountHolder 開始寫, 然後再寫 transaction 與 bank.

## Java Interview Question
### 2) OOP + TDD - Banking System
#### a) Component Diagram
<img src="/img/banking-system-component.png" alt="banking-system-component" width="800"/>

#### b) Your Tasks:
- Complete all main codes to make all test cases passed

## Maven Commands
- mvn clean
  - Clear target folder
- mvn clean compile
  - Compile Main Code, and generate target folder
- mvn clean test
  - Clean + Compile + Run all test cases
- mvn clean test -Dtest=SampleTest
  - Clean + Compile + Run all test cases in a specific test java file (SampleTest.java)
- mvn clean install
  - Clean, compile, test and install into local repository
