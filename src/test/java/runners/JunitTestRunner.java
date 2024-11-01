package runners;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import page.classes.LoginPage;
import test.classes.LogintestClass;


@RunWith(Suite.class)
@Suite.SuiteClasses(
        {LogintestClass.class}
)
public class JunitTestRunner {


}
