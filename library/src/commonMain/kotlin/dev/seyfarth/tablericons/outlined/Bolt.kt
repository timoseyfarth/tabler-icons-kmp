package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.Bolt: ImageVector
    get() {
        if (_Bolt != null) {
            return _Bolt!!
        }
        _Bolt = ImageVector.Builder(
            name = "Filled.Bolt",
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
                moveTo(13f, 3f)
                lineToRelative(0f, 7f)
                lineToRelative(6f, 0f)
                lineToRelative(-8f, 11f)
                lineToRelative(0f, -7f)
                lineToRelative(-6f, 0f)
                lineToRelative(8f, -11f)
            }
        }.build()

        return _Bolt!!
    }

@Suppress("ObjectPropertyName")
private var _Bolt: ImageVector? = null
