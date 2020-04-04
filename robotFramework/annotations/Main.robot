*** Settings ***
Suite Setup       SSetup
Test Setup        TSetup
Test Teardown     TTeardown
Suite Teardown    STeardown
Test Template     Template
Test Timeout      1 minutes

*** Variables ***
${SomeString}     "I see candy"

*** Test Cases ***
SucceedingTest
    Pass Execution     ${SomeString}

FailingTest
    [Timeout]          1
    Fail

DisabledTest
    [Tags]             Disabled
    [Timeout]          1min 10s
    Fatal Error

RepeatingTest
    [Timeout]
    Repeat Keyword     2 times    Log    repeat

AnotherRepeat
    [Timeout]          NONE
    Repeat Keyword     1 s    Log    repeat

NotTemplateTest
    [Template]         NotTemplate
    Log                ${TEST NAME}

fatalErrorTest
    Fatal Error

AnotherSucceedingTest
    Pass Execution     ${SomeString}

*** Keywords ***
SSetup
    Log                Before all

TSetup
    Log                Before each

TTeardown
    Log                After each

STeardown
    Log                After all

Template
    [Documentation]    Test iterator
    [Arguments]        @{Args}
    Run Keyword        @{Args}

NotTemplate
    [Documentation]    Not test iterator
    [Arguments]        @{Args}
    Run Keyword        @{Args}
