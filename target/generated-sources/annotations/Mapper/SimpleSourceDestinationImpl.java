package Mapper;

import Entity.SimpleDestination;
import Entity.SimpleSource;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-02-26T23:01:29+0200",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 1.8.0_222 (Oracle Corporation)"
)
public class SimpleSourceDestinationImpl implements SimpleSourceDestination {

    @Override
    public SimpleDestination transformToDestination(SimpleSource simpleSource) {
        if ( simpleSource == null ) {
            return null;
        }

        SimpleDestination simpleDestination = new SimpleDestination();

        simpleDestination.setName( simpleSource.getName() );
        simpleDestination.setDescription( simpleSource.getDescription() );

        return simpleDestination;
    }
}
