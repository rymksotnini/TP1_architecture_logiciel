package com.directi.training.ocp.exercise;

public class ResourceAllocator
{

    public int allocate(Resource resource)
    {
        resourceId= findFreeRessouceSlot(resource);
        resource.markTimeSlotBusy();
        return resource;
    }

    public void free(Resource resource)
    {
        resource.markSlotFree();
    }
}
