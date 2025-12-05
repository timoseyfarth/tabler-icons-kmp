package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.WaveSquare: ImageVector
    get() {
        if (_WaveSquare != null) {
            return _WaveSquare!!
        }
        _WaveSquare = ImageVector.Builder(
            name = "Filled.WaveSquare",
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
                moveTo(3f, 12f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-16f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(5f)
            }
        }.build()

        return _WaveSquare!!
    }

@Suppress("ObjectPropertyName")
private var _WaveSquare: ImageVector? = null
