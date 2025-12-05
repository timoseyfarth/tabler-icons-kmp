package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.BrandHtml5: ImageVector
    get() {
        if (_BrandHtml5 != null) {
            return _BrandHtml5!!
        }
        _BrandHtml5 = ImageVector.Builder(
            name = "Filled.BrandHtml5",
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
                moveTo(20f, 4f)
                lineToRelative(-2f, 14.5f)
                lineToRelative(-6f, 2f)
                lineToRelative(-6f, -2f)
                lineToRelative(-2f, -14.5f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15.5f, 8f)
                horizontalLineToRelative(-7f)
                lineToRelative(0.5f, 4f)
                horizontalLineToRelative(6f)
                lineToRelative(-0.5f, 3.5f)
                lineToRelative(-2.5f, 0.75f)
                lineToRelative(-2.5f, -0.75f)
                lineToRelative(-0.1f, -0.5f)
            }
        }.build()

        return _BrandHtml5!!
    }

@Suppress("ObjectPropertyName")
private var _BrandHtml5: ImageVector? = null
