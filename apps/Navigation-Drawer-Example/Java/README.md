# Navigation Drawer Example
A Sample on creating a material design navigation drawer(fragments example included!)

Starting the project...

if you clone, download, etc this project...make sure to update the build.gradle files to match your current configurations...

You should notice two classes in the /activities/ folder

1. BaseDrawerActivity
2. MainActivity

The MainActivity class extends BaseDrawerActivity(which extends AppCompatActivity!) which uses the awesome and simple API that I written to make it even easier to add a nav drawer to the activity.

Lets take a look at the MainActivity.java:

the first thing we do is delcare the following views:

1. Toolbar
2. DrawerLayout
3. NavigationView

then in onCreate we add the following:

    initOnCreate(toolbar, drawer, navigationView);

    //R.id.blabla compatible

    initOnCreate(R.id.toolbar, R.id.drawer, R.id.navigationView);

what does that do?
well...its basically this:

the single line of code sets up everything needed for your drawerlayout...

    ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
    this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
    drawer.addDrawerListener(toggle);
    toggle.syncState();
    navigationView.setNavigationItemSelectedListener(this);

The following are a few public methods that have been added.

    1. void: closerDrawer();
    - closes drawer if open
    2. void: openDrawer();
    - opens drawer if closed
    3. boolean: isDrawerOpen();
    - is the drawer open?
    4. void: setSelectedMenu(int menu id);
    - selects the menu via menu id(highlights and sets off action!)
    5. void: unSelectMenuItem(int i);
    - unhighlights the menu of a single item(not menu id compatible :()
    6. int: unSelectMenuItem();
    - un selects the entire menu...ie from 0 to 'infinity'
    7. int: getMenuSize();
    - returns length of menu
    
Public methods to return the views
    
    1. toolbar: getToolBar();
    2. drawerLayout: getDrawerLayout();
    3. navigationView: getNavView();

please checkout this sample project to see how everything is fully implemented!


NOTES:

this sample project was out dated...and now it has been overhauled greatly to meet better expectations and help to better understand the sample!

...some build.gradle file tweaking should make it fully compatibile to build this project in AIDE.
