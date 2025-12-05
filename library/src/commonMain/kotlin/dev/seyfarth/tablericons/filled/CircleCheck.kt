package dev.seyfarth.tablericons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Filled.CircleCheck: ImageVector
    get() {
        if (_CircleCheck != null) {
            return _CircleCheck!!
        }
        _CircleCheck = ImageVector.Builder(
            name = "Filled.CircleCheck",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 3.34f)
                arcToRelative(10f, 10f, 0f, isMoreThanHalf = true, isPositiveArc = true, -14.995f, 8.984f)
                lineToRelative(-0.005f, -0.324f)
                lineToRelative(0.005f, -0.324f)
                arcToRelative(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14.995f, -8.336f)
                close()
                moveTo(15.707f, 9.293f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.32f, -0.083f)
                lineToRelative(-0.094f, 0.083f)
                lineToRelative(-3.293f, 3.292f)
                lineToRelative(-1.293f, -1.292f)
                lineToRelative(-0.094f, -0.083f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.403f, 1.403f)
                lineToRelative(0.083f, 0.094f)
                lineToRelative(2f, 2f)
                lineToRelative(0.094f, 0.083f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.226f, 0f)
                lineToRelative(0.094f, -0.083f)
                lineToRelative(4f, -4f)
                lineToRelative(0.083f, -0.094f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.083f, -1.32f)
                close()
            }
        }.build()

        return _CircleCheck!!
    }

@Suppress("ObjectPropertyName")
private var _CircleCheck: ImageVector? = null
