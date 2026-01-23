# Smart Campus App - Phase 1 Work Distribution Guide

## Team Structure & Roles

### Member 1: Project Lead & Git Manager
**Primary Responsibilities:**
- Project initialization and setup
- Git repository management
- Integration and merge conflict resolution
- Code review coordination

**Tasks:**
1. ✅ Create Android Studio project
2. ✅ Set up remote Git repository (GitHub/GitLab)
3. ✅ Create branch structure (`main`, `develop`)
4. ✅ Set up `.gitignore` properly
5. ✅ Create initial `README.md` template
6. ✅ Configure Material Theme in `Theme.kt`
7. ✅ Create project folder structure (already done ✓)
8. ✅ Set up navigation routes (`Routes.kt`)
9. ✅ Coordinate team integration meetings
10. ✅ Final APK build and testing

**Git Commits (Minimum 5):**
```
1. "feat: initialize Android Studio project with Jetpack Compose"
2. "chore: set up Git repository and branch structure"
3. "feat: configure Material Design theme and colors"
4. "feat: create project folder structure and navigation routes"
5. "docs: add README.md with team information"
6. "fix: resolve merge conflicts in AppNavGraph"
7. "chore: configure Gradle dependencies"
```

---

### Member 2: Login Screen Developer
**Primary Responsibilities:**
- Login screen UI
- Mock authentication logic
- SharedPreferences integration

**Tasks:**
1. ✅ Design Login UI in `LoginScreen.kt`
   - Username input field
   - Password input field
   - Login button
   - Error message display
2. ✅ Implement `LoginViewModel.kt`
   - Hardcoded credential validation
   - UI state management
3. ✅ Create `LoginUiState.kt`
   - Loading state
   - Error state
   - Success state
4. ✅ Implement SharedPreferences for session storage
5. ✅ Create reusable `TextFieldOutlined.kt` component
6. ✅ Create reusable `PrimaryButton.kt` component
7. ✅ Add input validation logic in `Validators.kt`
8. ✅ Test login flow thoroughly

**Git Commits (Minimum 5):**
```
1. "feat: create Login screen UI with input fields"
2. "feat: implement LoginViewModel with mock authentication"
3. "feat: add LoginUiState for state management"
4. "feat: integrate SharedPreferences for session storage"
5. "feat: create reusable TextFieldOutlined component"
6. "feat: create reusable PrimaryButton component"
7. "test: validate login flow with hardcoded credentials"
```

**Hardcoded Login Credentials:**
```kotlin
// In LoginViewModel.kt
private val VALID_USERNAME = "student"
private val VALID_PASSWORD = "password123"
```

---

### Member 3: Dashboard Screen Developer
**Primary Responsibilities:**
- Dashboard screen UI
- Welcome message display
- Navigation menu integration

**Tasks:**
1. ✅ Design Dashboard UI in `DashboardScreen.kt`
   - Welcome message with user's name
   - Navigation cards/buttons
   - App logo/header
2. ✅ Implement `DashboardViewModel.kt`
   - Load user session from SharedPreferences
   - Manage dashboard state
3. ✅ Create `DashboardUiState.kt`
   - User data state
   - Loading state
4. ✅ Create `DashboardItem.kt` model
   - Navigation item data structure
5. ✅ Create reusable `AppTopBar.kt` component
6. ✅ Design navigation cards (Campus Info, Profile, Settings, Logout)
7. ✅ Test dashboard navigation
8. ✅ Implement logout functionality

**Git Commits (Minimum 5):**
```
1. "feat: create Dashboard screen UI with welcome message"
2. "feat: implement DashboardViewModel for state management"
3. "feat: add DashboardUiState for dashboard data"
4. "feat: create DashboardItem model for navigation"
5. "feat: create reusable AppTopBar component"
6. "feat: design navigation cards for dashboard"
7. "feat: implement logout functionality"
```

**Dashboard UI Example:**
```kotlin
// In DashboardScreen.kt
@Composable
fun DashboardScreen(
    viewModel: DashboardViewModel = viewModel(),
    onNavigateToCampusInfo: () -> Unit,
    onLogout: () -> Unit
) {
    Column {
        AppTopBar(title = "Dashboard")
        Text("Welcome, ${viewModel.userName}!")
        // Navigation cards for Campus Info, Profile, etc.
    }
}
```

---

### Member 4: Campus Information Module Developer
**Primary Responsibilities:**
- Campus Information screen
- Department list UI
- Contact information display

**Tasks:**
1. ✅ Design Campus Info UI in `CampusInfoScreen.kt`
   - List of departments
   - Search/filter functionality (optional)
   - Detail view navigation
2. ✅ Create `CampusInfoViewModel.kt`
   - Load sample data
   - Manage list state
3. ✅ Create `CampusInfoUiState.kt`
   - Department list state
   - Loading state
4. ✅ Create `CampusInfoItem.kt` model
   - Department data structure (name, contact, location)
5. ✅ Populate `CampusInfoSample.kt` with sample data
   - At least 5 departments
   - Each with name, contact number, email, location
6. ✅ Implement `CampusInfoDetailsScreen.kt` (optional)
   - Show detailed department information
7. ✅ Create reusable `LoadingPlaceholder.kt` component
8. ✅ Test list display and navigation

**Git Commits (Minimum 5):**
```
1. "feat: create Campus Info screen UI with department list"
2. "feat: implement CampusInfoViewModel for data management"
3. "feat: add CampusInfoUiState for list state"
4. "feat: create CampusInfoItem model for department data"
5. "feat: populate CampusInfoSample with 5 departments"
6. "feat: create reusable LoadingPlaceholder component"
7. "feat: implement CampusInfoDetailsScreen for detail view"
```

**Sample Data Structure:**
```kotlin
// In CampusInfoSample.kt
data class CampusInfoItem(
    val id: Int,
    val name: String,
    val contact: String,
    val email: String,
    val location: String
)

val sampleDepartments = listOf(
    CampusInfoItem(1, "Computer Science", "123-4567", "cs@university.edu", "Building A, Room 101"),
    CampusInfoItem(2, "Engineering", "123-4568", "eng@university.edu", "Building B, Room 201"),
    // ... more departments
)
```

---

### Member 5: Navigation & Integration Developer
**Primary Responsibilities:**
- Navigation graph setup
- Screen integration
- Testing and bug fixing

**Tasks:**
1. ✅ Implement `AppNavGraph.kt`
   - Set up NavHost
   - Define all routes
   - Connect screens
2. ✅ Update `Routes.kt`
   - Define route constants
3. ✅ Update `MainActivity.kt`
   - Set up navigation
4. ✅ Test navigation flow:
   - Login → Dashboard
   - Dashboard → Campus Info
   - Dashboard → Logout → Login
5. ✅ Create sample user data in `UserSample.kt` (optional)
6. ✅ Implement deep linking (optional)
7. ✅ Test on emulator and real device
8. ✅ Create APK for submission
9. ✅ Help other members with merge conflicts

**Git Commits (Minimum 5):**
```
1. "feat: implement AppNavGraph with all routes"
2. "feat: define route constants in Routes.kt"
3. "feat: update MainActivity with navigation setup"
4. "test: validate complete navigation flow"
5. "feat: create UserSample for mock user data"
6. "chore: build APK for prelim submission"
7. "fix: resolve navigation back stack issues"
```

**Navigation Setup Example:**
```kotlin
// In AppNavGraph.kt
@Composable
fun AppNavGraph(
    navController: NavHostController,
    startDestination: String
) {
    NavHost(navController = navController, startDestination = startDestination) {
        composable(Routes.LOGIN) {
            LoginScreen(onLoginSuccess = {
                navController.navigate(Routes.DASHBOARD) {
                    popUpTo(Routes.LOGIN) { inclusive = true }
                }
            })
        }
        composable(Routes.DASHBOARD) {
            DashboardScreen(
                onNavigateToCampusInfo = { navController.navigate(Routes.CAMPUS_INFO) },
                onLogout = {
                    navController.navigate(Routes.LOGIN) {
                        popUpTo(0) { inclusive = true }
                    }
                }
            )
        }
        composable(Routes.CAMPUS_INFO) {
            CampusInfoScreen(
                onBack = { navController.popBackStack() }
            )
        }
    }
}
```

---

## Git Workflow for the Team

### Branch Strategy
```
main (production-ready code)
  └── develop (integration branch)
       ├── feature/login-screen (Member 2)
       ├── feature/dashboard-screen (Member 3)
       ├── feature/campus-info (Member 4)
       └── feature/navigation (Member 5)
```

### Daily Workflow
1. **Pull latest changes:**
   ```bash
   git checkout develop
   git pull origin develop
   ```

2. **Create feature branch:**
   ```bash
   git checkout -b feature/your-feature-name
   ```

3. **Make changes and commit:**
   ```bash
   git add .
   git commit -m "feat: descriptive commit message"
   ```

4. **Push to remote:**
   ```bash
   git push origin feature/your-feature-name
   ```

5. **Create Pull Request:**
   - On GitHub/GitLab
   - Request review from Project Lead
   - Merge into `develop` after approval

6. **Delete feature branch after merge:**
   ```bash
   git branch -d feature/your-feature-name
   ```

---

## Commit Message Convention

Follow **Conventional Commits** format:

```
<type>: <short description>

<optional body>

<optional footer>
```

**Types:**
- `feat:` - New feature
- `fix:` - Bug fix
- `docs:` - Documentation changes
- `style:` - Code style changes (formatting)
- `refactor:` - Code refactoring
- `test:` - Adding tests
- `chore:` - Build/config changes

**Examples:**
```
feat: add login screen with input validation
fix: resolve navigation back stack issue
docs: update README with setup instructions
test: add unit tests for LoginViewModel
chore: update Gradle dependencies
```

---

## Team Meeting Schedule

### Daily Stand-ups (15 minutes)
**When:** Every day before coding
**What to share:**
- What did you work on yesterday?
- What will you work on today?
- Any blockers or help needed?

### Integration Meetings (1 hour)
**When:** Every 2-3 days
**Purpose:**
- Merge feature branches into `develop`
- Resolve merge conflicts
- Test integrated app

### Sprint Review (2 hours)
**When:** End of Phase 1
**Purpose:**
- Demo complete app
- Review Git history
- Prepare submission

---

## Testing Checklist

Before final submission, ensure:

- [ ] **Login Screen:**
  - [ ] Username/password validation works
  - [ ] Error messages display correctly
  - [ ] Session saves to SharedPreferences
  - [ ] Successful login navigates to Dashboard

- [ ] **Dashboard Screen:**
  - [ ] Welcome message shows username
  - [ ] Navigation buttons work
  - [ ] Logout clears session
  - [ ] Logout navigates back to Login

- [ ] **Campus Info Screen:**
  - [ ] Department list displays correctly
  - [ ] Contact information is visible
  - [ ] Detail view works (if implemented)
  - [ ] Back button works

- [ ] **Navigation:**
  - [ ] All screens are reachable
  - [ ] Back button works correctly
  - [ ] No navigation crashes

- [ ] **Git History:**
  - [ ] Each member has 5+ commits
  - [ ] Commit messages are meaningful
  - [ ] All branches merged to `develop`

---

## Deliverables Checklist

- [ ] **Git Repository:**
  - [ ] Public repository link
  - [ ] `main` and `develop` branches
  - [ ] All commits visible
  - [ ] Clear commit history

- [ ] **README.md:**
  - [ ] App description
  - [ ] Team member names and roles
  - [ ] Git workflow explanation
  - [ ] Setup instructions
  - [ ] Screenshots (optional)

- [ ] **APK File:**
  - [ ] Generated from `main` branch
  - [ ] Tested on emulator
  - [ ] No crashes

- [ ] **Demo:**
  - [ ] Video or live demo
  - [ ] Show all features working

---

## Success Tips

1. **Communicate often** - Use WhatsApp/Discord for quick questions
2. **Test locally before pushing** - Avoid breaking the build
3. **Review each other's code** - Learn and improve together
4. **Ask for help early** - Don't struggle alone
5. **Document your work** - Add comments in code
6. **Backup your work** - Push to Git daily
7. **Test on different devices** - Ensure compatibility

---

## Troubleshooting Common Issues

### Merge Conflicts
If you get a merge conflict:
1. Don't panic!
2. Pull latest `develop` branch
3. Merge `develop` into your feature branch
4. Resolve conflicts in Android Studio
5. Test the app
6. Commit the merge

### Build Errors
If the project won't build:
1. Clean project: `Build > Clean Project`
2. Invalidate caches: `File > Invalidate Caches and Restart`
3. Sync Gradle files
4. Check `build.gradle.kts` for missing dependencies

### Git Issues
If you accidentally committed to the wrong branch:
```bash
git reset --soft HEAD~1  # Undo last commit, keep changes
git stash                # Save changes
git checkout correct-branch
git stash pop            # Apply changes
git add .
git commit -m "correct message"
```

---

## Final Submission Format

### Repository Structure
```
SmartCampusApp/
├── README.md
├── app/
│   └── (all source code)
├── .gitignore
└── screenshots/
    ├── login.png
    ├── dashboard.png
    └── campus-info.png
```

### README.md Template
```markdown
# Smart Campus App - Phase 1

## Description
A mobile application for campus information and student services.

## Team Members
- **Member 1 (Project Lead):** [Name] - Git management, project setup
- **Member 2 (Login Dev):** [Name] - Login screen and authentication
- **Member 3 (Dashboard Dev):** [Name] - Dashboard and navigation
- **Member 4 (Campus Info Dev):** [Name] - Campus information module
- **Member 5 (Integration Dev):** [Name] - Navigation and testing

## Features
- Mock login with session management
- Dashboard with welcome message
- Campus information directory
- Material Design UI

## Git Workflow
We followed the Git Flow branching strategy:
- `main`: Production-ready code
- `develop`: Integration branch
- `feature/*`: Individual feature branches

Each team member contributed at least 5 commits with meaningful messages.

## Setup Instructions
1. Clone the repository
2. Open in Android Studio
3. Sync Gradle files
4. Run on emulator or device

## Screenshots
(Add screenshots here)

## APK Download
[Link to APK file]
```

---

## Success Metrics

Your team will be evaluated on:
1. **Functionality (40%)** - All features work as described
2. **Git Usage (30%)** - Proper branching, commits, and messages
3. **Code Quality (20%)** - Clean, organized, and documented code
4. **Teamwork (10%)** - Equal contribution and collaboration

---

## Quick Reference - Who Does What?

| Member | Main Screens/Components | Key Files |
|--------|------------------------|-----------|
| **Member 1** | Project Setup, Theme, Integration | `Theme.kt`, `Routes.kt`, `README.md` |
| **Member 2** | Login Screen | `LoginScreen.kt`, `LoginViewModel.kt`, `LoginUiState.kt` |
| **Member 3** | Dashboard Screen | `DashboardScreen.kt`, `DashboardViewModel.kt`, `AppTopBar.kt` |
| **Member 4** | Campus Info Screen | `CampusInfoScreen.kt`, `CampusInfoViewModel.kt`, `CampusInfoSample.kt` |
| **Member 5** | Navigation & Testing | `AppNavGraph.kt`, `MainActivity.kt`, APK Build |

---

## Timeline Suggestion

### Week 1 (Days 1-3)
- **Member 1:** Set up project, create Git repo, configure theme
- **All Members:** Clone repo, set up Android Studio
- **Member 2-4:** Start designing UI screens (no functionality yet)
- **Member 5:** Study navigation documentation

### Week 2 (Days 4-7)
- **Member 2:** Implement login logic and SharedPreferences
- **Member 3:** Implement dashboard logic and navigation buttons
- **Member 4:** Create sample data and populate list
- **Member 5:** Set up navigation graph and connect screens

### Week 3 (Days 8-10)
- **All Members:** Integration testing
- **Member 1:** Coordinate merges, resolve conflicts
- **Member 5:** Final testing, build APK
- **All Members:** Update README, prepare demo

---

Good luck with Phase 1! Remember: **Communication is key**. Work together, help each other, and you'll succeed! 🚀
