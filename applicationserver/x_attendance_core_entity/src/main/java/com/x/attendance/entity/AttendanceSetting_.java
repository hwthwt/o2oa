/** 
 *  Generated by OpenJPA MetaModel Generator Tool.
**/

package com.x.attendance.entity;

import com.x.base.core.entity.SliceJpaObject_;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import javax.persistence.metamodel.SingularAttribute;

@javax.persistence.metamodel.StaticMetamodel
(value=com.x.attendance.entity.AttendanceSetting.class)
@javax.annotation.Generated
(value="org.apache.openjpa.persistence.meta.AnnotationProcessor6",date="Sun Sep 02 18:43:14 CST 2018")
public class AttendanceSetting_ extends SliceJpaObject_  {
    public static volatile SingularAttribute<AttendanceSetting,String> configCode;
    public static volatile SingularAttribute<AttendanceSetting,String> configName;
    public static volatile SingularAttribute<AttendanceSetting,String> configValue;
    public static volatile SingularAttribute<AttendanceSetting,String> description;
    public static volatile SingularAttribute<AttendanceSetting,String> id;
    public static volatile SingularAttribute<AttendanceSetting,Boolean> isMultiple;
    public static volatile SingularAttribute<AttendanceSetting,Integer> orderNumber;
    public static volatile SingularAttribute<AttendanceSetting,String> selectContent;
    public static volatile SingularAttribute<AttendanceSetting,String> valueType;
}
