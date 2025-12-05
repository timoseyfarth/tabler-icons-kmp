package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.PicnicTable: ImageVector
    get() {
        if (_PicnicTable != null) {
            return _PicnicTable!!
        }
        _PicnicTable = ImageVector.Builder(
            name = "Filled.PicnicTable",
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
                moveTo(16f, 7f)
                lineToRelative(2f, 9f)
                moveToRelative(-10f, -9f)
                lineToRelative(-2f, 9f)
                moveToRelative(-1f, -9f)
                horizontalLineToRelative(14f)
                moveToRelative(2f, 5f)
                horizontalLineToRelative(-18f)
            }
        }.build()

        return _PicnicTable!!
    }

@Suppress("ObjectPropertyName")
private var _PicnicTable: ImageVector? = null
