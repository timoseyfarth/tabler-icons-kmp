package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.PencilOff: ImageVector
    get() {
        if (_PencilOff != null) {
            return _PencilOff!!
        }
        _PencilOff = ImageVector.Builder(
            name = "Filled.PencilOff",
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
                moveTo(10f, 10f)
                lineToRelative(-6f, 6f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(4f)
                lineToRelative(6f, -6f)
                moveToRelative(1.99f, -1.99f)
                lineToRelative(2.504f, -2.504f)
                arcToRelative(2.828f, 2.828f, 0f, isMoreThanHalf = true, isPositiveArc = false, -4f, -4f)
                lineToRelative(-2.5f, 2.5f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13.5f, 6.5f)
                lineToRelative(4f, 4f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 3f)
                lineToRelative(18f, 18f)
            }
        }.build()

        return _PencilOff!!
    }

@Suppress("ObjectPropertyName")
private var _PencilOff: ImageVector? = null
