package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.BrandAppleNews: ImageVector
    get() {
        if (_BrandAppleNews != null) {
            return _BrandAppleNews!!
        }
        _BrandAppleNews = ImageVector.Builder(
            name = "Filled.BrandAppleNews",
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
                moveTo(4f, 14f)
                lineToRelative(6f, 6f)
                horizontalLineToRelative(-6f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20f, 10f)
                lineToRelative(-6f, -6f)
                horizontalLineToRelative(6f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4f, 4f)
                verticalLineToRelative(4f)
                lineToRelative(12f, 12f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-4f)
                lineToRelative(-12f, -12f)
                close()
            }
        }.build()

        return _BrandAppleNews!!
    }

@Suppress("ObjectPropertyName")
private var _BrandAppleNews: ImageVector? = null
