package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.ArrowLoopLeft: ImageVector
    get() {
        if (_ArrowLoopLeft != null) {
            return _ArrowLoopLeft!!
        }
        _ArrowLoopLeft = ImageVector.Builder(
            name = "Filled.ArrowLoopLeft",
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
                moveTo(13f, 21f)
                verticalLineToRelative(-13f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = true, isPositiveArc = true, 4f, 4f)
                horizontalLineToRelative(-13f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 16f)
                lineToRelative(-4f, -4f)
                lineToRelative(4f, -4f)
            }
        }.build()

        return _ArrowLoopLeft!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowLoopLeft: ImageVector? = null
