*** Settings ***
*** Variables ***
${SomeString}    ISeeCandy

*** Test Cases ***
Keyword Should Exist
    Keyword Should Exist    Pass

Length Should Be
    Length Should Be        "one"    5

Pass Execution
    Pass Execution          Message

Empty
    ${var} = 	            Set Variable 	${EMPTY}
    Should Be Empty         ${var}

Equal
    #Should Be Equal        1    ${1} //Not work
    Should Be Equal         ${2}    ${1 + 1}

Equal As Integers
    Should Be Equal As Integers    ${0}    0

Equal As Numbers
    Should Be Equal As Numbers     1.4    1.123    precision=0

Equal As Strings
    #Should Be Equal As Strings     ""    '' //Not work
    Should Be Equal As Strings     ""    "${EMPTY}"

True
    Should Be True          os.linesep

Contain
    Should Contain          ${SomeString}    I

Contain Any
    Should Contain Any      ${SomeString}    aa    bb    cc    dd    ee

Contain X Times
    Should Contain X Times    ${SomeString}    See    1

End With
    Should End With         ${SomeString}    Candy

Match
    Should Match            ${SomeString}    I*

Match Regexp
    Should Match Regexp     ${SomeString}    ^.*See.*$

Not Be Empty
    Should Not Be Empty     " "

Not Be Equal
    Should Not Be Equal     ""    ''

Not Be Equal As Integers
    Should Not Be Equal As Integers    ${TRUE}    0

Not Be Equal As Numbers
    Should Not Be Equal As Numbers     1    ${FALSE}    precision=1

Not Be Equal As Strings
    Should Not Be Equal As Strings     " "    ${EMPTY}

Not Be True
    Should Not Be True      sys.platform == 'darwin'

Not Contain
    Should Not Contain      ${SomeString}    Stars

Not Contain Any
    Should Not Contain Any    ${SomeString}    One    Two

Not End With
    Should Not End With     ${SomeString}    Gum

Not Match
    Should Not Match        ${SomeString}    You*

Not Match Regexp
    Should Not Match Regexp    ${SomeString}    ^Candy

Not Start With
    Should Not Start With    ${SomeString}    We

Start With
    Should Start With       ${SomeString}    I

Variable Should Exist
    Variable Should Exist    ${SomeString}

Variable Should Not Exist
    Variable Should Not Exist    ${example}

*** Keywords ***
Pass
    No Operation