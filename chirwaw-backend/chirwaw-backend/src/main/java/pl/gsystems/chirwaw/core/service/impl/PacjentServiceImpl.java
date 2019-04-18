package pl.gsystems.chirwaw.core.service.impl;

import org.springframework.stereotype.Service;
import pl.gsystems.chirwaw.common.exception.ApplicationException;
import pl.gsystems.chirwaw.common.exception.BusinessExceptionsCode;
import pl.gsystems.chirwaw.core.dto.PacjentCoreDto;
import pl.gsystems.chirwaw.core.service.PacjentService;

import java.io.*;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

@Service
public class PacjentServiceImpl implements PacjentService {

    private static Map<Integer, PacjentCoreDto> baza = null;

    private String dbFilePath = System.getProperty("java.io.tmpdir") + File.separator + "chirwawDBfile.txt";

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
                dto.setPacjentId(1);
                baza.put(1, dto);
                persist();
                return 1;
            }
            Integer max = Collections.max(baza.keySet());
            dto.setPacjentId(max + 1);
            baza.put(max + 1, dto);
            persist();
            return max + 1;
        }
    }

    @Override
    public List<PacjentCoreDto> search(PacjentCoreDto dto) {

        List<PacjentCoreDto> collect = baza.values().stream().filter(p ->
                (dto.getPacjentId() == null || p.getPacjentId().equals(dto.getPacjentId())) &&
                (dto.getImie() == null || dto.getImie().isEmpty() || p.getImie().equalsIgnoreCase(dto.getImie())) &&
                (dto.getNazwisko() == null || dto.getNazwisko().isEmpty() ||  p.getNazwisko().equalsIgnoreCase(dto.getNazwisko())) &&
                (dto.getPesel() == null || dto.getPesel().isEmpty() ||  p.getPesel().equalsIgnoreCase(dto.getPesel())) &&
                (dto.getTelKontakt() == null || dto.getTelKontakt().isEmpty() ||  p.getTelKontakt().equalsIgnoreCase(dto.getTelKontakt())) &&
                (dto.getDataZgonu() == null || p.getDataZgonu().equals(dto.getDataZgonu()))
        ).collect(Collectors.toList());
        return collect;
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

    private void persist() {
        try {
            FileOutputStream f = new FileOutputStream(new File(dbFilePath));

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
                FileInputStream fi = new FileInputStream(new File(dbFilePath));
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

    }
}