package Mapper;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import Entity.SimpleDestination;
import Entity.SimpleSource;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;

class SimpleSourceDestinationTest {

  //An instance of the interface implementation can be retrieved from the Mappers class.

  private SimpleSourceDestination destination = Mappers.getMapper(SimpleSourceDestination.class);

  @Test
  void destinationTest() {
    SimpleSource source = new SimpleSource();
    source.setName("Supriya");

    final SimpleDestination dest = destination.transformToDestination(source);
    assertEquals(source.getName(),dest.getName());
    assertNotNull(dest);
  }
}