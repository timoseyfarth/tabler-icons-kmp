package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.BrandOffice: ImageVector
    get() {
        if (_BrandOffice != null) {
            return _BrandOffice!!
        }
        _BrandOffice = ImageVector.Builder(
            name = "Filled.BrandOffice",
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
                horizontalLineToRelative(9f)
                verticalLineToRelative(-12f)
                lineToRelative(-5f, 2f)
                verticalLineToRelative(5f)
                lineToRelative(-4f, 2f)
                verticalLineToRelative(-8f)
                lineToRelative(9f, -4f)
                lineToRelative(7f, 2f)
                verticalLineToRelative(13f)
                lineToRelative(-7f, 3f)
                close()
            }
        }.build()

        return _BrandOffice!!
    }

@Suppress("ObjectPropertyName")
private var _BrandOffice: ImageVector? = null
