package com.tungnv.common.service;

import java.util.List;

import com.tungnv.base.entity.EntityBase;

public class ServiceImpl implements ServiceI {

    /*
     * (non-Javadoc)
     *
     * @see com.tungnv.common.service.ServiceI#insert(com.tungnv.base.entity.
     * EntityBase)
     */
    @Override
    public <Entity extends EntityBase> int insert(Entity entity) {
        // TODO Auto-generated method stub
        return 0;
    }

    /*
     * (non-Javadoc)
     *
     * @see
     * com.tungnv.common.service.ServiceI#updateByPK(com.tungnv.base.entity.
     * EntityBase)
     */
    @Override
    public <Entity extends EntityBase> int updateByPK(Entity entity) {
        // TODO Auto-generated method stub
        return 0;
    }

    /*
     * (non-Javadoc)
     *
     * @see
     * com.tungnv.common.service.ServiceI#deletebyPK(com.tungnv.base.entity.
     * EntityBase)
     */
    @Override
    public <Entity extends EntityBase> int deletebyPK(Entity entity) {
        // TODO Auto-generated method stub
        return 0;
    }

    /*
     * (non-Javadoc)
     *
     * @see com.tungnv.common.service.ServiceI#update(com.tungnv.base.entity.
     * EntityBase, com.tungnv.base.entity.EntityBase)
     */
    @Override
    public <Entity extends EntityBase> int update(Entity condition, Entity update) {
        // TODO Auto-generated method stub
        return 0;
    }

    /*
     * (non-Javadoc)
     *
     * @see com.tungnv.common.service.ServiceI#delete(com.tungnv.base.entity.
     * EntityBase, com.tungnv.base.entity.EntityBase)
     */
    @Override
    public <Entity extends EntityBase> int delete(Entity condition, Entity update) {
        // TODO Auto-generated method stub
        return 0;
    }

    /*
     * (non-Javadoc)
     *
     * @see
     * com.tungnv.common.service.ServiceI#selectByPK(com.tungnv.base.entity.
     * EntityBase)
     */
    @Override
    public <Entity extends EntityBase> Entity selectByPK(Entity entity) {
        // TODO Auto-generated method stub
        return null;
    }

    /*
     * (non-Javadoc)
     *
     * @see com.tungnv.common.service.ServiceI#select(com.tungnv.base.entity.
     * EntityBase)
     */
    @Override
    public <Entity extends EntityBase> List<Entity> select(Entity entity) {
        // TODO Auto-generated method stub
        return null;
    }

    /*
     * (non-Javadoc)
     *
     * @see
     * com.tungnv.common.service.ServiceI#selectCount(com.tungnv.base.entity.
     * EntityBase)
     */
    @Override
    public <Entity extends EntityBase> int selectCount(Entity entity) {
        // TODO Auto-generated method stub
        return 0;
    }

}
