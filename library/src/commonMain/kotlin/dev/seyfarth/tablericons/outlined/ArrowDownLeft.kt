package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.ArrowDownLeft: ImageVector
    get() {
        if (_ArrowDownLeft != null) {
            return _ArrowDownLeft!!
        }
        _ArrowDownLeft = ImageVector.Builder(
            name = "Filled.ArrowDownLeft",
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
                moveTo(17f, 7f)
                lineToRelative(-10f, 10f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 17f)
                lineToRelative(-9f, 0f)
                lineToRelative(0f, -9f)
            }
        }.build()

        return _ArrowDownLeft!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowDownLeft: ImageVector? = null
