package pl.gsystems.chirwaw.core.service.impl;

import com.google.common.base.Strings;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import pl.gsystems.chirwaw.api.dto.PacjentChorobaSearchDto;
import pl.gsystems.chirwaw.api.dto.PacjentChorobaSearchResultDto;
import pl.gsystems.chirwaw.api.dto.PacjentSearchDto;
import pl.gsystems.chirwaw.common.exception.ApplicationException;
import pl.gsystems.chirwaw.common.exception.BusinessExceptionsCode;
import pl.gsystems.chirwaw.core.dto.PacjentCoreDto;
import pl.gsystems.chirwaw.core.service.PacjentService;

import java.io.*;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

@Service
public class PacjentServiceImpl implements PacjentService {

    private static Map<Integer, PacjentCoreDto> baza = null;

    public PacjentServiceImpl() {
        restore();
    }

    @Override
    public PacjentCoreDto getPacjent(int id) {
        PacjentCoreDto pacjentCoreDto = baza.get(id);
        if(pacjentCoreDto == null) {
            throw new ApplicationException(BusinessExceptionsCode.PACJENT_DO_NOT_FOUND);
        } else {
            return pacjentCoreDto;
        }
    }

    @Override
    public synchronized int savePacjent(PacjentCoreDto dto) {
        if(dto.getPacjentId() != null) { // update
            if( baza.containsKey(dto.getPacjentId()) ) {
                baza.put(dto.getPacjentId(), dto);
                persist();
                return dto.getPacjentId();
            } else {
                throw new ApplicationException(BusinessExceptionsCode.PACJENT_DO_NOT_FOUND);
            }
        } else { // add new
            if(baza.keySet().isEmpty()) {
                baza.put(1, dto); // zabazpieczyc przed wielowatkowości
                persist();
                return 1;
            }
            Integer max = Collections.max(baza.keySet());
            baza.put(max + 1, dto); // zabazpieczyc przed wielowatkowością
            persist();
            return max + 1;
        }
    }

    @Override
    public boolean deletePacjent(int id) {
        if(baza.containsKey(id)) {
            baza.remove(id);
            persist();
            return true;
        } else {
            return false;
        }
    }

    @Override
    public List<PacjentCoreDto> searchPacjent(PacjentSearchDto s) {
        List<PacjentCoreDto> collect = baza.values().stream().filter(p -> {
            boolean c;
            c = (StringUtils.isEmpty(s.getImie()) || p.getImie().equalsIgnoreCase(s.getImie())) &&
                    (StringUtils.isEmpty(s.getNazwisko()) || p.getNazwisko().equalsIgnoreCase(s.getNazwisko())) &&
                    (StringUtils.isEmpty(s.getPesel()) || p.getPesel().equalsIgnoreCase(s.getPesel())) &&
                    (StringUtils.isEmpty(s.getTelKontakt()) || p.getTelKontakt().equalsIgnoreCase(s.getTelKontakt())) &&
//                    (s.getDataZgonuStart() != null && p.getDataZgonu().after(s.getDataZgonuStart())) &&
//                    (s.getDataZgonuEnd() != null && p.getDataZgonu().before(s.getDataZgonuEnd()));
                true;
            // TODO sprawdzanie po ID
            return c;
        }).collect(Collectors.toList());


        return collect;
    }

    private void persist() {
        try {
            FileOutputStream f = new FileOutputStream(new File(System.getProperty("java.io.tmpdir") + File.separator + "myObjects.txt"));

            ObjectOutputStream o = new ObjectOutputStream(f);

            // Write objects to file
            o.writeObject(baza);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void restore() {
        if (baza == null) {
            try {
                FileInputStream fi = new FileInputStream(new File(System.getProperty("java.io.tmpdir") + File.separator + "myObjects.txt"));
                ObjectInputStream oi = new ObjectInputStream(fi);
                Map<Integer, PacjentCoreDto> pr1 = (Map<Integer, PacjentCoreDto>) oi.readObject();
                baza = pr1;
            } catch (FileNotFoundException e) {
                e.printStackTrace();
                baza = new ConcurrentHashMap<>();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }





        // Read objects
        //Person pr1 = (Person) oi.readObject();
    }
}