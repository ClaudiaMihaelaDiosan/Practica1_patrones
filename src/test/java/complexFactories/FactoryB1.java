package complexFactories;

import Implementations.ImplementationB1;
import Implementations.ImplementationD1;
import Interfaces.InterfaceD;
import common.DependencyException;
import complex.Factory;

public class FactoryB1 implements Factory<ImplementationB1> {

    @Override
    public ImplementationB1 create(Object... parameters) throws DependencyException {
        InterfaceD d;

        try {
            d = (ImplementationD1)parameters[0];
        }catch (ClassCastException | ArrayIndexOutOfBoundsException ex){
            System.err.println("ERROR: Something went wrong when trying to create an instance of ImplementationB1.");
            throw new DependencyException(ex);
        }
        return new ImplementationB1(d);
    }
}
