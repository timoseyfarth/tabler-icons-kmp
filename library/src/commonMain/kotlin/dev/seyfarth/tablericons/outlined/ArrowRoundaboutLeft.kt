package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.ArrowRoundaboutLeft: ImageVector
    get() {
        if (_ArrowRoundaboutLeft != null) {
            return _ArrowRoundaboutLeft!!
        }
        _ArrowRoundaboutLeft = ImageVector.Builder(
            name = "Filled.ArrowRoundaboutLeft",
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
                moveTo(3f, 9f)
                horizontalLineToRelative(8f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 5f, 5f)
                verticalLineToRelative(7f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 5f)
                lineToRelative(-4f, 4f)
                lineToRelative(4f, 4f)
            }
        }.build()

        return _ArrowRoundaboutLeft!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowRoundaboutLeft: ImageVector? = null
