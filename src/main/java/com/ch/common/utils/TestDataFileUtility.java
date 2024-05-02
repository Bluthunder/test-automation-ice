package com.ch.common.utils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import com.ch.common.bean.CardDetails;
import com.ch.common.bean.InvalidLogin;
import com.ch.common.bean.LogIn;
import com.ch.common.bean.NewAddress;
import com.ch.common.bean.User;
import com.ch.constants.FileConstants;

public class TestDataFileUtility
{

    private TestDataFileUtility()
    {

    }

    public static ArrayList<User> readAllUserData()
    {

        ArrayList<User> data = new ArrayList<User>();
        try (BufferedReader reader = new BufferedReader(new FileReader(FileConstants.USER_DATA_FILE)))
        {

            String line = reader.readLine();
            line = reader.readLine();
            while (null != line)
            {
                String[] records = line.split(",");
                if (records.length >= 6)
                {
                    data.add(new User(records));
                }
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e)
        {

            e.printStackTrace();
        }

        return data;
    }

    public static ArrayList<LogIn> readSignInData()
    {

        ArrayList<LogIn> data = new ArrayList<LogIn>();

        try (BufferedReader reader = new BufferedReader(new FileReader(FileConstants.LOGIN_DATA_FILE)))
        {

            String line = reader.readLine();
            line = reader.readLine();
            while (null != line)
            {
                String[] records = line.split(",");
                if (records.length >= 2)
                {
                    data.add(new LogIn(records));
                }
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e)
        {

            e.printStackTrace();
        }

        return data;
    }

    public static ArrayList<InvalidLogin> readInvalidSignInData()
    {
        ArrayList<InvalidLogin> data = new ArrayList<InvalidLogin>();

        try (BufferedReader reader = new BufferedReader(new FileReader(FileConstants.INVALIDLOGIN_DATAFILE)))
        {

            String line = reader.readLine();
            line = reader.readLine();
            while (null != line)
            {
                String[] records = line.split(",");
                if (records.length >= 3)
                {
                    data.add(new InvalidLogin(records));
                }
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e)
        {

            e.printStackTrace();
        }

        return data;
    }

    public static ArrayList<NewAddress> readNewAddressData()
    {
        ArrayList<NewAddress> data = new ArrayList<NewAddress>();
        try (BufferedReader reader = new BufferedReader(new FileReader(FileConstants.NEWADDRESS_DATA_FILE)))
        {

            String line = reader.readLine();
            line = reader.readLine();
            while (null != line)
            {
                String[] records = line.split(",");
                if (records.length >= 9)
                {
                    data.add(new NewAddress(records));
                }
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e)
        {

            e.printStackTrace();
        }

        return data;
    }

    public static ArrayList<CardDetails> readNewCardDetails()
    {

        ArrayList<CardDetails> data = new ArrayList<CardDetails>();

        try (BufferedReader reader = new BufferedReader(new FileReader(FileConstants.CARD_DETAILS_FILE)))
        {

            String line = reader.readLine();
            line = reader.readLine();
            while (null != line)
            {
                String[] records = line.split(",");
                if (records.length >= 6)
                {
                    data.add(new CardDetails(records));
                }
                line = reader.readLine();
            }
            reader.close();
        } catch (FileNotFoundException e)
        {

            e.printStackTrace();
        } catch (IOException fe)
        {

            fe.printStackTrace();
        }

        return data;
    }

    public static ArrayList<NewAddress> readAllAddres()
    {
        ArrayList<NewAddress> data = new ArrayList<NewAddress>();

        try (BufferedReader reader = new BufferedReader(new FileReader(FileConstants.NEWADDRESS_DATA_FILE)))
        {

            String line = reader.readLine();
            line = reader.readLine();
            while (null != line)
            {
                String[] records = line.split(",");
                if (records.length >= 8)
                {
                    data.add(new NewAddress(records));
                }
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e)
        {

            e.printStackTrace();
        }

        return data;
    }

    public static ArrayList<NewAddress> readInternationalAddres()
    {
        ArrayList<NewAddress> data = new ArrayList<NewAddress>();

        try (BufferedReader reader = new BufferedReader(new FileReader(FileConstants.INTERNATIONALADDRESS_DATA_FILE)))
        {

            String line = reader.readLine();
            line = reader.readLine();
            while (null != line)
            {
                String[] records = line.split(",");
                if (records.length >= 8)
                {
                    data.add(new NewAddress(records));
                }
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e)
        {

            e.printStackTrace();
        }

        return data;
    }

    public static ArrayList<NewAddress> readAllAPOAddres()
    {
        ArrayList<NewAddress> data = new ArrayList<NewAddress>();

        try (BufferedReader reader = new BufferedReader(new FileReader(FileConstants.APO_ADDRESS_DATA_FILE)))
        {

            String line = reader.readLine();
            line = reader.readLine();
            while (null != line)
            {
                String[] records = line.split(",");
                if (records.length >= 8)
                {
                    data.add(new NewAddress(records));
                }
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e)
        {

            e.printStackTrace();
        }

        return data;
    }

    public static ArrayList<NewAddress> readAllFPOAddress()
    {
        ArrayList<NewAddress> data = new ArrayList<NewAddress>();

        try (BufferedReader reader = new BufferedReader(new FileReader(FileConstants.FPO_ADDRESS_DATA_FILE)))
        {

            String line = reader.readLine();
            line = reader.readLine();
            while (null != line)
            {
                String[] records = line.split(",");
                if (records.length >= 8)
                {
                    data.add(new NewAddress(records));
                }
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e)
        {

            e.printStackTrace();
        }

        return data;
    }



    public static ArrayList<InvalidLogin> readAllInvalidLoginData()
    {
        ArrayList<InvalidLogin> data = new ArrayList<InvalidLogin>();

        try (BufferedReader reader = new BufferedReader(new FileReader(FileConstants.INVALIDLOGIN_DATAFILE)))
        {

            String line = reader.readLine();
            line = reader.readLine();
            while (null != line)
            {
                String[] records = line.split(",");
                if (records.length >= 3)
                {
                    data.add(new InvalidLogin(records));
                }
                line = reader.readLine();
            }
            reader.close();
        } catch (FileNotFoundException e)
        {

            e.printStackTrace();
        } catch (IOException fe)
        {

            fe.printStackTrace();
        }

        return data;
    }
    
    
    
    
//  public static ArrayList<GiftCardDetail> readGiftCardDetails()
//  {
//
//      ArrayList<GiftCardDetail> data = new ArrayList<GiftCardDetail>();
//
//      try (BufferedReader reader = new BufferedReader(new FileReader(FileConstants.GIFT_CARD_DETAILS_FILE)))
//      {
//
//          String line = reader.readLine();
//          line = reader.readLine();
//          while (null != line)
//          {
//              String[] records = line.split(",");
//              if (records.length >= 6)
//              {
//                  data.add(new GiftCardDetail(records));
//              }
//              line = reader.readLine();
//          }
//          reader.close();
//      } catch (FileNotFoundException e)
//      {
//
//          e.printStackTrace();
//      } catch (IOException fe)
//      {
//
//          fe.printStackTrace();
//      }
//
//      return data;
//  }
    
    
    
    

}
