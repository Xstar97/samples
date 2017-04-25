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
initOnCreateR.id.toolbar,R.id.drawer, R.id.navigatioView);

what does that do?
well...its basically this:

the single line of code sets up the support actionBar, ActionBarDrawerToggle, and finally the navigationItemListener

    setSupportActionBar(toolbar);

    ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
    this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
    drawer.addDrawerListener(toggle);
    toggle.syncState();

    navigationView.setNavigationItemSelectedListener(this);

you also have access to following public methods too:

1. void closerDrawer
2. void openDrawer
3. boolean isDrawerOpen

please checkout this sample project to see how everything is fully implemented!


NOTES:

this sample project was out dated...and now it has been overhauled greatly to meet better expectations and help to better understand the sample!

...some build.gradle file tweaking should make it fully compatibile to build this project in AIDE.
