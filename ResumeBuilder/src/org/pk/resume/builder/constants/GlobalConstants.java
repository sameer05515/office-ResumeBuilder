package org.pk.resume.builder.constants;

import java.util.ArrayList;
import org.pk.resume.builder.beans.Achievements;
import org.pk.resume.builder.beans.Education;
import org.pk.resume.builder.beans.Experience;
import org.pk.resume.builder.beans.Participation;
import org.pk.resume.builder.beans.Projects;
import org.pk.resume.builder.beans.References;

public class GlobalConstants
{
	public static String JSP_PAGE = "index.jsp";
	
	public static String MESSAGE = "Click 'Fill Resume' To Insert Details...";
	
	public static String PERSONAL_DETAILS = "user_details";
	/**Additional fields added which were mentioned in ViePreview.jsp-- start ---*/
	public static String REFERENCES_DETAILS = "references_details";
	public static String EDUCATIONAL_DETAILS = "educational_details";
	public static String EXPERIENCE_DETAILS = "experience_details";
	public static String JOURNAL_DETAILS = "journal_details";
	public static String CONFERENCE_DETAILS = "conference_details";
	public static String BOOK_DETAILS = "book_details";
	public static String PARTICIPATION_DETAILS = "participation_details";
	public static String MEMBERSHIP_DETAILS = "membership_details";
	public static String EXPERT_ACTIVITY = "expert_activity";
	public static String ACHIEVEMENTS_DETAILS = "achievements_details";
	public static String PROJRCT_DETAILS = "projrct_details";
	/**Additional fields added which were mentioned in ViePreview.jsp-- end ---*/
	public static ArrayList<Education> educations = new ArrayList<Education>();
	public static ArrayList<Experience> experiences = new ArrayList<Experience>();
	public static ArrayList<Participation> participations =new ArrayList<Participation>();
	public static ArrayList<Achievements> achievements= new ArrayList<Achievements>();
	public static ArrayList<Projects> projects = new ArrayList<Projects>();
	public static ArrayList<References> references = new ArrayList<References>();
}