package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.Number2: ImageVector
    get() {
        if (_Number2 != null) {
            return _Number2!!
        }
        _Number2 = ImageVector.Builder(
            name = "Filled.Number2",
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
                moveTo(8f, 8f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = true, isPositiveArc = true, 8f, 0f)
                curveToRelative(0f, 1.098f, -0.564f, 2.025f, -1.159f, 2.815f)
                lineToRelative(-6.841f, 9.185f)
                horizontalLineToRelative(8f)
            }
        }.build()

        return _Number2!!
    }

@Suppress("ObjectPropertyName")
private var _Number2: ImageVector? = null
