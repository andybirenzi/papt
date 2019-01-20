package birenzi.dev.springbootmongodb.service;


import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;



import birenzi.dev.springbootmongodb.modelLayer.model.Role;
import birenzi.dev.springbootmongodb.modelLayer.repository.RoleRepo;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RoleServiceTest {

    @Autowired
    private RoleService roleService;

    @MockBean
    private RoleRepo roleRepo;

    @Test
    public void testGetAllRoles() {
        when(roleRepo.findAll()).thenReturn(Stream
                .of(new Role("manager","Managing the application"), new Role("contributor","contribution role")).collect(Collectors.toList()));
        assertEquals(2,roleService.getAllRoles().size());
    }

    @Test
    public void addOneRole() {
        Role role  = new Role("inspector", "another role for test");
        when(roleRepo.insert(role)).thenReturn(role);
        assertEquals(role,roleService.addOneRole(role));
    }

    @Test
    public void deleteOneRole() {
        String id = "12";
        roleService.deleteOneRole(id);
        verify(roleRepo,times(1)).deleteById(id);

    }
}
