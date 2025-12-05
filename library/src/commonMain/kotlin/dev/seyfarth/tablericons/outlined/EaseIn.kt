package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.EaseIn: ImageVector
    get() {
        if (_EaseIn != null) {
            return _EaseIn!!
        }
        _EaseIn = ImageVector.Builder(
            name = "Filled.EaseIn",
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
                moveTo(3f, 20f)
                curveToRelative(8f, 0f, 18f, -16f, 18f, -16f)
            }
        }.build()

        return _EaseIn!!
    }

@Suppress("ObjectPropertyName")
private var _EaseIn: ImageVector? = null
