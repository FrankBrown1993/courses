/**
 * generated by Xtext 2.32.0
 */
package swa.dsl.courses.generator;

import com.google.common.collect.Iterables;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import swa.dsl.courses.orga.Course;
import swa.dsl.courses.orga.Declaration;
import swa.dsl.courses.orga.Room;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class OrgaGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    EList<EObject> _contents = resource.getContents();
    EObject _head = null;
    if (_contents!=null) {
      _head=IterableExtensions.<EObject>head(_contents);
    }
    boolean _tripleEquals = (_head == null);
    if (_tripleEquals) {
      return;
    }
    final Iterable<Declaration> declarations = Iterables.<Declaration>filter(IterableExtensions.<EObject>head(resource.getContents()).eContents(), Declaration.class);
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("function getCourses() {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("const courses = [");
    _builder.newLine();
    {
      Iterable<Course> _filter = Iterables.<Course>filter(declarations, Course.class);
      boolean _hasElements = false;
      for(final Course course : _filter) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(",", "    \t");
        }
        _builder.append("    \t");
        _builder.append("{");
        _builder.newLine();
        _builder.append("    \t");
        _builder.append("\t");
        _builder.append("department: \'");
        String _department = course.getDepartment();
        _builder.append(_department, "    \t\t");
        _builder.append("\',");
        _builder.newLineIfNotEmpty();
        _builder.append("    \t\t            ");
        _builder.append("title: \'");
        String _title = course.getTitle();
        _builder.append(_title, "    \t\t            ");
        _builder.append("\',");
        _builder.newLineIfNotEmpty();
        _builder.append("    \t\t            ");
        _builder.append("type: \'");
        String _type = course.getType();
        _builder.append(_type, "    \t\t            ");
        _builder.append("\',");
        _builder.newLineIfNotEmpty();
        {
          boolean _equalsIgnoreCase = course.getAudience().equalsIgnoreCase("big");
          if (_equalsIgnoreCase) {
            _builder.append("\t\t\t\t\t\t");
            _builder.append("audience: 3,");
            _builder.newLine();
          } else {
            boolean _equalsIgnoreCase_1 = course.getAudience().equalsIgnoreCase("medium");
            if (_equalsIgnoreCase_1) {
              _builder.append("\t\t\t\t\t\t");
              _builder.append("audience: 2,");
              _builder.newLine();
            } else {
              _builder.append("\t\t\t\t\t\t");
              _builder.append("audience: 1,");
              _builder.newLine();
            }
          }
        }
        _builder.append("    \t\t            ");
        _builder.append("mapping: \'");
        String _course_cat = course.getCourse_cat();
        _builder.append(_course_cat, "    \t\t            ");
        _builder.append("\'");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t            ");
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.append("    ");
    _builder.append("]");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("return courses;");
    _builder.newLine();
    _builder.append("\t\t    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t    ");
    _builder.newLine();
    _builder.append("\t\t    ");
    _builder.append("function getRooms() {");
    _builder.newLine();
    _builder.append("\t\t        ");
    _builder.append("const rooms = [");
    _builder.newLine();
    {
      Iterable<Room> _filter_1 = Iterables.<Room>filter(declarations, Room.class);
      boolean _hasElements_1 = false;
      for(final Room room : _filter_1) {
        if (!_hasElements_1) {
          _hasElements_1 = true;
        } else {
          _builder.appendImmediate(",", "");
        }
        _builder.append("\t\t        \t");
        _builder.append("{");
        _builder.newLine();
        {
          boolean _equalsIgnoreCase_2 = room.getAudience().equalsIgnoreCase("big");
          if (_equalsIgnoreCase_2) {
            _builder.append("audience: 3,");
            _builder.newLine();
          } else {
            boolean _equalsIgnoreCase_3 = room.getAudience().equalsIgnoreCase("medium");
            if (_equalsIgnoreCase_3) {
              _builder.append("audience: 2,");
              _builder.newLine();
            } else {
              _builder.append("audience: 1,");
              _builder.newLine();
            }
          }
        }
        _builder.append("                        ");
        _builder.append("location: \'");
        String _location = room.getLocation();
        _builder.append(_location, "                        ");
        _builder.append("\'");
        _builder.newLineIfNotEmpty();
        _builder.append("                    ");
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.append("\t\t        ");
    _builder.append("]");
    _builder.newLine();
    _builder.append("\t\t        ");
    _builder.append("return rooms;");
    _builder.newLine();
    _builder.append("\t\t    ");
    _builder.append("}");
    _builder.newLine();
    fsa.generateFile("data.js", _builder);
  }
}
