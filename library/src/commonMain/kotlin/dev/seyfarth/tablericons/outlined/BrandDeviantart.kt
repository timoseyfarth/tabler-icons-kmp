package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.BrandDeviantart: ImageVector
    get() {
        if (_BrandDeviantart != null) {
            return _BrandDeviantart!!
        }
        _BrandDeviantart = ImageVector.Builder(
            name = "Filled.BrandDeviantart",
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
                moveTo(18f, 3f)
                verticalLineToRelative(4f)
                lineToRelative(-3.857f, 6f)
                horizontalLineToRelative(3.857f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-6.429f)
                lineToRelative(-2.571f, 4f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-4f)
                lineToRelative(3.857f, -6f)
                horizontalLineToRelative(-3.857f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(6.429f)
                lineToRelative(2.571f, -4f)
                close()
            }
        }.build()

        return _BrandDeviantart!!
    }

@Suppress("ObjectPropertyName")
private var _BrandDeviantart: ImageVector? = null
