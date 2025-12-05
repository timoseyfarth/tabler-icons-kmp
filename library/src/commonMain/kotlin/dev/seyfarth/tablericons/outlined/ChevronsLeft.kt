package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.ChevronsLeft: ImageVector
    get() {
        if (_ChevronsLeft != null) {
            return _ChevronsLeft!!
        }
        _ChevronsLeft = ImageVector.Builder(
            name = "Filled.ChevronsLeft",
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
                moveTo(11f, 7f)
                lineToRelative(-5f, 5f)
                lineToRelative(5f, 5f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17f, 7f)
                lineToRelative(-5f, 5f)
                lineToRelative(5f, 5f)
            }
        }.build()

        return _ChevronsLeft!!
    }

@Suppress("ObjectPropertyName")
private var _ChevronsLeft: ImageVector? = null
