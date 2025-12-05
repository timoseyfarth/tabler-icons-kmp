package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.IroningOff: ImageVector
    get() {
        if (_IroningOff != null) {
            return _IroningOff!!
        }
        _IroningOff = ImageVector.Builder(
            name = "Filled.IroningOff",
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
                moveTo(10f, 6f)
                horizontalLineToRelative(6.459f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.959f, 2.507f)
                lineToRelative(0.577f, 3.464f)
                lineToRelative(0.804f, 4.821f)
                lineToRelative(0.007f, 0.044f)
                moveToRelative(-2.806f, 1.164f)
                horizontalLineToRelative(-15f)
                arcToRelative(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, -7f)
                horizontalLineToRelative(1f)
                moveToRelative(4f, 0f)
                horizontalLineToRelative(4.8f)
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

        return _IroningOff!!
    }

@Suppress("ObjectPropertyName")
private var _IroningOff: ImageVector? = null
