package Mapper;

import Entity.SimpleDestination;
import Entity.SimpleSource;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-02-26T23:01:29+0200",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 1.8.0_222 (Oracle Corporation)"
)
public class SimpleDestinationSourceImpl implements SimpleDestinationSource {

    @Override
    public SimpleSource transformSource(SimpleDestination simpleDestination) {
        if ( simpleDestination == null ) {
            return null;
        }

        SimpleSource simpleSource = new SimpleSource();

        simpleSource.setName( simpleDestination.getName() );
        simpleSource.setDescription( simpleDestination.getDescription() );

        return simpleSource;
    }
}
