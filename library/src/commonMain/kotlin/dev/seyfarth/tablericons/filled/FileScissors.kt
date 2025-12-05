package dev.seyfarth.tablericons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Filled.FileScissors: ImageVector
    get() {
        if (_FileScissors != null) {
            return _FileScissors!!
        }
        _FileScissors = ImageVector.Builder(
            name = "Filled.FileScissors",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2f)
                lineToRelative(0.117f, 0.007f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.876f, 0.876f)
                lineToRelative(0.007f, 0.117f)
                verticalLineToRelative(4f)
                lineToRelative(0.005f, 0.15f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.838f, 1.844f)
                lineToRelative(0.157f, 0.006f)
                horizontalLineToRelative(4f)
                lineToRelative(0.117f, 0.007f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.876f, 0.876f)
                lineToRelative(0.007f, 0.117f)
                verticalLineToRelative(9f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.824f, 2.995f)
                lineToRelative(-0.176f, 0.005f)
                horizontalLineToRelative(-10f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.995f, -2.824f)
                lineToRelative(-0.005f, -0.176f)
                verticalLineToRelative(-14f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.824f, -2.995f)
                lineToRelative(0.176f, -0.005f)
                close()
                moveTo(9.707f, 11.293f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, -1.414f, 1.414f)
                lineToRelative(2.292f, 2.293f)
                lineToRelative(-1.068f, 1.067f)
                arcToRelative(2.003f, 2.003f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.512f, 1.784f)
                lineToRelative(-0.005f, 0.149f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = false, 3.933f, -0.516f)
                lineToRelative(1.067f, -1.069f)
                lineToRelative(1.067f, 1.068f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.062f, 0.368f)
                lineToRelative(-0.005f, 0.149f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.484f, -1.933f)
                lineToRelative(-1.069f, -1.067f)
                lineToRelative(2.292f, -2.293f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.414f, -1.414f)
                lineToRelative(-2.293f, 2.292f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 7f)
                horizontalLineToRelative(-4f)
                lineToRelative(-0.001f, -4.001f)
                close()
            }
        }.build()

        return _FileScissors!!
    }

@Suppress("ObjectPropertyName")
private var _FileScissors: ImageVector? = null
