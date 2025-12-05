package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.Hexagons: ImageVector
    get() {
        if (_Hexagons != null) {
            return _Hexagons!!
        }
        _Hexagons = ImageVector.Builder(
            name = "Filled.Hexagons",
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
                moveTo(4f, 18f)
                verticalLineToRelative(-5f)
                lineToRelative(4f, -2f)
                lineToRelative(4f, 2f)
                verticalLineToRelative(5f)
                lineToRelative(-4f, 2f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 11f)
                verticalLineToRelative(-5f)
                lineToRelative(4f, -2f)
                lineToRelative(4f, 2f)
                verticalLineToRelative(5f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 13f)
                lineToRelative(4f, -2f)
                lineToRelative(4f, 2f)
                verticalLineToRelative(5f)
                lineToRelative(-4f, 2f)
                lineToRelative(-4f, -2f)
            }
        }.build()

        return _Hexagons!!
    }

@Suppress("ObjectPropertyName")
private var _Hexagons: ImageVector? = null
