package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.RubberStamp: ImageVector
    get() {
        if (_RubberStamp != null) {
            return _RubberStamp!!
        }
        _RubberStamp = ImageVector.Builder(
            name = "Filled.RubberStamp",
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
                moveTo(21f, 17.85f)
                horizontalLineToRelative(-18f)
                curveToRelative(0f, -4.05f, 1.421f, -4.05f, 3.79f, -4.05f)
                curveToRelative(5.21f, 0f, 1.21f, -4.59f, 1.21f, -6.8f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = true, isPositiveArc = true, 8f, 0f)
                curveToRelative(0f, 2.21f, -4f, 6.8f, 1.21f, 6.8f)
                curveToRelative(2.369f, 0f, 3.79f, 0f, 3.79f, 4.05f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5f, 21f)
                horizontalLineToRelative(14f)
            }
        }.build()

        return _RubberStamp!!
    }

@Suppress("ObjectPropertyName")
private var _RubberStamp: ImageVector? = null
