package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.ChevronDownLeft: ImageVector
    get() {
        if (_ChevronDownLeft != null) {
            return _ChevronDownLeft!!
        }
        _ChevronDownLeft = ImageVector.Builder(
            name = "Filled.ChevronDownLeft",
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
                verticalLineToRelative(8f)
                horizontalLineToRelative(8f)
            }
        }.build()

        return _ChevronDownLeft!!
    }

@Suppress("ObjectPropertyName")
private var _ChevronDownLeft: ImageVector? = null
