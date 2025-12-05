package dev.seyfarth.tablericons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Filled.Train: ImageVector
    get() {
        if (_Train != null) {
            return _Train!!
        }
        _Train = ImageVector.Builder(
            name = "Filled.Train",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 5f)
                curveToRelative(6.634f, 0f, 10.853f, 3.11f, 10.996f, 7.754f)
                lineToRelative(0.004f, 0.246f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, 3f)
                horizontalLineToRelative(-16f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, -1f)
                verticalLineToRelative(-9f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, -1f)
                close()
                moveTo(7f, 7f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3f)
                close()
                moveTo(11f, 7f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2.974f)
                arcToRelative(19f, 19f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, -0.026f)
                moveToRelative(3.001f, 0.257f)
                lineToRelative(-0.001f, 2.743f)
                horizontalLineToRelative(5.04f)
                curveToRelative(-0.979f, -1.337f, -2.689f, -2.306f, -5.039f, -2.743f)
                moveToRelative(6.999f, 10.743f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 2f)
                horizontalLineToRelative(-18f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -2f)
                close()
            }
        }.build()

        return _Train!!
    }

@Suppress("ObjectPropertyName")
private var _Train: ImageVector? = null
