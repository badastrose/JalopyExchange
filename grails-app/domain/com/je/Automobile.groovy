package com.je

import grails.rest.Resource

/**
 * Automobile
 * TODO (A domain class describes the data object and it's mapping to the database)
 */
@Resource(uri='/main/automobiles', formats=['json', 'xml'])
class Automobile {

    Long vin
    String make
    String model
    int year
    User owner

    /* Automatic timestamping of GORM */
    Date dateCreated
    Date lastUpdated

    // TODO hasOne [owner : Person]

    static transients = ['description']

    static constraints = {
        vin blank : false, unique : true
        year size: 4
    }

    String getDescription() {
        return "$year $make $model"
    }
}
