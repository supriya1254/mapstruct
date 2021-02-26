package Mapper;

import Entity.SimpleDestination;
import Entity.SimpleSource;
import org.mapstruct.Mapper;

//Implementation of this class we will be created automatically through Mapstruct and
// the 'SimpleSourceDestinationImpl' class will available in target folder.


@Mapper
public interface SimpleSourceDestination {
  SimpleDestination transformToDestination(SimpleSource simpleSource);
}
