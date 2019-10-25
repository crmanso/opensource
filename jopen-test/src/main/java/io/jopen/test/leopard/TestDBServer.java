package io.jopen.test.leopard;

import io.jopen.leopard.base.storage.client.IntermediateExpression;
import io.jopen.leopard.base.storage.client.LeopardClient;

import java.util.Collection;
import java.util.UUID;

/**
 * @author maxuefeng
 * @since 2019/10/25
 */
public class TestDBServer {

    private static LeopardClient client = new LeopardClient.Builder().startDBServer().build();

    public static void main(String[] args) throws Throwable {
        client.switchDB("default");

        People people = new People();
        people.setId(UUID.randomUUID().toString());
        people.setName("Jack");
        people.setAge(20);
        //
        int saveRes = client.input(people).save().execute();

        System.err.println(saveRes);

        IntermediateExpression<People> expression = IntermediateExpression.buildFor(People.class);

        //
        People p1 = new People();
        p1.setName("JackM");
        expression.like("name", "JaL");
        Collection<People> collection = client.input(expression).select().execute();

        System.err.println(collection);


    }
}
