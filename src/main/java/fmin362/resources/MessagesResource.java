package fmin362.resources;

<<<<<<< HEAD
import java.util.List;

=======
import fmin362.model.Message;
import java.util.Date;
import java.util.List;
>>>>>>> 39cb48cb104823b96aa7f3ec0076fedc357e0774
import javax.naming.InitialContext;
import javax.persistence.EntityManager;
import javax.transaction.UserTransaction;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

<<<<<<< HEAD
import fmin362.model.User;

@Path("/messages" )
=======
@Path( "/messages" )
>>>>>>> 39cb48cb104823b96aa7f3ec0076fedc357e0774
public class MessagesResource
{

    @GET
    @Produces( MediaType.APPLICATION_JSON )
<<<<<<< HEAD
    public List<User> messages()
=======
    public List<Message> messages()
>>>>>>> 39cb48cb104823b96aa7f3ec0076fedc357e0774
            throws Exception
    {
        UserTransaction utx = null;
        try {

            // Lookup
            InitialContext ic = new InitialContext();
            utx = ( UserTransaction ) ic.lookup( "java:comp/UserTransaction" );
            EntityManager em = ( EntityManager ) ic.lookup( "java:comp/env/persistence/EntityManager" );

            // Transaciton begin
            utx.begin();
            em.joinTransaction();

<<<<<<< HEAD
            User u1 = new User("diop","diop@h","dd","1" );
            User u2 = new User("dupond","dupond@h","dp","2" );
            em.persist( u1);
            em.persist( u2);

            List<User> users = null;
            users.add(u1);
            users.add(u2);
            users= em.createQuery( "select m from Message m" ).getResultList();

            utx.commit();

            return users;
=======
            Message msg = new Message( "HHello World!", new Date() );
            em.persist( msg );

            List<Message> messages = em.createQuery( "select m from Message m" ).getResultList();

            utx.commit();

            return messages;
>>>>>>> 39cb48cb104823b96aa7f3ec0076fedc357e0774

        } catch ( Exception ex ) {

            try {
                if ( utx != null ) {
                    utx.setRollbackOnly();
                }
            } catch ( Exception rollbackEx ) {
                // Impossible d'annuler les changements, vous devriez logguer une erreur,
                // voir envoyer un email à l'exploitant de l'application.
            }
            throw new Exception( ex );

        }

    }

}
