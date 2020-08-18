# Guidelines to use SBSCL for simulating the models

## Simulating the SBML models

- First, a model has to be read from the file using the [SBMLReader](https://github.com/sbmlteam/jsbml/blob/master/core/src/org/sbml/jsbml/SBMLReader.java) by [JSBML](https://github.com/sbmlteam/jsbml). With this model as a parameter, the [SBMLinterpreter](https://github.com/draeger-lab/SBSCL/blob/master/src/main/java/org/simulator/sbml/SBMLinterpreter.java) instance is created which provides the basis of the simulation initializing all the properties of the model (using the [EquationSystem](https://github.com/draeger-lab/SBSCL/blob/master/src/main/java/org/simulator/sbml/EquationSystem.java) class), and contains the methods required for processing various functionalities like rules, events, etc.

 ```java
Model model = (new SBMLReader()).readSBML(fileName).getModel();
EquationSystem interpreter = new SBMLinterpreter(model);
```

- Once the interpreter gets created, you can simulate the model with available solver (preferably [Rosenbrocksolver](https://github.com/draeger-lab/SBSCL/blob/master/src/main/java/org/simulator/math/odes/RosenbrockSolver.java)) giving time points (also you can provide initial time, end time, and the step size). The simulated results then gets stored in a separate data structure called MultiTable.

```java
// An example of solving with Rosenbrock solver
DESSolver solver = new RosenbrockSolver();
solver.setStepSize(stepSize); // Setting the step size for the model
MultiTable solution = solver.solve(interpreter, 
              interpreter.getInitialValues(), 0d, timeEnd, simulatorExample);
```

- You can now print the [MultiTable](https://github.com/draeger-lab/SBSCL/blob/master/src/main/java/org/simulator/math/odes/MultiTable.java) or can plot it using the [PlotMultiTable](https://github.com/draeger-lab/SBSCL/blob/master/src/main/java/org/simulator/plot/PlotMultiTable.java) where you can see the changing values in a graphical form. Also, you can view it in a tabular form using the JTable class.

**Note:** To set the absolute and relative tolerances for the specific simulation, you can use the method provided by the [DESolver](https://github.com/draeger-lab/SBSCL/blob/master/src/main/java/org/simulator/math/odes/DESSolver.java) using the below code snippets:
```java
((AdaptiveStepsizeIntegrator) solver).setAbsTol(absTol);
((AdaptiveStepsizeIntegrator) solver).setRelTol(relTol);
```

For complete code on how to simulate the SBML model, please refer to the [SimulatorExample](https://github.com/draeger-lab/SBSCL/blob/master/src/main/java/org/simulator/examples/SimulatorExample.java) in the repository.