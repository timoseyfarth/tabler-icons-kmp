package dev.seyfarth.tablericons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Filled.CircleCaretLeft: ImageVector
    get() {
        if (_CircleCaretLeft != null) {
            return _CircleCaretLeft!!
        }
        _CircleCaretLeft = ImageVector.Builder(
            name = "Filled.CircleCaretLeft",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2f)
                curveToRelative(5.523f, 0f, 10f, 4.477f, 10f, 10f)
                reflectiveCurveToRelative(-4.477f, 10f, -10f, 10f)
                arcToRelative(10f, 10f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, -20f)
                moveToRelative(2f, 13f)
                verticalLineToRelative(-6f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.707f, -0.708f)
                lineToRelative(-3f, 3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1.415f)
                lineToRelative(3f, 3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.414f, 0f)
                lineToRelative(0.083f, -0.094f)
                curveToRelative(0.14f, -0.18f, 0.21f, -0.396f, 0.21f, -0.613f)
            }
        }.build()

        return _CircleCaretLeft!!
    }

@Suppress("ObjectPropertyName")
private var _CircleCaretLeft: ImageVector? = null
