package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.Ironing: ImageVector
    get() {
        if (_Ironing != null) {
            return _Ironing!!
        }
        _Ironing = ImageVector.Builder(
            name = "Filled.Ironing",
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
                moveTo(9f, 6f)
                horizontalLineToRelative(7.459f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.959f, 2.507f)
                lineToRelative(0.577f, 3.464f)
                lineToRelative(0.81f, 4.865f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.985f, 1.164f)
                horizontalLineToRelative(-16.82f)
                arcToRelative(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, -7f)
                horizontalLineToRelative(9.8f)
            }
        }.build()

        return _Ironing!!
    }

@Suppress("ObjectPropertyName")
private var _Ironing: ImageVector? = null
