package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.Flare: ImageVector
    get() {
        if (_Flare != null) {
            return _Flare!!
        }
        _Flare = ImageVector.Builder(
            name = "Filled.Flare",
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
                moveTo(12f, 3f)
                lineToRelative(3f, 6f)
                lineToRelative(6f, 3f)
                lineToRelative(-6f, 3f)
                lineToRelative(-3f, 6f)
                lineToRelative(-3f, -6f)
                lineToRelative(-6f, -3f)
                lineToRelative(6f, -3f)
                close()
            }
        }.build()

        return _Flare!!
    }

@Suppress("ObjectPropertyName")
private var _Flare: ImageVector? = null
