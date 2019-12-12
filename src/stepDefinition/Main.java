package stepDefinition;

public class Main {

	public static void main(String[] args) throws Throwable {
		Test_Steps obj = new Test_Steps();
		
		obj.i_am_on_the_hompage();
		obj.i_click_the_sign_in_link();
		obj.i_see_an_auhentication_banner();
		obj.i_enter_an_email_address();
		obj.i_click_the_create_an_account_button();
		obj.i_fill_the_personal_information_form();
		obj.i_click_the_register_button();
		obj.i_should_be_registered();
		obj.i_click_on_my_personal_information_button();
		obj.i_see_YOUR_PERSONAL_INFORMATION_banner();
		obj.i_enter_my_current_password();
		obj.i_enter_my_new_password();
		obj.i_enter_my_password_confirmation();
		obj.i_click_the_save_button();
		obj.my_password_personal_information_should_be_changed_updated();
		obj.TearDown();
		
		
		obj.i_am_on_the_hompage();
		obj.i_click_the_sign_in_link();
		obj.i_see_an_auhentication_banner();
		obj.i_enter_a_valid_email_address();
		obj.i_enter_a_valid_password();
		obj.i_click_the_sign_in_button();
		obj.i_should_be_logged_in();
		obj.i_click_the_sign_out_link_to_log_out();
		obj.TearDown();
		
		
		obj.i_am_on_the_hompage();
		obj.i_click_the_sign_in_link();
		obj.i_see_an_auhentication_banner();
		obj.i_enter_an("mosh.agbosasa@yahoo.com");
		obj.i_enter_a("Alan");
		obj.i_click_the_sign_in_button();
		obj.i_should_get_an_error_message();
		obj.TearDown();
		
		
		obj.i_am_on_the_hompage();
		obj.i_click_the_sign_in_link();
		obj.i_see_an_auhentication_banner();
		obj.i_enter_an("moshie.agbosasa@yahoo.com");
		obj.i_enter_a("Isaac");
		obj.i_click_the_sign_in_button();
		obj.i_should_get_an_error_message();
		obj.TearDown();
		
		
		obj.i_am_on_the_hompage();
		obj.i_click_the_sign_in_link();
		obj.i_see_an_auhentication_banner();
		obj.i_enter_an(" ");
		obj.i_enter_a(" ");
		obj.i_click_the_sign_in_button();
		obj.i_should_get_an_error_message();
		obj.TearDown();
		
		
		obj.i_am_on_the_hompage();
		obj.i_click_the_sign_in_link();
		obj.i_see_an_auhentication_banner();
		obj.i_enter_an("mosh.agbosasa@yahoo.com");
		obj.i_enter_a(" ");
		obj.i_click_the_sign_in_button();
		obj.i_should_get_an_error_message();
		obj.TearDown();
		
		
		obj.i_am_on_the_hompage();
		obj.i_click_the_sign_in_link();
		obj.i_see_an_auhentication_banner();
		obj.i_enter_an(" ");
		obj.i_enter_a("Isaac");
		obj.i_click_the_sign_in_button();
		obj.i_should_get_an_error_message();
		obj.TearDown();
		
		
		obj.i_am_on_the_hompage();
		obj.i_click_the_sign_in_link();
		obj.i_see_an_auhentication_banner();
		obj.i_enter_an_email_address();
		obj.i_click_the_create_an_account_button();
		obj.i_fill_the_personal_information_form();
		obj.i_click_the_register_button();
		obj.i_should_be_registered();
		obj.i_click_the_sign_out_link_to_log_out();
		obj.TearDown();
		
		
		obj.i_am_on_the_hompage();
		obj.I_enter_a_search_keyword();
		obj.I_click_the_search_button();
		obj.the_searched_item_shoulbd_be_displayed();
		obj.TearDown();
		
		
		
		
		
		
		
		
		
		
		
		

	}

	}
	
