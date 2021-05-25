### Test Design

### Requirements

Functional Requirements: [KIB.09.01]

Non-Functional Requirements: N/A

### Clarifications and Exceptions

### Test Setup

| #    | user                | number of hospitals |
| ---- | ------------------- | ------------------- |
| 1    | Corporate admin     | 0                   |
| 2    | Branch admin        | 0                   |
| 3    | HCP Scheduler       | 0                   |
| 4    | Surgeon             | 0                   |
| 5    | Corporate admin     | 1                   |
| 6    | Branch admin        | 1                   |
| 7    | HCP Scheduler       | 1                   |
| 8    | Surgeon             | 1                   |
| 9    | Corporate admin     | 10                  |
| 10   | Branch admin        | 10                  |
| 11   | HCP Scheduler       | 10                  |
| 12   | Surgeon             | 10                  |


### Test Scenario Positive

**CON-1147-1** Verify that user does not see any hospitals in Edit Profile view if he does not have any

```gherkin
Given portal admin does not assign any hospitals to <user>
And <user> is successfully logged into the system
When <user> navigates to "Edit Profile" window
Then <user> sees "Hospitals:" text in his profile
And <user> does not see any hospitals assigned to him
```

**CON-1147-2** Verify that user see hospitals in Edit Profile view

```gherkin
Given portal admin assigns certain <number of hospitals> to <user>
And <user> is successfully logged into the system
When <user> navigates to "Edit Profile" window
Then <user> sees the same <number of hospitals> that were assigned to him
And they correspond to initially assigned hospitals
```

**CON-1147-3** Verify that user can open all list of assigned hospitals in Edit Profile view

```gherkin
Given portal admin assigns certain <number of hospitals> to <user>
And <user> is successfully logged into the system
When <user> navigates to "Edit Profile" window
And <user> clicks on "Show all hospitals" button while it is active 
Then <user> sees the same <number of hospitals> that were assigned to him
And hospitals in drop-down list correspond to initially assigned hospitals
```

**CON-1147-4** Verify that user can collapse all list of assigned hospitals in Edit Profile view

```gherkin
Given portal admin assigns certain <number of hospitals> to <user>
And <user> is successfully logged into the system
And <user> navigates to "Edit Profile" window
And <user> clicks on "Show all hospitals" button while it is active
When <user> clicks on "Show less hospitals" button while it is active
Then <user> sees only three hospitals
```

### Test Scenario Negative

