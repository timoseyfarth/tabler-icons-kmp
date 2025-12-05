package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.ArrowForwardUp: ImageVector
    get() {
        if (_ArrowForwardUp != null) {
            return _ArrowForwardUp!!
        }
        _ArrowForwardUp = ImageVector.Builder(
            name = "Filled.ArrowForwardUp",
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
                moveTo(15f, 14f)
                lineToRelative(4f, -4f)
                lineToRelative(-4f, -4f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19f, 10f)
                horizontalLineToRelative(-11f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, 8f)
                horizontalLineToRelative(1f)
            }
        }.build()

        return _ArrowForwardUp!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowForwardUp: ImageVector? = null
