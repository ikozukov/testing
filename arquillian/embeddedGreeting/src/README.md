Without arquillian-junit-container:
    InitializationError(arquillian.GreeterTest): Type org.jboss.arquillian.junit.Arquillian not present

Without jboss-javaee-7.0:
    arquillian.GreeterTest: javax/transaction/UserTransaction

Without arquillian-weld-ee-embedded-1.1:
    arquillian.GreeterTest: DeploymentScenario contains a target (_DEFAULT_) not matching any defined Container in the registry.(..)

Without weld-core:
    arquillian.GreeterTest: Could not create new instance of class org.jboss.arquillian.test.impl.EventTestRunnerAdaptor
