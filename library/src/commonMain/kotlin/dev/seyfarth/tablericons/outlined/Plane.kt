package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.Plane: ImageVector
    get() {
        if (_Plane != null) {
            return _Plane!!
        }
        _Plane = ImageVector.Builder(
            name = "Filled.Plane",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 10f)
                horizontalLineToRelative(4f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 4f)
                horizontalLineToRelative(-4f)
                lineToRelative(-4f, 7f)
                horizontalLineToRelative(-3f)
                lineToRelative(2f, -7f)
                horizontalLineToRelative(-4f)
                lineToRelative(-2f, 2f)
                horizontalLineToRelative(-3f)
                lineToRelative(2f, -4f)
                lineToRelative(-2f, -4f)
                horizontalLineToRelative(3f)
                lineToRelative(2f, 2f)
                horizontalLineToRelative(4f)
                lineToRelative(-2f, -7f)
                horizontalLineToRelative(3f)
                close()
            }
        }.build()

        return _Plane!!
    }

@Suppress("ObjectPropertyName")
private var _Plane: ImageVector? = null
