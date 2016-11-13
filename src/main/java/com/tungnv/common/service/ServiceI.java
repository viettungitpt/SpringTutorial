package com.tungnv.common.service;

import java.util.List;

import com.tungnv.base.entity.EntityBase;

public interface ServiceI {

    public <Entity extends EntityBase> int insert(Entity entity);

    public <Entity extends EntityBase> int updateByPK(Entity entity);

    public <Entity extends EntityBase> int deletebyPK(Entity entity);

    public <Entity extends EntityBase> int update(Entity condition, Entity update);

    public <Entity extends EntityBase> int delete(Entity condition, Entity update);

    public <Entity extends EntityBase> Entity selectByPK(Entity entity);

    public <Entity extends EntityBase> List<Entity> select(Entity entity);

    public <Entity extends EntityBase> int selectCount(Entity entity);
}
