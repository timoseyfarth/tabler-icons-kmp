package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.Pill: ImageVector
    get() {
        if (_Pill != null) {
            return _Pill!!
        }
        _Pill = ImageVector.Builder(
            name = "Filled.Pill",
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
                moveTo(4.5f, 12.5f)
                lineToRelative(8f, -8f)
                arcToRelative(4.94f, 4.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 7f)
                lineToRelative(-8f, 8f)
                arcToRelative(4.94f, 4.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7f, -7f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8.5f, 8.5f)
                lineToRelative(7f, 7f)
            }
        }.build()

        return _Pill!!
    }

@Suppress("ObjectPropertyName")
private var _Pill: ImageVector? = null
