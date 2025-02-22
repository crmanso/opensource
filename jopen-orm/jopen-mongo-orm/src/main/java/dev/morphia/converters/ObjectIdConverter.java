package dev.morphia.converters;


import dev.morphia.mapping.MappedField;
import org.bson.types.ObjectId;


/**
 * Convert to an ObjectId from string
 *
 * @author scotthernandez
 */
public class ObjectIdConverter extends TypeConverter implements SimpleValueConverter {

    /**
     * Creates the Converter.
     */
    public ObjectIdConverter() {
        super(ObjectId.class);
    }

    @Override
    public Object decode(final Class targetClass, final Object val, final MappedField optionalExtraInfo) {
        if (val == null) {
            return null;
        }

        if (val instanceof ObjectId) {
            return val;
        }

        return new ObjectId(val.toString());
    }
}
