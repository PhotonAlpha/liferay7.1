package com.ethan.rest.application;

import com.ethan.rest.application.model.HelloWorld;
import com.ethan.svc.model.Guestbook;
import com.ethan.svc.service.GuestbookLocalServiceUtil;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.dynamic.data.mapping.form.builder.context.DDMFormBuilderContextRequest;
import com.liferay.dynamic.data.mapping.model.DDMContent;
import com.liferay.dynamic.data.mapping.model.DDMForm;
import com.liferay.dynamic.data.mapping.model.DDMFormField;
import com.liferay.dynamic.data.mapping.model.DDMFormFieldOptions;
import com.liferay.dynamic.data.mapping.model.DDMFormInstance;
import com.liferay.dynamic.data.mapping.model.DDMFormInstanceRecord;
import com.liferay.dynamic.data.mapping.model.LocalizedValue;
import com.liferay.dynamic.data.mapping.service.DDMContentLocalServiceUtil;
import com.liferay.dynamic.data.mapping.service.DDMFormInstanceLocalServiceUtil;
import com.liferay.dynamic.data.mapping.service.DDMFormInstanceRecordLocalServiceUtil;
import com.liferay.dynamic.data.mapping.service.persistence.DDMFormInstanceRecordPersistence;
import com.liferay.dynamic.data.mapping.service.persistence.DDMFormInstanceRecordUtil;
import com.liferay.dynamic.data.mapping.service.persistence.DDMFormInstanceUtil;
import com.liferay.dynamic.data.mapping.storage.DDMFormValues;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import org.osgi.service.component.annotations.Reference;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;

@Path("/greetings")
public class GuestbookResource {
  @GET
  @Path(("/translation/{lang}"))
  @Produces(MediaType.APPLICATION_JSON)
  @Consumes(MediaType.APPLICATION_JSON)
  public Response getTranslation(@PathParam("lang") String lang) throws PortalException {
    System.out.println("lang:" + lang);

    // Locale locale = new Locale(lang, "CN");

    ObjectMapper objectMapper = new ObjectMapper();
    ObjectNode objectNode = objectMapper.createObjectNode();

    ObjectNode idealNode = objectMapper.createObjectNode();
    DDMFormInstance ddmFormInstance = DDMFormInstanceLocalServiceUtil.getDDMFormInstance(33901);

    Locale locale = new Locale(ddmFormInstance.getDefaultLanguageId());

    DDMForm ddmForm = ddmFormInstance.getStructure().getDDMForm();
    List<DDMFormField> ddmFormFields = ddmForm.getDDMFormFields();
    for (DDMFormField ddmFormField : ddmFormFields) {
      // paragraph
      // ((LocalizedValue)ddmFormField.getProperties().get("text")).getString(Locale.ENGLISH)
      String name = ddmFormField.getName();
      LocalizedValue label = ddmFormField.getLabel();
      String labelName = label.getString(locale);
      System.out.print(name + "   ----  ");
      System.out.println(labelName + "   ----  ");

      idealNode.put(name, labelName);

      DDMFormFieldOptions ddmFormFieldOptions = ddmFormField.getDDMFormFieldOptions();
      Map<String, LocalizedValue> options = ddmFormFieldOptions.getOptions();
      ObjectNode optionNode = objectMapper.createObjectNode();
      options.entrySet().stream().forEach(entry -> {
        optionNode.put(entry.getKey(), entry.getValue().getString(locale));
        System.out.println(entry.getKey() + "||" + entry.getValue().getString(locale));
      });
      if (!options.isEmpty()) {
        idealNode.set(name + "Option", optionNode);
      }
    }

    objectNode.set("idealTranslation", idealNode);

    return Response.ok(objectNode).build();
  }

  @GET
  @Produces(MediaType.APPLICATION_JSON)
  @Consumes(MediaType.APPLICATION_JSON)
  public Response working(@Context HttpServletRequest httpServletRequest) throws PortalException {
    ServiceContext serviceContext = ServiceContextFactory.getInstance(httpServletRequest);
    long userId = serviceContext.getUserId();
    long scopeGroupId = serviceContext.getScopeGroupId();
    System.out.println("userId:" + userId + " scopeGroupId:" + scopeGroupId);

    Guestbook guestbook = GuestbookLocalServiceUtil.addGuestbook(
        		serviceContext.getUserId(), "Main", serviceContext);

    long guestbookId = guestbook.getGuestbookId();
    System.out.println("guestbookId:" + guestbookId);
    return Response.ok(guestbook).build();
  }

  @Reference
  private DDMFormInstanceRecordPersistence formInstanceRecordPersistence;

  @GET
  @Path("/form")
  @Produces("text/plain")
  public String hello(@Context HttpServletRequest httpServletRequest) throws PortalException {
    ServiceContext serviceContext = ServiceContextFactory.getInstance(httpServletRequest);
    long userId = serviceContext.getUserId();
    long scopeGroupId = serviceContext.getScopeGroupId();

    // List<DDMFormInstance> ddmFormInstances = DDMFormInstanceLocalServiceUtil.getDDMFormInstances(QueryUtil.ALL_POS, QueryUtil.ALL_POS);
    // Optional<DDMFormInstance> formInstance = ddmFormInstances.stream().filter(form -> "FormIdeal".equalsIgnoreCase(form.getName(Locale.ENGLISH))).findFirst();

    ObjectMapper objectMapper = new ObjectMapper();
    ObjectNode objectNode = objectMapper.createObjectNode();

    DDMFormInstance ddmFormInstance = DDMFormInstanceLocalServiceUtil.getDDMFormInstance(33901);

    DDMForm ddmForm = ddmFormInstance.getStructure().getDDMForm();
    List<DDMFormField> ddmFormFields = ddmForm.getDDMFormFields();
    for (DDMFormField ddmFormField : ddmFormFields) {
      // paragraph
      // ((LocalizedValue)ddmFormField.getProperties().get("text")).getString(Locale.ENGLISH)
      String name = ddmFormField.getName();
      LocalizedValue label = ddmFormField.getLabel();
      String labelName = label.getString(Locale.ENGLISH);
      System.out.print(name + "   ----  ");
      System.out.println(labelName + "   ----  ");

      objectNode.put(name, labelName);

      DDMFormFieldOptions ddmFormFieldOptions = ddmFormField.getDDMFormFieldOptions();
      Map<String, LocalizedValue> options = ddmFormFieldOptions.getOptions();
      ObjectNode subNode = objectMapper.createObjectNode();
      options.entrySet().stream().forEach(entry -> {
        subNode.put(entry.getKey(), entry.getValue().getString(Locale.ENGLISH));
        System.out.println(entry.getKey() + "||" + entry.getValue().getString(Locale.ENGLISH));
      });

      if (subNode.isNull()) {
        objectNode.set(name + "Option", subNode);
      }
    }


    List<DDMFormInstanceRecord> formInstanceRecords = DDMFormInstanceRecordLocalServiceUtil.getFormInstanceRecords(ddmFormInstance.getFormInstanceId());

    // DDMFormBuilderContextRequest

    DDMFormInstanceRecordPersistence persistence = DDMFormInstanceRecordUtil.getPersistence();
    long increment = CounterLocalServiceUtil.increment();

    DDMFormInstanceRecord record1 = persistence.create(increment);
    record1.setCompanyId(serviceContext.getCompanyId());
    // record1.set

    for (DDMFormInstanceRecord record : formInstanceRecords) {
      long storageId = record.getStorageId();
      DDMContent content = DDMContentLocalServiceUtil.getContent(storageId);
      String data = content.getData();
      System.out.println("data:" + data);
    }

    return "Good morning!";
  }


  @POST
  @Path("/hello")
  @Produces(MediaType.APPLICATION_JSON)
  @Consumes(MediaType.APPLICATION_JSON)
  public Response hello(HelloWorld helloWorld, @Context SecurityContext securityContext) {
    // Portal portal = PortalUtil.getPortal();
    // PortalUtil.getHttpServletRequest(portal)
    // ServiceContextFactory.getInstance()
// get the current HttpServletRequest for building the service context instance.
    String name = securityContext.getUserPrincipal().getName();
    // long groupId = serviceContext.getScopeGroupId();
    System.out.println("groupId:" + name);

    // Guestbook guestbook = _guestbookLocalService.addGuestbook(
    // 		serviceContext.getUserId(), "Main", serviceContext);

    // long guestbookId = guestbook.getGuestbookId();
    // System.out.println("guestbookId:" + guestbookId);
    // String res = GuestbookEntryLocalServiceUtil.getOSGiServiceIdentifier();


    // System.out.println(res);
    System.out.println(helloWorld);
    HelloWorld h = new HelloWorld();
    h.setName("abc");
    // GuestBookResourceImpl impl = new GuestBookResourceImpl();
    // String result = impl.hello(h);
    System.out.println("=====>");
    return Response.ok(h, MediaType.APPLICATION_JSON_TYPE).build();
    // return Response.ok(objectMapper.writeValueAsString(h), MediaType.APPLICATION_JSON_TYPE).build();
  }

}
