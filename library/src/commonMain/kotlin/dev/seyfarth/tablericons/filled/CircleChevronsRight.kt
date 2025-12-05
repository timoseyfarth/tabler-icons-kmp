package dev.seyfarth.tablericons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Filled.CircleChevronsRight: ImageVector
    get() {
        if (_CircleChevronsRight != null) {
            return _CircleChevronsRight!!
        }
        _CircleChevronsRight = ImageVector.Builder(
            name = "Filled.CircleChevronsRight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.073f, 1.868f)
                curveToRelative(5.494f, 0.04f, 9.926f, 4.505f, 9.926f, 10f)
                curveToRelative(0f, 5.494f, -4.432f, 9.959f, -9.926f, 10f)
                curveToRelative(-5.494f, 0.04f, -9.992f, -4.36f, -10.073f, -9.853f)
                verticalLineToRelative(-0.295f)
                curveToRelative(0.081f, -5.493f, 4.579f, -9.893f, 10.073f, -9.852f)
                moveToRelative(-2.366f, 6.425f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.414f, 0f)
                lineToRelative(-0.083f, 0.094f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.083f, 1.32f)
                lineToRelative(2.292f, 2.293f)
                lineToRelative(-2.292f, 2.293f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.414f, 1.414f)
                lineToRelative(3f, -3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.414f)
                close()
                moveTo(13.707f, 8.293f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.414f, 0f)
                lineToRelative(-0.083f, 0.094f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.083f, 1.32f)
                lineToRelative(2.292f, 2.293f)
                lineToRelative(-2.292f, 2.293f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.414f, 1.414f)
                lineToRelative(3f, -3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.414f)
                close()
            }
        }.build()

        return _CircleChevronsRight!!
    }

@Suppress("ObjectPropertyName")
private var _CircleChevronsRight: ImageVector? = null
